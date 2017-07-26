import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
		 //here we are creating the object of Hashmap
	        HashMap<String, String> hashMap = new HashMap<String, String>();
	        //1.functionalities
	        //here we are  Putting the element in the hashset 
	        hashMap.put("Name", "Nitish Singh");
	        hashMap.put("Designation", "Trainee");
	        //2.functionalities
	        //here we are initializing the loop for retreving the key
	        for (Map.Entry<String, String> el : hashMap.entrySet()) {
	            String key = el.getKey();
	            System.out.println("Retrieving all the key:"+ key);//print statement
	        }
	        //3.functionalities 
	       //here we are initializing the loop for retreving the value
	        for (Map.Entry<String, String> el : hashMap.entrySet()) {
	            String value = el.getValue();
	            System.out.println("Retrieving all the Value:" + value);//print statement
	        }
             //4.functionalities
	        //here we are Synchronize hashmap 
	        Map<String, String> map = Collections.synchronizedMap(hashMap);

	        Set<java.util.Map.Entry<String, String>> set = map.entrySet();
	        synchronized (map) {
	            Iterator<java.util.Map.Entry<String, String>> i = set.iterator();
	            //here we are Displaying the elements 
	            while (i.hasNext()) {
	                java.util.Map.Entry<String, String> me =  i.next();
	                System.out.print(me.getKey() + ": ");//print statement
	                System.out.println(me.getValue());//print statement
	            }
	        }

	    }

}
