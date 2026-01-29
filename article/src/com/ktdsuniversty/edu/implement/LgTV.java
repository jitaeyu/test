package com.ktdsuniversty.edu.implement;

public class LgTV implements LgSmartTV {

	@Override
	public void turnOn() {

		System.out.println("LGturnOn");
	}

	@Override
	public void turnOff() {

		System.out.println("LGturnOff");
	}

	@Override
	public void changeChannel(int channelNumber) {

		System.out.println("LGchangeChannel");
	}

	@Override
	public void changeVolumn(int volumn) {

		System.out.println("LGchangeVolumn");
	}

	@Override
	public void runNetFlix() {
		System.out.println("LGrunNetFlix");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runInternet() {
		// TODO Auto-generated method stub

		System.out.println("LGrunInternet티빌를 켭니다");
	}

	@Override
	public void runYoutube() {
		// TODO Auto-generated method stub

		System.out.println("LGrunYoutube를 켭니다");
	}

}
