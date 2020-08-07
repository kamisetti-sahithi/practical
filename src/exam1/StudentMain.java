package exam1;
import java.util.*;
import java.util.Set;
import java.util.List;
import java.util.HashSet;

public class StudentMain {
	
	public static void main(String[] args) {
		StudentMain s=new StudentMain();
		s.runApp();
		}
	Set<Student> set=new HashSet<>();
	public void runApp() {
		
		Student s1=new Student("1A",20);
		set.add(s1);
		Student s2=new Student("1B",21);
		set.add(s2);
		Student s3=new Student("1C",22);
		set.add(s3);
		Student s4=new Student("1D",24);
		set.add(s4);
		
		}
		public List<Student> toList(Set<Student> set) {
			List<Student> list=new ArrayList<>();
			for(Student student:set) {
			if(student.getAge()>21) {
				list.add(student);
			}
			
		}
			return list;
		
		}
		
		}
		
		
		
		
		
		
		
				
				
	
	


