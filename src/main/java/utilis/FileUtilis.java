package utilis;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import constant.FileConstant;
import io.restassured.internal.support.FileReader;

public class FileUtilis {
	public static String readPropertiesFile(String path, String key) throws IOException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}

	
	/**
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String readUserMenuTestData(String key) throws IOException 
	{
		File f=new File(FileConstant.USER_MENU_PATH);
	    FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);

		
	}


	public static void copyFile(File src, File dst) {
		// TODO Auto-generated method stub
		
	}
}
