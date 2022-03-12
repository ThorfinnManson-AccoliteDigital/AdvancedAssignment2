package LicenseReader;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "CSR_Report_Header")
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"TimeStamp_Created", "Title", "Report_Type"})
public class CSR_Report_Header implements Serializable
{
    //@XmlElement(name = "TimeStamp_Created")
    private String TimeStamp_Created;

    //@XmlElement(name = "Title")
    private String Title;

    //@XmlElement(name = "Report_Type")
    private String Report_Type;

    @XmlElement(name = "TimeStamp_Created", required = true)
    public String getTimeStamp_Created ()
    {
        return TimeStamp_Created;
    }

    public void setTimeStamp_Created (String TimeStamp_Created)
    {
        this.TimeStamp_Created = TimeStamp_Created;
    }

    @XmlElement(name = "Title", required = true)
    public String getTitle ()
    {
        return Title;
    }

    public void setTitle (String Title)
    {
        this.Title = Title;
    }

    @XmlElement(name = "Report_Type", required = true)
    public String getReport_Type ()
    {
        return Report_Type;
    }

    public void setReport_Type (String Report_Type)
    {
        this.Report_Type = Report_Type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TimeStamp_Created = "+TimeStamp_Created+", Title = "+Title+", Report_Type = "+Report_Type+"]";
    }
}