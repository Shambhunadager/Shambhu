package com.xworkz.Trainservice;

import java.util.List;

import com.xworkz.Traindto.TrainDto;
import com.xworkz.Trainrepo.TrainRepo;
import com.xworkz.Trainrepo.TrainRepoImp;
import com.xworkz.Traindto.TrainDto;
import com.xworkz.Traindto.TrainDto;

public class TrainServiceImp implements TrainService {

	TrainRepo repo= new TrainRepoImp();
	
	@Override
	public boolean save(TrainDto dto) {
		repo.save(dto);
		return true;
	}

	@Override
	public boolean UpdateNameBy(int index, String name) {
		if(name != null && name.length()>5);
		if(index>0) {
			repo.UpdateNameBy(index, name);
		}
		return false;
	}

	@Override
	public TrainDto DeleteByIndex(String name) {
		if(name !=null && name.length()>=3) {
			TrainDto Delete=repo.DeleteByIndex(name);
			return Delete;
		}
		return null;
	}

	@Override
	public TrainDto DeleteByIndex(int index) {
		System.out.println("Data is Validating and sending to Repo");
		if(index>=0) {
		TrainDto delete = DeleteByIndex(index);
		}
		return null;
	}

	@Override
	public TrainDto findByName(String name) {
		List<TrainDto> read=repo.read();
		 for(TrainDto dto:read) {
			 if(name != null) {
				 if(dto.getTrainName().equals(name) && dto.getTrainName().length()>=3);
				 System.out.println("Data being Validated");
				 return dto;
				} else {
					System.out.println("Invalid Data");
				}
			 }
		return null;
	}

	@Override
	public List<TrainDto> read() {
		System.out.println("Data is Validating and sending to Repo");
		return null;
	}

	

}
