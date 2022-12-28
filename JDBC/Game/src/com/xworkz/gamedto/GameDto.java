package com.xworkz.gamedto;

public class GameDto {
	
	private String name;
	private int noRound;
	private int noPlayer;
	private String time;
	
	
	
	public GameDto(String name, int noRound, int noPlayer, String time) {
		super();
		this.name = name;
		this.noRound = noRound;
		this.noPlayer = noPlayer;
		this.time = time;
	}
	@Override
	public String toString() {
		return "GameDto [name=" + name + ", noRound=" + noRound + ", noPlayer=" + noPlayer + ", time=" + time + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoRound() {
		return noRound;
	}
	public void setNoRound(int noRound) {
		this.noRound = noRound;
	}
	public int getNoPlayer() {
		return noPlayer;
	}
	public void setNoPlayer(int noPlayer) {
		this.noPlayer = noPlayer;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

}
