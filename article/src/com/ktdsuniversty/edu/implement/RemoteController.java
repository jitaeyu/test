package com.ktdsuniversty.edu.implement;

public interface RemoteController {
	
	void turnOn(TV tv);
	public abstract void turnOff(TV tv);//앞에꺼는 생략가능
	void changeChannel(TV tv,int channelNumber);
	void changeVolumn(TV tv,int volumn);


}
