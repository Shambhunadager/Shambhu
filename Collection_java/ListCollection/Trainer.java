package ListCollection;

public class Trainer {
	String name;
	String id;
	String trainer;

	public Trainer(String name,String id,String trainer) {
		this.name=name;
		this.trainer=trainer;
		this.id=id;
	}

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", id=" + id + ", trainer=" + trainer + "]";
	}

	
}
