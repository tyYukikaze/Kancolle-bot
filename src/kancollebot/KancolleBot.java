/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kancollebot;

public class KancolleBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        ScreenCap screenCap = new ScreenCap();
        
        System.out.println("Welcome to Kancolle-bot");
        
        screenCap.capture();
        
        System.out.println("end");
    }
    
}

