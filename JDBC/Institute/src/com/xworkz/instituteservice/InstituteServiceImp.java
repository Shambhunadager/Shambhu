package com.xworkz.instituteservice;

import java.util.List;

import com.xworkz.institutedto.InstituteDto;
import com.xworkz.instituterepo.InstituteRepo;
import com.xworkz.instituterepo.InstituteRepoImp;

public class InstituteServiceImp implements InstituteService {
	InstituteRepo repo=new InstituteRepoImp();

	@Override
	public boolean save(InstituteDto dto) {
		System.out.println("data is validation");
		repo.save(dto);
		return true;
	}

	@Override
	public List<InstituteDto> read() {
		System.out.println("data is validation and readmethod");
	
		return repo.read();
	}

	@Override
	public InstituteDto findByNameandCourse(String name, String Course) {
		List<InstituteDto> read=repo.read();
		for(InstituteDto dto:read) {
		if(name!=null && name.length()>=4) {
			
		if(dto.getName().equalsIgnoreCase(name) && dto.getCourse().equalsIgnoreCase(Course)) {
			
	        System.out.println("name is find");
					return repo.findByNameandCourse(name, Course);
					
				}else {
					System.out.println("name and course is Notfind");
					
				}
			
				
			}
		}
				
			
		return null;
	}
	
	
	@Override
	public InstituteDto findBylocationandrating(String location, int rating) {
	if(location!=null && location.length()>=8) {
		if(rating>=2 && rating<=8) {
			return repo.findBylocationandrating(location, rating);
		}
	}
		return null;
	}

	@Override
	public boolean updateLocationByIndex(String location, int index) {
      if(location!= null && location.length()>=7) {
    	  repo.updateLocationByIndex(location, index);
      }
		return true;
	}

	@Override
	public boolean updateCourseByName(String course, String name) {
		if(course !=null && course.length()>=15) {
			if(name !=null && name.length()>=7) {
				repo.updateCourseByName(course, name);
				return true;
			}
		
		}
		return false;
	

	}

	@Override
	public boolean deleteByrating(int rating) {
	if(rating>=0) {
		repo.deleteByrating(rating);
		
	}
	return true;

	}

	

}
