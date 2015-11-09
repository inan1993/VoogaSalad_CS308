package util.data.test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ActorSaver {
    private XStream mySerializer = new XStream(new DomDriver());
    
}
