package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream file=new FileInputStream("C:\\Ripal\\QA\\XLSPropFile.properties");
		Properties prop=new Properties();
		prop.load(file);
		
		
		String r1=prop.getProperty("browser");
		System.out.println(r1);
		
		
		//write like this as well
		System.out.println(prop.getProperty("browser"));
		
		
		prop.setProperty("tool", "automation");
		System.out.println(prop.getProperty("tool"));
		
		
		FileOutputStream file2=new FileOutputStream("C:\\Ripal\\QA\\XLSPropFile.properties");
		prop.store(file2, "adding file");
		
	}

}
