package com.xworkzMobilerepo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.Mobiledto.MobileDto;

public class MobileRepoImp implements MobileRepo {

	ArrayList<MobileDto> list= new ArrayList<MobileDto>();
	@Override
	public boolean save(MobileDto dto) {
		list.add(dto);
		return true;
	}
	


	
	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data Saving to Database");
		list.remove(index);
		return false;
	}
	@Override
	public MobileDto deleteByIndex(String name) {
		if(name!= null && name.length()>=3) {
		}
		return null;
	}
	



	@Override
	public MobileDto UpdateNameByIndex(String name, int index) {
		MobileDto returnedDto=list.get(index);
		list.set(index, returnedDto);
		return null;
	}




		
}
