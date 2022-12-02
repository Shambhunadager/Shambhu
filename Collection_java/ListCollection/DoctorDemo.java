package ListCollection;

import java.util.ArrayList;

public class DoctorDemo {
	public static void main(String[] args) {

		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		Doctor sunil = new Doctor("sunil", "p01", "Pediatrition");
		Doctor kiran = new Doctor("kiran", "p02", "Cardiologist");
		Doctor punith = new Doctor("punith", "p03", "Nuerologist");
		Doctor manju = new Doctor("manju", "p04", "Gynacologist");
		Doctor shridhar = new Doctor("shridhar", "p05", "Physcian");

		doctors.add(sunil);
		doctors.add(kiran);
		doctors.add(shridhar);
		doctors.add(manju);
		doctors.add(punith);

		for (Doctor d : doctors) {
			if (d.equals(shridhar)) {
				System.out.println(d);
			}
		}

		System.out.println(doctors.contains(kiran));
	}
}