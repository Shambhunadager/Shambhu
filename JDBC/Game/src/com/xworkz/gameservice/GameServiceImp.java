package com.xworkz.gameservice;

import java.util.List;

import com.xworkz.gamedto.GameDto;
import com.xworkz.gamerepo.GameRepo;
import com.xworkz.gamerepo.GameRepoImp;

public class GameServiceImp implements GameService {

	GameRepoImp repo=new GameRepoImp();
	@Override
	public boolean save(GameDto dto) {
		System.out.println("Data is being Validated");
		if(dto != null && dto.getName().length()>=3) {
		System.out.println("Data is Valid and Sending to Repo");
		repo.save(dto);
		}else {
			System.out.println("Data Inavlid");
		}
		return true;
	}

	@Override
	public List<GameDto> read() {
		System.out.println("Data is Validating and sending to Repo");
		return repo.read();
	}


	@Override
	public GameDto findByName(String name) {
	 List<GameDto> read=repo.read();
	 for(GameDto dto:read) {
		 if(name != null) {
			 if(dto.getName().equals(name) && dto.getName().length()>=3);
			 System.out.println("Data being Validated");
			 return dto;
			} else {
				System.out.println("Invalid Data");
			}
		 }
	
		return null;
	
	}

	@Override
	public GameDto UpdateNmaeByIndex(String name, int index) {
		System.out.println("Data is being Validated");
		if(name != null && name.length()>=3) {
			GameDto Update= repo.UpdateNameByIndex(name, index);
			return Update;
		}
		return null;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data is Validating and sending to Repo");
		if(index>=0) {
		boolean delete = deleteByIndex(index);
		}
		return false;
	}

	@Override
	public GameDto deleteByIndex(String name) {
	if(name !=null && name.length()>=3) {
		GameDto Delete=repo.deleteByIndex(name);
		return Delete;
	}
		return null;
	}

}
