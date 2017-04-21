package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
driveDirect(500,500);
sleep(1000);
driveDirect(450,500);
sleep(2000);
driveDirect(300,500);
sleep(900);
driveDirect(500,500);
sleep(3000);
driveDirect(0,0);
driveDirect(500,400);

	}

	public void loop() {
	
	}
}
