package com.xworkz.gamedto;

import com.xworkz.gameservice.GameService;
import com.xworkz.gameservice.GameServiceImp;

public class GameRunner {
	public static void main(String[] args) {
		
		GameService service=new GameServiceImp();
		
		GameDto dto=new GameDto("kabbadi",2,9,"20 Min");
	}

}
