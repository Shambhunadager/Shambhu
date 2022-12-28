package com.xworkz.Mobileservice;

import com.xworkz.Mobiledto.MobileDto;

public interface MobileService {
	
	public boolean save(MobileDto dto);

	public MobileDto UpdateNameByIndex(int index,String name);
	public boolean deleteByIndex(String name);
	public boolean deleteByIndex(int index);
	
	

}
