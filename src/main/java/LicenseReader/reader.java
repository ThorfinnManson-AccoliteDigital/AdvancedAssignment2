package LicenseReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class reader {

    public static void main(String[] args) {

        try
        {
            JAXBContext context = JAXBContext.newInstance(CSR_Report.class);
            Unmarshaller um = context.createUnmarshaller();
            CSR_Report report = (CSR_Report) um.unmarshal(new FileReader("C:\\Users\\thorf\\Documents\\_Work\\AdvancedJavaAssignment\\src\\main\\resources\\Licenses1.xml"));

            System.out.println(report);
        }
        catch (JAXBException | FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
