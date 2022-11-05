package encapsulation;

public class StudentTest {

	public static void main(String args[]) {
		
	Student student=new Student();
	System.out.println(student.getName());
	
	student.setName("Ganesh");
	student.setUsn("4JN18EC001");
	student.setCollage("JNNCE");
	student.setAge(22);
	
	System.out.println("Studentname:"+ student.getName());
	System.out.println("Studentusn:"+ student.getUsn());
	System.out.println("Studentcollage:"+ student.getCollage());
	System.out.println("Studentage:"+ student.getAge());
	
		
		
	}
	
}
