package com.xworkz.instituterepo;

import java.util.List;

import com.xworkz.institutedto.InstituteDto;

public interface InstituteRepo {
	
	public boolean save(InstituteDto dto);
	public List<InstituteDto> read();
	public InstituteDto findByNameandCourse(String name,String Course);
	 public boolean updateLocationByIndex(String location,int index);
	 public boolean updateCourseByName(String course,String name);
	 public boolean deleteByrating(int rating);
	 public InstituteDto findBylocationandrating(String location,int rating);

}
