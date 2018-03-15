import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class Bot {
	
	static Robot robot;
	static int mouseY, mouseX;
	static int X = 390, Y = 235;       //first profile coordinates

	
	public Bot() throws AWTException {
       
        robot = new Robot();
        
        
	}
	
	public void startLike(){
		
//       mouseY = MouseInfo.getPointerInfo().getLocation().y;
//       mouseX = MouseInfo.getPointerInfo().getLocation().x;
        
//       System.out.println(mouseX + "  " + mouseY);
	
       for ( int i = 0 ; i < 20 ; i++ ){
    	   followOneRow();
    	   Y += 22;
       }

	}
	
	public void followUser() {
	    robot.mouseMove(630, 215);                         //follow
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(300);
	    robot.mouseMove(700, 215);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK); 
	    robot.delay(300);
	    robot.mouseMove(800, 215); 
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK); 
	    robot.delay(500);
	}
	
	public void moveBackToList() {
		robot.mouseMove(15, 45);                        //move back to list
		robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(500);
	}
	
	public void followOneRow() {
		robot.mouseMove(X, Y);                       //moving to profile.
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(2600);
	    
		followUser();
		moveBackToList();

	    robot.mouseMove(X + 160, Y);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(2600);

	    followUser();
	    moveBackToList();
	    
	    robot.mouseMove(X + 320, Y);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(2600);

	    followUser();
	    moveBackToList();
	    
	    robot.mouseMove(X + 480, Y);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(2600);

	    followUser();
	    moveBackToList();
	    
	
	}
	
}