package LicenseReader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//@XmlRootElement(name = "CSR_Producer")
//@XmlAccessorType(XmlAccessType.PROPERTY)
//@XmlType(propOrder = {"License", "Entity_Id", "NIPR_Number", "Secondary_ID"})
public class CSR_Producer
{
    private License[] License;

    private String Entity_Id;

    private String NIPR_Number;

    private String Secondary_ID;

    public License[] getLicense ()
    {
        return License;
    }

    public void setLicense (License[] License)
    {
        this.License = License;
    }

    public String getEntity_Id ()
    {
        return Entity_Id;
    }

    public void setEntity_Id (String Entity_Id)
    {
        this.Entity_Id = Entity_Id;
    }

    public String getNIPR_Number ()
    {
        return NIPR_Number;
    }

    public void setNIPR_Number (String NIPR_Number)
    {
        this.NIPR_Number = NIPR_Number;
    }

    public String getSecondary_ID ()
    {
        return Secondary_ID;
    }

    public void setSecondary_ID (String Secondary_ID)
    {
        this.Secondary_ID = Secondary_ID;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [License = "+License+", Entity_Id = "+Entity_Id+", NIPR_Number = "+NIPR_Number+", Secondary_ID = "+Secondary_ID+"]";
    }
}

