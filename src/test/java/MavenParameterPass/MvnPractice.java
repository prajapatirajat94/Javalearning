package MavenParameterPass;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MvnPractice {

	// To run below test we need to use 
	//mvn -Dbrowser=chrome -Dweb=Rajat.com clean install 
	/*Steps
    1.create @Parameters({"browser","web"})
    2.then pass this parameter from command line as below:
    mvn -Dbrowser=chrome -Dweb=Rajat.com clean install 
    3.you can pass data to pom.xml file as well cover data with ${file} for xml file
    mvn -Dbrowser=chrome -Dweb=Rajat.com -Dfile=file1 clean install 
    4.if this browser properties available in pom.xml file then priority will be given to pom properties value
    
 
*/
	
   @Test
   @Parameters({"browser","web"})
	public void Testing(@Optional String browser,@Optional String WEb) {
	   
	   System.out.println("browser value is : ===>> "+browser);
	   System.out.println("web value is : ===>> "+WEb);
	   System.out.println("POM browser value is : ===>> "+System.getProperty("browser"));
	   
	   
		
	}
}
