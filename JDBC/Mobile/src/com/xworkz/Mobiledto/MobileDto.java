package com.xworkz.Mobiledto;

public class MobileDto {
	
	private String name;
	private int price;
	private int Screensize;
	private int Ram;
	private boolean Dualcamera;
	
	
	
	public MobileDto(String name, int price, int screensize, int ram, boolean dualcamera) {
		super();
		this.name = name;
		this.price = price;
		Screensize = screensize;
		Ram = ram;
		Dualcamera = dualcamera;
	}
	@Override
	public String toString() {
		return "MobileDto [name=" + name + ", price=" + price + ", Screensize=" + Screensize + ", Ram=" + Ram
				+ ", Dualcamera=" + Dualcamera + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getScreensize() {
		return Screensize;
	}
	public void setScreensize(int screensize) {
		Screensize = screensize;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public boolean isDualcamera() {
		return Dualcamera;
	}
	public void setDualcamera(boolean dualcamera) {
		Dualcamera = dualcamera;
	}

}
