package pack12;

import java.util.ArrayList;
import java.util.Set;

public class ArraylistDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(20);
		list1.add(25);
		list1.add(30);
		list1.add(35);
		list1.add(40);

		Integer num = list1.get(2);
		System.out.println("num : " + num);
		System.out.println("list1 : " + list1);

		Integer removedElement = list1.remove(1);
		System.out.println("removedElement : " + removedElement);
		System.out.println("list1 after removing element : " + list1);

		list1.set(2, 900);
		System.out.println("list1 after updating element : " + list1);

		System.out.println("Total num of elements in list :" + list1.size());

	}

}
