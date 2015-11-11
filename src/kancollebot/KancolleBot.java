/*Kancolle Bot's main
*/
package kancollebot;

public class KancolleBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        ScreenCap screenCap = new ScreenCap();
        ImageProc imageProc = new ImageProc();
        
        String fileName;
        
        System.out.println("Welcome to Kancolle-bot");
        
        fileName = screenCap.capture();
        imageProc.show(fileName);
        
        System.out.println("end");
    }
    
}

