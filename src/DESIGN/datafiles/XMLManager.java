package DESIGN.datafiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/*
 *  EXAMPLE CODE FOR SAVING AND LOADING 
 */


public class XMLManager implements IFileManager{

	@Override
	public void saveGame(GameData game, String fileName) {
		
		// save to game.xml file
		fileName = "src/DESIGN/datafiles/game.xml";
		
		XStream mySerializer = new XStream(new DomDriver());
		FileOutputStream fos = null;
		try{            
			String xml = mySerializer.toXML(game);
			fos = new FileOutputStream(fileName);
			fos.write("<?xml version=\"1.0\"?>".getBytes("UTF-8"));
			byte[] bytes = xml.getBytes("UTF-8");
			fos.write(bytes);
		}catch (Exception e){
			System.err.println("Error in XML Write: " + e.getMessage());
		}
		finally{
			if(fos != null){
				try{
					fos.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public GameData loadGame(String fileName) throws GameFileException {

		// load from game.xml
		fileName = "src/DESIGN/datafiles/game.xml";
		
		XStream mySerializer = new XStream(new DomDriver());
		FileInputStream fis = null;
		try {
			fis = new FileInputStream (fileName);
			return (GameData) mySerializer.fromXML(fis);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if(fis != null){
				try{
					fis.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		throw new GameFileException();
	}

	@Override
	public void saveLevel(LevelData level, String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LevelData loadLevel(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveState(StateData state, String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StateData loadState(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

}
