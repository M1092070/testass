package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CustomerData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Customer1> data=new ArrayList<>();
		data.add(new Customer1(1,23,1000,"ram"));
		data.add(new Customer1(2,25,2000,"sham"));
		data.add(new Customer1(3,27,1500,"gita"));
		data.add(new Customer1(4,33,3000,"divya"));
		data.add(new Customer1(5,31,3500,"sumit"));
		data.add(new Customer1(6,35,4000,"ganga"));
		data.add(new Customer1(7,20,4500,"ramesh"));
		data.add(new Customer1(8,26,6000,"nita"));
		data.add(new Customer1(9,23,5000,"raju"));
		data.add(new Customer1(10,29,8000,"nitya"));
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do
		{
			
			System.out.println("1)Display customer");
			System.out.println("2) Display all the customer by ascending order");
			System.out.println("3)Display purches amount by their ID");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the customer Id");
				for(Customer1 d: data)
				{
					System.out.println(d);
				}
				break;
				
			case 2:
				List<Customer1>l3=new ArrayList<>(data);
				
				Collections.sort(l3,new CustomerComparator());
				for(Customer1 d1:l3)
				{
					System.out.println(d1);
				}
				break;
				
			case 3:
				boolean found=false;
				System.out.println("Enter the customer ID for their updated purches amount");
				int id1=sc.nextInt();
				
				ListIterator<Customer1> l2=data.listIterator();
				while(l2.hasNext());
				{
					Customer1 d3 =l2.next();
					if(d3.getId()==id1)
					{
						System.out.println("Enter the age");
						int age=sc.nextInt();
						System.out.println("Enter the purches amount");
						double purchesamount=sc.nextDouble();
						System.out.println("Enter name of cutomer");
						String name=sc.next();
						
						l2.set(new Customer1(id1,age,purchesamount,name));
						found=true;
					}
					if(!found)
						System.out.println("Customer not found in the list");
					else
						System.out.println("Update is successful");
						
				}
				
			}
			
			
		}while(ch!=0);

	}

}
