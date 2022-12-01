package ListCollection;

import java.util.ArrayList;

public class StudentDemo {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		Student suraj = new Student("Suraj", "s01", "JNNCE");
		Student rithesh = new Student("rithesh", "s02", "MPC");
		Student mohammed = new Student("Mohammed", "s03", "RIT");
		Student madhu = new Student("Madhu", "s04", "JNNCE");
		Student sharat = new Student("Sharat", "s05", "ATME");

		students.add(suraj);
		students.add(mohammed);
		students.add(rithesh);
		students.add(madhu);
		students.add(sharat);

		for (Student s : students) {
			if (s.college.equals("JNNCE")) {
  System.out.println(s);
			}

		}
		System.out.println(students.contains(sharat));
	}
}
