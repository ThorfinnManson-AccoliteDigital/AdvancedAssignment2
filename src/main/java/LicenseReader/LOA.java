package LicenseReader;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "LOA")
//@XmlAccessorType(XmlAccessType.FIELD)
public class LOA
{
    private String LOA_Issue_Date;

    private String LOA_Status;

    private String LOA_Name;

    @XmlAttribute(name = "LOA_Issue_Date", required = true)
    public String getLOA_Issue_Date ()
    {
        return LOA_Issue_Date;
    }

    public void setLOA_Issue_Date (String LOA_Issue_Date)
    {
        this.LOA_Issue_Date = LOA_Issue_Date;
    }

    @XmlAttribute(name = "LOA_Status", required = true)
    public String getLOA_Status ()
    {
        return LOA_Status;
    }

    public void setLOA_Status (String LOA_Status)
    {
        this.LOA_Status = LOA_Status;
    }

    @XmlAttribute(name = "LOA_Name", required = true)
    public String getLOA_Name ()
    {
        return LOA_Name;
    }

    public void setLOA_Name (String LOA_Name)
    {
        this.LOA_Name = LOA_Name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [LOA_Issue_Date = "+LOA_Issue_Date+", LOA_Status = "+LOA_Status+", LOA_Name = "+LOA_Name+"]";
    }
}
