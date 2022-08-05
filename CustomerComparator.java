package assignment2;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer1>{

	@Override
	public int compare(Customer1 o1, Customer1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
