package com.masai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CRUDE {
	public static void main(String[] args) {
		List<Student> c = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("Hello Welcome Course monitoring System");
			System.out.println("=====================================");
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();	
			
			switch(ch) {
			case 1:
				System.out.print("Enter StuRoll : ");
				int sno = sc.nextInt();
				System.out.print("Enter StuName : ");
				String sname = sc1.nextLine();
				System.out.print("Enter StuFee : ");
				int sfee =sc.nextInt();
				System.out.print("Enter StuBatch : ");
				String sbatch = sc1.nextLine();
				
				c.add(new Student(sno,sname,sfee,sbatch));
				break;
				
			case 2:
				
				System.out.println("=====================================");
				Iterator<Student> i = c.iterator();
				while(i.hasNext()) {
					Student s = i.next();
					System.out.println(s);
				
				}
				System.out.println("=====================================");
				break;
				
			case 3:
				boolean flag = false;
				System.out.println("Enter Student RollNo to Search : ");
				int sNo = sc.nextInt();
				System.out.println("=====================================");
				 i = c.iterator();
				while(i.hasNext()) {
					Student s = i.next();
					if(s.getRoll()==sNo) {
						System.out.println(s);
						flag=true;
					}
				}
				
				if(flag==false) {
					System.out.println("Record Not found");
					
				}
				System.out.println("=====================================");
				break;
				
			case 4:
				flag = false;
				System.out.println("Enter Student RollNo to Delete : ");
				 sNo = sc.nextInt();
				System.out.println("=====================================");
				 i = c.iterator();
				while(i.hasNext()) {
					Student s = i.next();
					if(s.getRoll()==sNo) {
						i.remove();
						flag=true;
					}
				}
				
				if(flag==false) {
					System.out.println("Record Not found");
					
				}else {
					System.out.println("Record Deleted Successfully...!");
					
				}
				System.out.println("=====================================");
				break;
				
			case 5:
				flag = false;
				System.out.println("Enter Student RollNo to Update : ");
				 sNo = sc.nextInt();
				System.out.println("=====================================");
				ListIterator<Student> ls = c.listIterator();
				while(ls.hasNext()) {
					Student s = ls.next();
					if(s.getRoll()==sNo) {
						System.out.println("Enter New Student Name : ");
						sname = sc1.nextLine();
						
						System.out.println("Enter New Fees to Update : ");
						sfee = sc.nextInt();
						
						System.out.println("Enter New Course Name : ");
						sbatch = sc1.nextLine();
						
						ls.set(new Student(sNo,sname,sfee,sbatch));
					}
				}
				
				if(flag==false) {
					System.out.println("Record Not found");
					
				}else {
					System.out.println("Record Deleted Successfully...!");
					
				}
				System.out.println("=====================================");
				break;
			}
		}while(ch!=0) ;
			
		
	}

}
