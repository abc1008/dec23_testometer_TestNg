package pack12;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> countryMap = new HashMap<>();
		
		countryMap.put("India", 6542);
		countryMap.put("Aus", 855);
		countryMap.put("NZ", 986);
		countryMap.put("Rome", 8892);
		countryMap.put("Russia", 2233);
		
		
		System.out.println("countryMap : "+countryMap);
		
		Integer data = countryMap.get("Aus");
		
		System.out.println("data from set : "+data);
		
		
		System.out.println("containsKey : " + countryMap.containsKey("Rome"));
		
		countryMap.put("Rome", 3220);
		System.out.println(countryMap.get("Rome"));
		System.out.println("countryMap after updating value : " + countryMap);
		
		countryMap.remove("India");
		System.out.println("countryMap after removing value : "+ countryMap);
		
		
		Set<String> allKeys = countryMap.keySet();
		
		System.out.println("allKeys using keySet : " +allKeys);
		
		
		
	}
	
	
	
	
	
	
	

}
