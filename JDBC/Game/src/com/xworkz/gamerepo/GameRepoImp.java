package com.xworkz.gamerepo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.gamedto.GameDto;

public class GameRepoImp implements GameRepo{

	ArrayList<GameDto> list=new ArrayList<GameDto>();
	@Override
	public boolean save(GameDto dto) {
		System.out.println("Data Saving to Database");
		list.add(dto);
		System.out.println("Data saved Successfully");
		return true;
	}
	
	@Override
	public List<GameDto> read() {
		System.out.println("Data is Saved to Database");
		return list;
	}

	@Override
	public boolean findByNmae(String name) {
		System.out.println("Data Saving to Database");

		return true;
	}

	@Override
	public GameDto UpdateNameByIndex(String name, int index) {
		System.out.println("Data saving to Database");
		GameDto game=list.get(index);
		game.setName(name);
		list.add(index, game);
	
		return game;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data Saving to Database");
		list.remove(index);
		return false;
	}

	@Override
	public GameDto deleteByIndex(String name) {
	if(name!= null && name.length()>=3) {
	}
		return null;
	}

	

}
