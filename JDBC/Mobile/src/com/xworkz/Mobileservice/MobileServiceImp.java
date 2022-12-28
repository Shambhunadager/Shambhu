package com.xworkz.Mobileservice;

import com.xworkz.Mobiledto.MobileDto;
import com.xworkz.Mobiledto.MobileDto;
import com.xworkzMobilerepo.MobileRepo;
import com.xworkzMobilerepo.MobileRepoImp;

public abstract class MobileServiceImp implements MobileService{

	MobileRepo repo = new MobileRepoImp();
	@Override
	public boolean save(MobileDto dto) {
		repo.save(dto);
		return true;
	}
	@Override
	public MobileDto UpdateNameByIndex(int index, String name) {
		System.out.println("Data is being Validated");
		if(name != null && name.length()>=3) {
			MobileDto Update= (MobileDto) repo.UpdateNameByIndex(name, index);
			return Update;
		}
		return null;
	}
	
	@Override
	public boolean deleteByIndex(String name) {
		if(name !=null && name.length()>=3) {
			MobileDto Delete=repo.deleteByIndex(name);
			return Delete != null;
		}
		return false;
	}
	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data is Validating and sending to Repo");
		if(index>=0) {
		boolean delete = deleteByIndex(index);
		}
		return false;
	}
}
