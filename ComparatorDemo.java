package colllectionLearning;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Laptop l1 = (Laptop) o1;
		Laptop l2 = (Laptop) o2;

		//if (l1.price > l2.price) {
			//return +1;
		//} else if (l1.price < l2.price) {
			//return -1;
		//} else {
			//if (l1.gb > l2.gb) {
				//return -1;
			//} else if (l1.gb < l2.gb) {
				//return +1;
			//}
		//}
		
		int result= l1.name.compareTo(l2.name);
		
		if(result>0) {
		return -1;
		}
		
		else if(result<0) {
			return +1;
		}
		else {
		return 0;
		}
		
		
		
		
		
		
		}

	}


