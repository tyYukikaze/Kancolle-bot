/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kancollebot;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImageProc {
    
    void show(String fileName) throws Exception{
        BufferedImage capture = ImageIO.read(new File(fileName+".bmp"));
        ImageIcon icon = new ImageIcon(capture);
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(null,label);
    }
    
}
