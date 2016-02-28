// Michael Benson
// Section 10
// Lab practical practice

import java.awt.*;

public class pract1 extends Animator {

	// set sizes and positions
	private final int width = 590;
	private final int surface = 223;
	private final int center = width/2;

	// set sizes of rectangles
	private final int buildingWidth = 200;
	private final int buildingHeight = 100;
	private final int boxSize= 40;
			   
	// set size of person (oval)
	private final int personWidth = 20;
	private final int personHeight = 50;
    
	// set circle position, direction, and size
	private int circleOffset = 0; // starts circle in middle
	private int circleDirection = 1; // starts circle moving right
	private final int circleDiameter = 10;
	
        public void draw(int x, int y, Graphics g) {

	
	    // draw the building
	    g.setColor(Color.black);
	    g.fillRect(center-buildingWidth/2,surface-buildingHeight,buildingWidth,buildingHeight);

	    // draw a person
	    g.setColor(Color.blue);
	    g.fillOval(x-personWidth/2,surface-personHeight,personWidth,personHeight);

	    // draw a door
	    g.setColor(Color.gray);
	    g.fillRect(center-boxSize/2,surface-boxSize,boxSize,boxSize);
			    
	    // draw the circle on the roof
	    g.setColor(Color.red);
	    g.fillOval(center+circleOffset-circleDiameter/2,surface-buildingHeight-circleDiameter,circleDiameter,circleDiameter);

	    // move the circle
	    circleOffset = circleOffset + circleDirection; 
	    if (circleDirection == 1) { // if moving right 
		if (circleOffset > buildingWidth/2) { 
		    // start moving left
		    circleDirection = -1;
		    circleOffset = circleOffset - 2;
		    }
		}
	    else { // if moving left
		if (circleOffset < -buildingWidth/2) {
		    // start moving right
		    circleDirection = 1;
		    circleOffset = circleOffset + 2;
		    }
		};
		    



	} // end of drw method

    } // end of example class
