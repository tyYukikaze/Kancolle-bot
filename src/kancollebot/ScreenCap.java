/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kancollebot;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.Robot;
import javax.imageio.*;
import java.io.File;
import java.util.Scanner;
        
public class ScreenCap {
    
    void ScreenCap(){
        System.out.println("ScreenCap called");
    }
    
    String capture() throws Exception{
        
        String fileName;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter File Name: ");
        fileName = in.nextLine();
        
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture, "bmp", new File(fileName+".bmp"));
        
        return fileName;
    }
    
}

