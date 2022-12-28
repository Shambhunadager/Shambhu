package com.xworkz.gamerepo;

import java.util.List;

import com.xworkz.gamedto.GameDto;

public interface GameRepo {
	
	public boolean save(GameDto dto);
	public List<GameDto> read();
	public boolean findByNmae(String name);
	public GameDto UpdateNameByIndex(String name,int index);
	public boolean deleteByIndex(int index);
	public GameDto deleteByIndex(String name);


}
