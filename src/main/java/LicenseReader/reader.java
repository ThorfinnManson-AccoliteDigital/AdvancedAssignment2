package LicenseReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class reader {
    static List<License> goodLicenses = new ArrayList<>();
    static List<License> badLicenses = new ArrayList<>();
    
    public static void main(String[] args) {
        String path1;
        String path2;
        if(args.length!=0){
            path1 = args[0];
            path2 = args[1];
        }
        else{
            path1 = "src/main/resources/Licenses1.xml";
            path2 = "src/main/resources/Licenses2.xml";
        }


        CSR_Report report1 = null;
        CSR_Report report2 = null;

        

        try
        {
            JAXBContext context = JAXBContext.newInstance(CSR_Report.class);
            Unmarshaller um = context.createUnmarshaller();
            report1 = (CSR_Report) um.unmarshal(new FileReader(path1));
            report2 = (CSR_Report) um.unmarshal(new FileReader(path2));
        }
        catch (JAXBException | FileNotFoundException e)
        {
            e.printStackTrace();
        }


        for (int i = 0; i < report1.getCSR_Report_Body().getCSR_Producer().size(); i++) {
            checkLicenses(report1.getCSR_Report_Body().getCSR_Producer().get(i));
        }
        for (int i = 0; i < report2.getCSR_Report_Body().getCSR_Producer().size(); i++) {
            checkLicenses(report2.getCSR_Report_Body().getCSR_Producer().get(i));
        }

        LicenseOutFile out1 = new LicenseOutFile();
        LicenseOutFile out2 = new LicenseOutFile();
        LicenseOutFile out3 = new LicenseOutFile();

        out1.setHolders(goodLicenses);
        out2.setHolders(badLicenses);
        List<License> anotherList = new ArrayList<License>();
        anotherList.addAll(goodLicenses);
        anotherList.addAll(badLicenses);
        out3.setHolders(anotherList);

        try {
            JAXBContext context = JAXBContext.newInstance(LicenseOutFile.class);
            Marshaller m = context.createMarshaller();
            m.marshal(out1, new FileOutputStream("./src/GoodLicenses.xml"));
            m.marshal(out2, new FileOutputStream("./src/BadLicenses.xml"));
            m.marshal(out3, new FileOutputStream("./src/AllLicenses.xml"));

        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void checkLicenses(CSR_Producer input){

        CSR_Producer curr = input;

        for (int i = 0; i < curr.getLicense().size(); i++) {
            String dateInString = curr.getLicense().get(i).getLicense_Expiration_Date();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
            LocalDate dateTime = LocalDate.parse(dateInString, formatter);
            LocalDate now = LocalDate.now();

            if(now.isBefore(dateTime)){
                goodLicenses.add(curr.getLicense().get(i));

            }
            else{
                badLicenses.add(curr.getLicense().get(i));

            }
        }

    }


}
