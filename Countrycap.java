package collectionsconcept;
// program for Hashmap for country-capitals
import java.util.HashMap;

public class Countrycap {

	public static void main(String[] args) {
		
HashMap<String,String>cc=new HashMap<String,String>();
cc.put("india","delhi");
cc.put("japan","tokyo");
cc.put("sl","jk");
cc.put("pak","islam");
cc.put("sk","seol");
System.out.println(cc);
System.out.println(cc.keySet());
System.out.println(cc.values());
System.out.println(cc.containsKey("sl"));
System.out.println(cc.containsValue("seol"));
	}

}
