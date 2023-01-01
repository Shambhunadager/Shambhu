package com.xworkz;

import com.xworkz.institutedto.InstituteDto;
import com.xworkz.instituteservice.InstituteService;
import com.xworkz.instituteservice.InstituteServiceImp;

public class InstituteRunner {
	public static void main(String args[]) {
		
		InstituteService service=new InstituteServiceImp();
		
		InstituteDto dto=new InstituteDto("XworkZ","BTM",5,20,"JavaDeveloper",4);
		InstituteDto dto1=new InstituteDto("CodeNext","JpNagar",6,80,"Javatesting",3);
		
		service.save(dto);
		service.read();
		
		service.findByNameandCourse("xworkz", "javatedeveloper");
		System.out.println(dto);
		
		service.findBylocationandrating("madival", 5);
		System.out.println(dto);
		
		System.out.println(service.updateLocationByIndex("RRNagar",0 ));
		System.out.println(dto);
		
		System.out.println(service.updateCourseByName("pad", "hhhigu"));
		System.out.println(dto);
		
		service.deleteByrating(0);
		System.out.println(dto);
		
		System.out.println(service.deleteByrating(5));
		System.out.println(dto);
		
		
		
	}

}
