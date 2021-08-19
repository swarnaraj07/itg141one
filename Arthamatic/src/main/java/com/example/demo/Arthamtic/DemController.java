package com.example.demo.Arthamtic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemController {
	@Autowired
	DemService ds;
	
	@RequestMapping("/add")
	public int addition(@RequestBody Dem d)
	{
		int a = ds.add1(d);
		return a;
	}

}
