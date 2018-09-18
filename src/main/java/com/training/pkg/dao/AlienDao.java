package com.training.pkg.dao;

import com.training.pkg.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int aid, String aname, String tech) 
	{
		Alien a=new Alien();
		a.setAid(aid);
		a.setAname(aname);
		a.setTech(tech);		
		return a;
	}

}
