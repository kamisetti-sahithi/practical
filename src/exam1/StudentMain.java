package exam1;
import java.util.*;

import exam1.Student;


public class StudentMain {
	public static void main(String[] args) {
		StudentMain s=new StudentMain();
		s.fun();
		


	}
	public void fun() {
		Set<Student> Set=new HashSet<>();
		Student s1=new Student("1A",20);
		Set.add(s1);
		Student s2=new Student("1B",21);
		Set.add(s2);
		Student s3=new Student("1C",22);
		Set.add(s3);
		Student s4=new Student("1D",24);
		Set.add(s4);
		Iterator<Student>iterator=Set.iterator();
		while(iterator.hasNext()) {
			Student student=iterator.next();
			
			if(student.getAge()>21) {
				System.out.println("age");
				
			}
			System.out.println("rollno is"+student.getRollno()+" "+"age is"+student.getAge())
;		
		


			
			
			
		}
		
		}
		
		
		
		
		
				
				
	}
	


