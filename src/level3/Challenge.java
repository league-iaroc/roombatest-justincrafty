package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	
	}

	public void loop() {
	driveDirect(470,500);
	sleep(2500);
	driveDirect(200,500);
	sleep(500);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(500,200);
	sleep(500);
	driveDirect(500,500);
	sleep(1000);
	driveDirect(500,200);
	sleep(500);
	driveDirect(200,500);
	sleep(1000);
	driveDirect(500,450);
	sleep(1500);
	driveDirect(500,200);
	
	}
}
