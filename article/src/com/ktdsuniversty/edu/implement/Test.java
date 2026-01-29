package com.ktdsuniversty.edu.implement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LgSmartTV lgtv = new LgTV();
//		lgtv.turnOn();
//		lgtv.turnOff();
//		lgtv.runNetFlix();
		
		LgRempteController lgRemoteCon = new LgSmartRemoteController();
		lgRemoteCon.turnOn(lgtv);
		lgRemoteCon.runYoutube(lgtv);
		SamsungSmartTV samsungTV = new SamsungTV();
		lgRemoteCon.turnOn(samsungTV);
		SamsungRemoteController samsungRemoteCon = new SamsungSmartRemoteController();
		samsungRemoteCon.runCoupangPlay(samsungTV);
//		samsungRemoteCon.runNetflix(lgtv);
//		
//		samsungTV.runMenu();
//		samsungTV.changeChannel(0);
	}

}
