package LicenseReader;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//@XmlRootElement(name = "CSR_Report_Body")
//@XmlType(propOrder = {"CSR_Producer"})
public class CSR_Report_Body
{
    private CSR_Producer[] CSR_Producer;

    public CSR_Producer[] getCSR_Producer ()
    {
        return CSR_Producer;
    }

    public void setCSR_Producer (CSR_Producer[] CSR_Producer)
    {
        this.CSR_Producer = CSR_Producer;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CSR_Producer = "+CSR_Producer+"]";
    }
}
