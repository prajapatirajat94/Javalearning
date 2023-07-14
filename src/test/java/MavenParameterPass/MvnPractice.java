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
    4.
    case1: run from local:-
    if this browser properties value available in pom.xml file then priority will be given to pom properties value
    case2. run from maven:-if parameter avaialble in .xml file then priority will be given to .xml file
         and system value will come through maven->pom.xml variables. and override pom.xml value
    
    
 
*/
	
   @Test
   @Parameters({"BROWSER","WEB"})
	public void Testing(@Optional String browser,@Optional String Web) {
	   
	   System.out.println("browser value is : ===>> "+browser);
	   System.out.println("web value is : ===>> "+Web);
	   System.out.println("POM browser value is : ===>> "+System.getProperty("browser"));
	   System.out.println("POM web value is : ===>> "+System.getProperty("web"));
	   
	   
		
	}
}
