package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	
	  public static String getProperty(String KeyValue) {
	
	FileReader data=null;
	  
	  try {
	    data=new FileReader("C:\\Users\\Shriyan\\eclipse-workspace\\MaySeleniumFramework\\src\\main\\java\\configuration\\configuration.properties");
	  } catch (FileNotFoundException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	   System.out.println("File is not present in this location");
	  }
	  
	  Properties p=new Properties();
	  
	  try {
	   p.load(data);
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  
	  System.out.println(p.getProperty("username"));
	  System.out.println(p.getProperty("password"));
	  System.out.println(p.getProperty("url"));

	  return p.getProperty(KeyValue);
	 }
}


