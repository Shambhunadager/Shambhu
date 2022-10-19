package com.xworkz.core_java.inheritance.association.humanbody;

public class HumanHeart {
	public static void main(String[] args) {
		 
		
	Human heart=new Human();
	
  heart.heart=new Heart();

   
   
   System.out.println("Human bodyport:"+ heart.bodyport);
   System.out.println("Human temprature :"+heart.temprature);
   System.out.println("Human BloodPh :"+heart.BloodPh);
   System.out.println("Heart HeartBeat :"+heart.heart.HeartBeat);
   System.out.println("Heart Bloodpump :"+heart.heart.Bloodpump);
   	
		
	}

}
