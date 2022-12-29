package com.xworkz;

import com.xworkz.cardto.CarDto;
import com.xworkz.carservice.CarService;
import com.xworkz.carservice.CarServiceImp;

public class CarRunner {
	public static void main(String agrs[]) {
		
		CarService service=new CarServiceImp();
		
		CarDto dto =new CarDto("Mahindra",1400000,"Block","Basic",60);
		CarDto dto1 =new CarDto("Hond",1100000,"Red","City",80);
		CarDto dto2 =new CarDto("Innova",1300000,"White","Top",70);
		CarDto dto3 =new CarDto("Toyota",1200000,"Green","Basic",65);
		CarDto dto4 =new CarDto("TatA",1000000,"Grey","Top",85);
		
		service.save(dto);
 	  //service.save(dto1);
	  //service.save(dto2);
	  //service.save(dto3);
	  //service.save(dto4);
		service.read();
		service.findBtName("Mahindra");
		service.updateColourByIndex("Block");
		service.updateSpeedByBrand(40, "Mahindra");
		service.updatePriceByType(1400000, "Basic");
		service.deleteByIndex(100);
		service.deleteByBrandandcolour("Hond", "Red");
		
	}

}
