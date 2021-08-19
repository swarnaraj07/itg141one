package com.example.demo.Arthamtic;

import org.springframework.stereotype.Service;

@Service
public class DemService {
	public int add1(Dem d)
	{
		return d.getStu()+d.getEmp();
	}

	
	

}
