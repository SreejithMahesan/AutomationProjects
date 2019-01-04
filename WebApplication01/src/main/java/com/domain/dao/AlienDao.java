package com.domain.dao;

import com.domain.Alien;

public class AlienDao
{
	Alien a;
	
	public Alien getAlien(int aid)
	{
		    a = new Alien();
			a.setAid(101);
			a.setAname("Sreejith");
			a.setTech("Java");
		
		
		return a;
		
	}

}
