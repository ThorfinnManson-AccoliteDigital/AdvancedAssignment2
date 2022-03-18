package LicenseReader;

import javax.xml.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "CSR_Report_Body")
//@XmlAccessorType(XmlAccessType.FIELD)
public class CSR_Report_Body
{
    private List<CSR_Producer> CSR_Producer;

    @XmlElement(name="CSR_Producer")
    public List<CSR_Producer> getCSR_Producer ()
    {
        return CSR_Producer;
    }

    public void setCSR_Producer (List<CSR_Producer> CSR_Producer)
    {
        this.CSR_Producer = CSR_Producer;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CSR_Producer = "+ CSR_Producer +"]";
    }
}
