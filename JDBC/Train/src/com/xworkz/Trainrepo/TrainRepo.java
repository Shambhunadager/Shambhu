package com.xworkz.Trainrepo;

import java.util.List;

import com.xworkz.Traindto.TrainDto;

public interface TrainRepo {
	
	public boolean save(TrainDto dto);
	
	public boolean UpdateNameBy(int index,String name);

	
	public TrainDto DeleteByIndex(String name);

	public TrainDto DeleteByIndex(int index);
	
	public TrainDto findByName(String name);
	public List<TrainDto> read();
	
	
}

