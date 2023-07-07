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
                    		+ "Javalearning\\src\\test\\java\\JSonDataTransfer\\color.json"));
                  
                 // System.out.println(node.path(0).findPath("cars").size());
                  JsonNode AddNode=    node.path("ClientProfile").
                		  findPath("Clients").
                		  findPath("Client1")
                		  .findValue("Address");
                  for(int i=0;i<AddNode.size();i++) {
                	 String val= AddNode.get(i).asText();
                	 System.out.println(val);
                  }
                  JsonNode boD_Node=node.path("ClientProfile").path("Clients").path(0).path("Client2");//.path("Client1");
                  System.out.println(boD_Node);
                  DOB_VAL_From_Node(boD_Node);
//                  System.out.println( node.path("ClientProfile").path("AccountType").asText());
//                 
                  
                  
	}
	
	public static void DOB_VAL_From_Node(JsonNode nod) {
		
		System.out.println(nod.path("DOB").findPath("Date").asText());
		System.out.println(nod.path("DOB").findPath("Month").asText());
		System.out.println(nod.path("DOB").findPath("year").asText());
		
//		System.out.println(nod.path("DOB").path("Month").asText());
//		System.out.println(nod.path("DOB").path("year").asText());
		//nod.path("DOB").path("year").asText();
		
		
		
	}

}
