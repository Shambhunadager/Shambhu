package com.xworkz.instituterepo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.institutedto.InstituteDto;

public class InstituteRepoImp implements InstituteRepo {
	ArrayList<InstituteDto> list= new ArrayList<InstituteDto>();

	@Override
	public boolean save(InstituteDto dto) {
     System.out.println("data saving to database");
     list.add(dto);
     System.out.println("data is saved...");
		return false;
	}

	@Override
	public List<InstituteDto> read() {
		System.out.println("data is reading process...");
		return list;
	}

	@Override
	public InstituteDto findByNameandCourse(String name, String Course) {
		for(InstituteDto dto:list) {
			if(dto.getName().equalsIgnoreCase(name) && dto.getCourse().equalsIgnoreCase(Course)) {
				
				System.out.println("name and course is finded sucessfull....");
				return dto;
			}
		}
		
		
		return null;
	}
	
	@Override
	public InstituteDto findBylocationandrating(String location, int rating) {
	for(InstituteDto dto:list) {
		if(dto.getLocation().equalsIgnoreCase(location)) {
			if(rating>=4 && rating<=9) {
				System.out.println(dto);
			}
		}
	}
		return null;
	}


	@Override
	public boolean updateLocationByIndex(String location, int index) {
		InstituteDto dto=list.get(index);
		dto.getLocation();
			dto.setLocation(location);
			list.set(index, dto);
		System.out.println("update is sucessfull....");
		return true ;
	}

	@Override
	public boolean updateCourseByName(String course, String name) {
		for(int i = 0;i <list.size();i++) {
			InstituteDto dto=list.get(i);
			if(dto.getCourse().equalsIgnoreCase(course) && dto.getName().equalsIgnoreCase(name)) {
				dto.setCourse(course);
				dto.setName(name);
				list.set(i, dto);
			
			}
		}
		System.out.println("update is sucessfull......");
		return true;
	}

	@Override
	public boolean deleteByrating(int rating) {
		Iterator<InstituteDto> Dto=list.iterator();
		while (Dto.hasNext()) {
			InstituteDto dto=Dto.next();
				list.remove(rating);
				System.out.println("remove is sucessfull......");
				return true;
			}
		
		
		return false;
	}



	

}
