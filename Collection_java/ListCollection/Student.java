package ListCollection;

public class Student {
	String nanme;
	String id;
	String college;

	public Student(String name, String id, String college) {
		this.nanme = name;
		this.id = id;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [nanme=" + nanme + ", id=" + id + ", college=" + college + "]";
	}

}
