package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot lol = new Robot("batman");
	lol.penDown();

	lol.move(200);
	lol.turn(90);
lol.move(200);
lol.turn(90);
lol.move(200);
lol.turn(90);
lol.move(200);
lol.penUp();

	}
}
