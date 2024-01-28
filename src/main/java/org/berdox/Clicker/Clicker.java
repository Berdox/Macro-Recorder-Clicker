package org.berdox.Clicker;

import java.awt.*;

public class Clicker {


    public static void ClickerStart(int numberofClicks, double seconds, int button, int x, int y) throws AWTException {
       try {
           Robot robot = new Robot();
           // Set the mouse cursor's position
           if(x > -1 || y > -1) {
               robot.mouseMove(x, y);
           }

           //Converts seconds to milliseconds
           long milliSeconds = (long) seconds * 1000;

           for(int i = 0; i < numberofClicks; i++) {
               System.out.println("pressed");
               robot.mousePress(button);
               robot.mouseRelease(button);
               Thread.sleep(milliSeconds);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

}
