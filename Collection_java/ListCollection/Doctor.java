package ListCollection;

public class Doctor {
	String name;
	String id;
	String Specialist;

	public Doctor(String name, String id, String Specialist) {
		this.name = name;
		this.id = id;
		this.Specialist = Specialist;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", Specialist=" + Specialist + "]";
	}

}
