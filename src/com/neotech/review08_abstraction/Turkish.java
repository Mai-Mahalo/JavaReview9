package com.neotech.review08_abstraction;

//Part 1-3

public class Turkish extends Human {

	public Turkish(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println(name + " syas Merhaba!");
		
	}

	public void makeBaklava()
	{
		System.out.println(name + "is makiing baklava!");
		
	}

}
