package com.xworkz.carrepo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cardto.CarDto;

public class CarRepoImp implements CarRepo {
ArrayList<CarDto> list = new ArrayList<CarDto>();
	@Override
	public boolean save(CarDto dto) {
		System.out.println("Data Saving to Database");
		list.add(dto);
		System.out.println("Data saved Successfully");
		return true;
	}
	@Override
	public List<CarDto> read() {
		System.out.println("data is saved database");
		return list;
	}
	@Override
	public CarDto findBtName(String name) {
		System.out.println("data saveing to database");
		return null;
	}
	@Override
	public CarDto updateColourByIndex(String colour) {
		System.out.println("Data saving to Database");
		CarDto car=list.get(0);
		car.setColour(colour);
		list.add(car);
		return null;
		
	}
	@Override
	public CarDto updateSpeedByBrand(int speed, String brand) {
		System.out.println("Data saving to Database");
		CarDto car=list.get(0);
		list.add(car);
		return null;
	}
	@Override
	public CarDto updatePriceByType(int price, String name) {
		System.out.println("Data saving to Database");
		CarDto car=list.get(0);
		list.add(car);
		return null;
	}
	@Override
	public CarDto deleteByIndex(int index) {
		list.remove(0);
		System.out.println("data is deleted");
		
		return null;
	}
	@Override
	public CarDto deleteByBrandandcolour(String brand, String colour) {
		list.remove(0);
		System.out.println("data is deleted");
		return null;
	}
	

}
