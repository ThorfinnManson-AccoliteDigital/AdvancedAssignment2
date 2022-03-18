package LicenseReader;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "License")
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(propOrder = {"State_Code", "Resident_Indicator", "License_Class_Code", "License_Number", "State_ID", "License_Issue_Date", "License_Status", "License_Class", "License_Expiration_Date", "Date_Status_Effective", "LOA"})
public class License
{
    private String State_Code;

    private String Resident_Indicator;

    private String License_Class_Code;

    private String License_Number;

    private String State_ID;

    private String License_Issue_Date;

    private String License_Status;

    private String License_Class;

    private String License_Expiration_Date;

    private String Date_Status_Effective;

    private LOA[] LOA;

    @XmlAttribute(name = "State_Code", required = true)
    public String getState_Code ()
    {
        return State_Code;
    }

    public void setState_Code (String State_Code)
    {
        this.State_Code = State_Code;
    }

    @XmlAttribute(name = "Resident_Indicator", required = true)
    public String getResident_Indicator ()
    {
        return Resident_Indicator;
    }

    public void setResident_Indicator (String Resident_Indicator)
    {
        this.Resident_Indicator = Resident_Indicator;
    }

    @XmlAttribute(name = "License_Class_Code", required = true)
    public String getLicense_Class_Code ()
    {
        return License_Class_Code;
    }

    public void setLicense_Class_Code (String License_Class_Code)
    {
        this.License_Class_Code = License_Class_Code;
    }

    @XmlAttribute(name = "License_Number", required = true)
    public String getLicense_Number ()
    {
        return License_Number;
    }

    public void setLicense_Number (String License_Number)
    {
        this.License_Number = License_Number;
    }

    @XmlAttribute(name = "State_ID", required = true)
    public String getState_ID ()
    {
        return State_ID;
    }

    public void setState_ID (String State_ID)
    {
        this.State_ID = State_ID;
    }

    @XmlAttribute(name = "License_Issue_Date", required = true)
    public String getLicense_Issue_Date ()
    {
        return License_Issue_Date;
    }

    public void setLicense_Issue_Date (String License_Issue_Date)
    {
        this.License_Issue_Date = License_Issue_Date;
    }

    @XmlAttribute(name = "License_Status", required = true)
    public String getLicense_Status ()
    {
        return License_Status;
    }

    public void setLicense_Status (String License_Status)
    {
        this.License_Status = License_Status;
    }

    @XmlAttribute(name = "License_Class", required = true)
    public String getLicense_Class ()
    {
        return License_Class;
    }

    public void setLicense_Class (String License_Class)
    {
        this.License_Class = License_Class;
    }

    @XmlAttribute(name = "License_Expiration_Date", required = true)
    public String getLicense_Expiration_Date ()
    {
        return License_Expiration_Date;
    }

    public void setLicense_Expiration_Date (String License_Expiration_Date)
    {
        this.License_Expiration_Date = License_Expiration_Date;
    }

    @XmlAttribute(name = "Date_Status_Effective", required = true)
    public String getDate_Status_Effective ()
    {
        return Date_Status_Effective;
    }

    public void setDate_Status_Effective (String Date_Status_Effective)
    {
        this.Date_Status_Effective = Date_Status_Effective;
    }

    @XmlElement(name="LOA")
    public LOA[] getLOA ()
    {
        return LOA;
    }

    public void setLOA (LOA[] LOA)
    {
        this.LOA = LOA;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [State_Code = "+State_Code+", Resident_Indicator = "+Resident_Indicator+", License_Class_Code = "+License_Class_Code+", License_Number = "+License_Number+", State_ID = "+State_ID+", License_Issue_Date = "+License_Issue_Date+", License_Status = "+License_Status+", License_Class = "+License_Class+", License_Expiration_Date = "+License_Expiration_Date+", Date_Status_Effective = "+Date_Status_Effective+", LOA = "+LOA+"]";
    }
}