package LicenseReader;
import java.io.Serializable;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "CSR_Report")
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"CSR_Report_Body", "CSR_Report_Header"})
public class CSR_Report implements Serializable
{
    private CSR_Report_Body CSR_Report_Body;

    private CSR_Report_Header CSR_Report_Header;

    @XmlElement(name = "CSR_Report_Body", required = true)
    public CSR_Report_Body getCSR_Report_Body ()
    {
        return CSR_Report_Body;
    }

    public void setCSR_Report_Body (CSR_Report_Body CSR_Report_Body)
    {
        this.CSR_Report_Body = CSR_Report_Body;
    }

    @XmlElement(name = "CSR_Report_Header",required = true)
    public CSR_Report_Header getCSR_Report_Header ()
    {
        return CSR_Report_Header;
    }

    public void setCSR_Report_Header (CSR_Report_Header CSR_Report_Header)
    {
        this.CSR_Report_Header = CSR_Report_Header;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CSR_Report_Body = "+CSR_Report_Body+", CSR_Report_Header = "+CSR_Report_Header+"]";
    }
}