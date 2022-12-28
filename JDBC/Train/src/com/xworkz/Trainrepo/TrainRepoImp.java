package com.xworkz.Trainrepo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.Traindto.TrainDto;

public class TrainRepoImp implements TrainRepo {

	ArrayList<TrainDto> train=new ArrayList<TrainDto>();
	@Override
	public boolean save(TrainDto dto) {
		train.add(dto);
		System.out.println(train);
		return true;
	}
	@Override
	public boolean UpdateNameBy(int index, String name) {
		TrainDto returnedDto=train.get(index);
		returnedDto.setTrainName(name);
		train.set(index, returnedDto);

		return true;
	}
	@Override
	public TrainDto DeleteByIndex(String name) {
		if(name!= null && name.length()>=3) {
		}
		return null;
	}
	@Override
	public TrainDto DeleteByIndex(int index) {
		System.out.println("Data Saving to Database");
		train.remove(index);
		return null;
	}
	@Override
	public TrainDto findByName(String name) {
		System.out.println("Data Saving to Database");
		return null;
	}
	@Override
	public List<TrainDto> read() {
		System.out.println("Data is Saved to Database");
		return train;
	}

}
