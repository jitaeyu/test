package com.ktdsuniversty.edu.implement;

public interface TV {
	
	void turnOn();
	public abstract void turnOff();//앞에꺼는 생략가능
	void changeChannel(int channelNumber);
	void changeVolumn(int volumn);

}
