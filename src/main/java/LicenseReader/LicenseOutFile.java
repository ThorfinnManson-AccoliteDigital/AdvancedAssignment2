package LicenseReader;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class LicenseOutFile {
    List<License> Holders = new ArrayList<>();



    public void setHolders(List<License> holders) {
        Holders = holders;
    }

    @XmlElement
    public List<License> getHolders() {
        return Holders;
    }
}
