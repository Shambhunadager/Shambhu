package MethodOverriding.education;

public class Education {
	public static void main(String[] args) {
		
		School school=new School();
		Govt govt=new Govt();
		English english=new English();
		
		System.out.println(school.noOfStudent());
		System.out.println(govt.noOfStudent());
		System.out.println(english.noOfStudent());
		
	}

}
