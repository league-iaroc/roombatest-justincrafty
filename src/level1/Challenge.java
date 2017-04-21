package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(400,500);
sleep(3400);
driveDirect(500,500);
sleep(4000);
driveDirect(400,500);
sleep(2000);
		
		
		
	}

	public void loop() {
	
	}
}
