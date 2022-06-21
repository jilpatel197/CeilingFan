package com.jil.CeilingFan;
import static com.jil.CeilingFan.Direction.Up;
import static com.jil.CeilingFan.Direction.Down;

public class Fan {
	
	static int off = 0;
	int speed = off;
	Direction dir = Up;
	
	public int getSpeed() {
		return speed;
	}
	
	public Direction getDir() {
		return dir;
		
	}
	
	public void speedUp() {
		if (speed == 3) {
			speed = off;
		}
		else {
			speed++;
		}
	}
	
	public void revDir() {
		if(dir == Up) {
			dir = Down;
		}
		else {
			dir = Up;
		}
	}
	
	@Override
	public String toString() {
		return "Fan [speed=" + speed + ", dir=" + dir + "]";
	}
	
}
