package amazontest.basicutils;


	
	import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

	/**
	 * 
	 * @author Anvita N
	 *
	 */

	
	public class FileUtils {		
		
	/*****
	 * 
	 * @param path
	 * @param key	
	 * @return
	 * @throws IOException
	 */

		public String getDataFromProperties(String key) throws IOException
		{
			FileInputStream f= new FileInputStream("./src/main/resources/properties/commondata.properties");
			Properties p= new Properties();
			p.load(f);
			 
			return p.getProperty(key);
			
		}
		

		
		
		
	}

	
	
	
	