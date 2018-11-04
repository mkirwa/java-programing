//Dictionaries and Hashmaps in Java
//Dictionaries don’t really exist in java
//it’s an abstract class and so other
//things are called. So instead we use maps.  
import java.util.*;
public class DictionaryPractise{

	public static void main(String[]args){
		//english to spanis dictionary
		//the first string is string because string is the data type 
		//for the key. The second string is string because the data type
		//for the value is String 
		Map<String, String> engspandictionary = new HashMap<String, String>();
		//inserting keys and values into the library
		engspandictionary.put("Monday","Lunes");
		engspandictionary.put("Tuesday","Martes");
		engspandictionary.put("Wednesday","Miercoles ");
		engspandictionary.put("Thursday","Juves");
		engspandictionary.put("Friday","Viernes");

		System.out.println(engspandictionary.get("Monday"));
		System.out.println(engspandictionary.get("Tuesday"));
		System.out.println(engspandictionary.get("Wednesday"));
		System.out.println(engspandictionary.get("Thursday"));
		System.out.println(engspandictionary.get("Friday"));		
	}
}