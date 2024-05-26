package pack12;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set1 =new HashSet<>();
		
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(60);
		set1.add(30);
		set1.add(80);
		set1.add(90);
		set1.add(50);
		
		System.out.println("set1 : " + set1);
		
		for( Integer num : set1)
		{
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		 boolean isPresent = set1.contains(90);
		System.out.println("isPresent : "+isPresent);
		
		
		 boolean isRemoved = set1.remove(6000);
		System.out.println("isRemoved : " +isRemoved);
		
		System.out.println("set1 after removing element : " +set1);
		
		System.out.println("size of set : " +set1.size());
		
	}

}
