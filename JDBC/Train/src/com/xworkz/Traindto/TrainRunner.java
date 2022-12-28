package com.xworkz.Traindto;

import com.xworkz.Trainservice.TrainService;
import com.xworkz.Trainservice.TrainServiceImp;

public class TrainRunner {
	public static void main(String args[]) {

	TrainService service= new TrainServiceImp();
	TrainDto dto = new TrainDto("Ranichanamma",1000,true,"Haveri","Hubbali");
	TrainDto dto1 = new TrainDto("Hubbali",2000,false,"Ranebannuru","Davanageri");
	
	
	
	}
}
