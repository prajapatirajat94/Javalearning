package JSonDataTransfer;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileDataTransfer {

	public static void main(String[] args) throws IOException {
                    ObjectMapper  Ob_MP =  new ObjectMapper();
                  JsonNode node=  Ob_MP.readTree(new File("C:\\Users\\praja\\eclipse-workspace\\"
                    		+ "Javalearning\\src\\test\\java\\JSonDataTransfer\\ONB.json"));
                  
                  System.out.println(node.path(0).findPath("cars").size());
                  int s=node.path(0).findPath("cars").size();
                  System.out.println(s);
                  for(int i=0;i<s;i++) {
                	  System.out.println(node.path(0).findPath("cars").get(i).asText());
                  }
              


	}

}
