package ListCollection;

import java.util.ArrayList;

public class TrainerDemo {
	public static void main(String[] args) {

		ArrayList<Trainer> students = new ArrayList<Trainer>();
		 Trainer suraj = new  Trainer("Suraj", "s01", "Asha");
		 Trainer rithesh = new  Trainer("rithesh", "s02", "Vinay");
		 Trainer mohammed = new  Trainer("Mohammed", "s03", "Rajesh");
		 Trainer madhu = new  Trainer("Madhu", "s04", "Sunil");
		 Trainer sharat = new  Trainer("Sharat", "s05", "Asha");
		 Trainer shambhu = new  Trainer("shambhu", "s06", "Omkar");
		 Trainer Bharat = new  Trainer("Bharat", "s07", "Asha");
		 Trainer Sampati = new  Trainer("Sampati ", "s08", "Asha");
		 Trainer  Someshwari = new Trainer("Someshwari ", "s09", "Vinay");

		students.add(suraj);
		students.add(Bharat);
		students.add(rithesh);
		students.add(mohammed);
		students.add(shambhu);
		students.add(sharat);
		students.add(Someshwari);
		students.add(Sampati);
		students.add(madhu);

		for (Trainer s : students) {
			if (s.equals(suraj)) {
				System.out.println(s);

			}
		}
		System.out.println(students.contains(Bharat));

	}
}