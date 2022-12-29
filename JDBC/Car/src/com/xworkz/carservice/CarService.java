package com.xworkz.carservice;

import java.util.List;

import com.xworkz.cardto.CarDto;

public interface CarService {
	public boolean save(CarDto dto);  
	
	public List<CarDto>read();
	public CarDto findBtName(String name);
	public CarDto updateColourByIndex(String colour);
	public CarDto updateSpeedByBrand(int speed,String brand);
	public CarDto updatePriceByType(int price,String name);
	public CarDto deleteByIndex(int index);
	public CarDto deleteByBrandandcolour(String brand,String colour);

}
 