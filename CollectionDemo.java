package colllectionLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('a');
		Collections.sort(al);
		//System.out.println(al);
		//System.out.println(Collections.binarySearch(al, 'e'));
		
		Laptop dell=new Laptop("Inspiron",45000,8,true);
		Laptop lenova=new Laptop("Ideapad",50000,6,false);
		Laptop hp=new Laptop("ak",40000,8,true);
		
		ArrayList laptopList= new ArrayList();
		laptopList.add(dell);
		laptopList.add(lenova);
		laptopList.add(hp);
		Comparator cb =new ComparatorDemo();
		Collections.sort(laptopList,cb);
		System.out.println(laptopList);

	}

}
