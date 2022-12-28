package com.xworkz.Mobiledto;

import com.xworkz.Mobileservice.MobileService;
import com.xworkz.Mobileservice.MobileServiceImp;

public class MobileRunner {
	public static void main(String args[]) {
	
	
	MobileService service=new MobileServiceImp();
	
	MobileDto dto=new MobileDto("Samsung",15000,5,32,false);
	
	
	}
}
