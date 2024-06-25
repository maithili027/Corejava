package anudeep;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
	public static void main(String[] args) {
        //Create an ArrayList
		ArrayList list=new ArrayList();
		//adding elements to arraylist
		list.add(3);
		list.add(4);
		list.add(5);
		list.add('a');
		list.add(3.24);
		list.add("java");
		//printing the list
		System.out.println(list);
         list.add(true);
         //adding element 2 at index 1
         list.add(1,2);
         //printing arralist
     	System.out.println(list);
       //seting the third element to 2
		list.set(3, 2);
		System.out.println(list);
		//adding more elements to arraylist
         list.add(3);
         list.add(4);
         //printing index of element 3
		System.out.println(list.indexOf('3'));
		//checking if list contains the element 1 or not
		System.out.println(list.contains(1));
		//printing the element at index 0
		System.out.println(list.get(0));
		//printing the last index of element 10
		System.out.println(list.lastIndexOf(10));
		list.add(null);
		//printing the list size
		System.out.println(list.size());
		//removing the element 3 from arraylist
		System.out.println(list.remove(3));
		System.out.println(list);
		//checking if the list is empty or not
		System.out.println(list.isEmpty());
		//creating new array list
		List l=new ArrayList();
		System.out.println(l.isEmpty());
		//adding elements to list
		l.add(l);
		l.add(2);
		l.add(3);
		//printing list
		l.addAll(list);
	}
}
