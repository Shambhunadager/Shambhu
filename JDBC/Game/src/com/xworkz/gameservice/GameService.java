package com.xworkz.gameservice;

import java.util.List;

import com.xworkz.gamedto.GameDto;

public interface GameService {
	
	public boolean save(GameDto dto);
	public List<GameDto>read();
	public GameDto findByName(String name);
	public GameDto UpdateNmaeByIndex(String name,int index);
	public boolean deleteByIndex(int index);
	public GameDto deleteByIndex(String name);

	

}
