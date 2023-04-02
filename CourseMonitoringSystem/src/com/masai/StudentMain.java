package com.masai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentMain{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		int ch = -1;
		Scanner s= new Scanner(System.in); //integer
		Scanner s1 = new Scanner(System.in); //string
		File file = new File("student.txt");
		ArrayList<Student> al = new ArrayList<Student>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois =null;
		ListIterator li = null;
		
		if(file.isFile()) {
		ois = new ObjectInputStream(new FileInputStream(file));
		al = (ArrayList<Student>) ois.readObject();
		ois.close();
	}
		do {
			System.out.println("1.ADMIN && INSERT");
			
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("0.Exit");
			System.out.println("Enter Your Choice : ");
			ch = s.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("Enter the userId : ");
				String uid = s1.nextLine();
				System.out.print("Enter the Password : ");
				String upass = s1.nextLine();
				if(uid.equals("admin") && upass.equals("123456")) {
					System.out.println("Login Successfully...!");
					System.out.print("Enter How many Student you want to add : ");
					int n  =s.nextInt();
					
					for(int i=0; i<n; i++) {
						System.out.print("Enter Student Roll : ");
						int sno = s.nextInt();
						System.out.print("Enter Student Name : ");
						String sname = s1.nextLine();
						System.out.print("Enter Student Email : ");
						String semail = s1.nextLine();
						
						System.out.print("Enter Student Fee : ");
						int sfee =s.nextInt();
						System.out.print("Enter Student Batch : ");
						String sbatch = s1.nextLine();
						
						al.add(new Student(sno,sname,semail,sfee,sbatch));
						
					}
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
					break;
				}else {
					System.out.println("Wrong Credential...!");
					
				}
				
				case 2:
				if(file.isFile()) {
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
				
					System.out.println("--------------------------------------------------------");
					li = al.listIterator();
					while(li.hasNext()) 
						
						System.out.println(li.next());
					
					System.out.println("-------------------------------------------------------");
				}else {
					System.out.println("File not Exists...!");
				}
				break;
				
				case 3:
				if(file.isFile()) {
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
					boolean flag = false;
					System.out.println("Enter Student RollNo to Search : ");
					int sno = s.nextInt();
					System.out.println("-------------------------------------------------------");
					 li = al.listIterator();
					while(li.hasNext()) {
						Student e = (Student) li.next();
						if(e.getRoll()==sno) {
							System.out.println(e);
							flag=true;
						}
					}
					
					if(flag==false) {
						System.out.println("Record Not found...!");
						
					}
					
				}else {
					System.out.println("File not Exists...!");
					
				}
				
				System.out.println("-------------------------------------------------------");
				break;
				
				case 4:
				if(file.isFile()) {
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
					boolean flag = false;
					System.out.print("Enter Student RollNo to Delete : ");
					int sno = s.nextInt();
					System.out.println("-------------------------------------------------------");
					 li = al.listIterator();
					while(li.hasNext()) {
						Student e = (Student) li.next();
						if(e.getRoll()==sno) {
							li.remove();
							flag=true;
						}
					}
					
					if(flag==true) {
						oos = new ObjectOutputStream(new FileOutputStream(file));
						oos.writeObject(al);
						oos.close();
						System.out.println("Record deleted Successfully...!");
						
					}else {
						System.out.println("Record Not found...!");
					}
					System.out.println("-------------------------------------------------------");
					
				}else {
					System.out.println("File not Exists...!");
				}
				break;
				
				case 5:
				if(file.isFile()) {
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
					boolean flag = false;
					System.out.print("Enter Student RollNo to Update : ");
					int sno = s.nextInt();
					System.out.println("-------------------------------------------------------");
					 li = al.listIterator();
					while(li.hasNext()) {
						Student e = (Student) li.next();
						if(e.getRoll()==sno) {
							System.out.print("Enter New Student Name : ");
							 String sname = s1.nextLine();
							
							System.out.print("Enter New Student Email : ");
							String semail = s1.nextLine();
							
							
							System.out.print("Enter New Fees to Update : ");
							 int sfee = s.nextInt();
							
							System.out.print("Enter New Course Name : ");
							String sbatch = s1.nextLine();

							li.set(new Student(sno,sname,semail,sfee,sbatch));
							flag=true;
						}
					}
					
					if(flag==true) {
						oos = new ObjectOutputStream(new FileOutputStream(file));
						oos.writeObject(al);
						oos.close();
						System.out.println("Record Updated Successfully...!");
						
					}else {
						System.out.println("Record Not found...!");
					}
					System.out.println("-------------------------------------------------------");
					
				}else {
					System.out.println("File not Exists...!");
				}
				break;
				
			}
			
		}while(ch!=0);
	}
	
}

