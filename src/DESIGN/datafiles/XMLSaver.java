package DESIGN.datafiles;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public abstract class XMLSaver {
	private XStream mySerializer;
	
	public XMLSaver () {
		mySerializer = new XStream(new DomDriver());
	}
	
	public void save (Serializable s) {
		String serializedActor = mySerializer.toXML(s);
        System.out.println(serializedActor);
	}
}
