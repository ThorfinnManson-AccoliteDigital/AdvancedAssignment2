package LicenseReader;

import javax.xml.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "CSR_Producer")
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(propOrder = {"License", "Entity_Id", "NIPR_Number", "Secondary_ID"})
public class CSR_Producer
{
    public CSR_Producer() {
    }

    public CSR_Producer(CSR_Producer copy) {
        this.setLicense(copy.getLicense());
        this.setEntity_Id(copy.getEntity_Id());
        this.setNIPR_Number(copy.getNIPR_Number());
        this.setSecondary_ID(copy.getSecondary_ID());
    }

    @XmlElement(name="License")
    private List<License> License;

    private String Entity_Id;

    private String NIPR_Number;

    private String Secondary_ID;

    public List<License> getLicense ()
    {
        return License;
    }

    public void setLicense (List<License> License)
    {
        this.License = License;
    }

    @XmlAttribute(name = "Entity_Id", required = true)
    public String getEntity_Id ()
    {
        return Entity_Id;
    }

    public void setEntity_Id (String Entity_Id)
    {
        this.Entity_Id = Entity_Id;
    }

    @XmlAttribute(name = "NIPR_Number", required = true)
    public String getNIPR_Number ()
    {
        return NIPR_Number;
    }

    public void setNIPR_Number (String NIPR_Number)
    {
        this.NIPR_Number = NIPR_Number;
    }

    @XmlAttribute(name = "Secondary_ID", required = true)
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
        return "ClassPojo [License = "+ License +", Entity_Id = "+Entity_Id+", NIPR_Number = "+NIPR_Number+", Secondary_ID = "+Secondary_ID+"]";
    }
}

