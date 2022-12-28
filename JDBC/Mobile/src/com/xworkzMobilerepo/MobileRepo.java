package com.xworkzMobilerepo;

import com.xworkz.Mobiledto.MobileDto;

public interface MobileRepo {
	public boolean save(MobileDto dto);
	public MobileDto UpdateNameByIndex(String name,int index);
	public MobileDto deleteByIndex(String name);
	public boolean deleteByIndex(int index);

	
	
	

}
