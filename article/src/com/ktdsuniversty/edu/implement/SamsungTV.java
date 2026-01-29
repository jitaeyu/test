package com.ktdsuniversty.edu.implement;



/**
 * 
 * */
public class SamsungTV implements SamsungSmartTV{

	@Override
	public void turnOn() {
		System.out.println("삼성티빌를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("삼성티비를 끕니다");
		
	}

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("삼성티비의 채널을 바꿉니다");
	}

	@Override
	public void changeVolumn(int volumn) {
		System.out.println("삼성티비의 볼륨을 바꿉니다");
	}

	@Override
	public void runNetflix() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비의 넷플릭스를 킵니다");
	}

	@Override
	public void runMenu() {
		System.out.println("삼성티비의 메뉴");
	}

	@Override
	public void runCoupangPlay() {
		System.out.println("삼성티비의 쿠플실행");
	}

}
