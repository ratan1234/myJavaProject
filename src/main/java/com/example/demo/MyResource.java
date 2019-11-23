package com.example.demo;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

	@RequestMapping("heros")
	public ArrayList<String> getHeros()
	{
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Srini"); l.add("Ratan"); l.add("Jathin");
		return l;
	}
}
