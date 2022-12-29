package com.xworkz.carservice;

import java.util.List;

import com.xworkz.cardto.CarDto;
import com.xworkz.carrepo.CarRepo;
import com.xworkz.carrepo.CarRepoImp;

public class CarServiceImp implements CarService {

 CarRepo repo= new CarRepoImp();
	@Override
	public boolean save(CarDto dto) {
		System.out.println("Data is being Validated");
		repo.save(dto);
		return true;
	}
	@Override
	public List<CarDto> read() {
		System.out.println("data is validated and sendiing to repo");
	
		return repo.read();
	}
	@Override
	public CarDto findBtName(String name) {
	List<CarDto> read= repo.read();
	for(CarDto dto:read) {
		if(name!= null ) {
			if(dto.getBrand().equals(name) && dto.getBrand().length()>=3) {
				System.out.println("date is valid");
				return dto;
			}else {
				System.out.println("data is invalid");
			}
		}
	}
		return null;
	}
	@Override
	public CarDto updateColourByIndex(String colour) {
		System.out.println("Data is being Validated");
		if(colour!=null && colour.length()>=3) {
			CarDto Update=repo.updateColourByIndex(colour);
			return Update;
			
		}
		return null;
	}
	@Override
	public CarDto updateSpeedByBrand(int speed, String brand) {
		System.out.println("Data is being Validated");
		if(brand!=null && brand.length()>=3) {
			CarDto Update=repo.updateSpeedByBrand(speed, brand);
			return Update;
		}
		return null;
	}
	@Override
	public CarDto updatePriceByType(int price, String name) {
		System.out.println("Data is being Validated");
		if(name != null && name.length()>=3) {
			CarDto Update=repo.updatePriceByType(price, name);
			return Update;  
		}
		
		return null;
	}
	@Override
	public CarDto deleteByIndex(int index) {
		System.out.println("Data is being Validated");
		repo.deleteByIndex(index);
		return null;
	}
	@Override
	public CarDto deleteByBrandandcolour(String brand, String colour) {
		System.out.println("Data is being Validated");
		repo.deleteByBrandandcolour(brand, colour);
		return null;
	}
	

}
