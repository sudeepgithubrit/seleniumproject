package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfile {
	public static void main(String[] args) throws IOException {
		File src = new File("./config.properties");
		FileInputStream fis= new FileInputStream(src);
		Properties obj = new Properties();
		obj.load(fis);
		System.out.println(obj.getProperty("name"));
		
	}
}
