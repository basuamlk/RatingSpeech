package Project;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Created by yassin on 2/16/17.
 */
public class Images {

    public static void main(String[] args) throws IOException{

        String path = "http://apimeme.com/meme?meme=Condescending+Wonka&top=Top+text&bottom=Bottom+text";
        URL url = new URL(path);
        BufferedImage image = ImageIO.read(url);
        JLabel label = new JLabel(new ImageIcon(image));
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(200, 200);
        f.setVisible(true);
    }
}

// todo will show an image
//    String path = "http://chart.finance.yahoo.com/z?s=GOOG&t=6m&q=l";
//    URL url = new URL(path);
//    BufferedImage image = ImageIO.read(url);
//    JLabel label = new JLabel(new ImageIcon(image));
//    JFrame f = new JFrame();
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                f.getContentPane().add(label);
//                f.pack();
//                f.setLocation(200,200);
//                f.setVisible(true);



//todo will show an image
 //  new Images();
//    }
//
//    public Images() {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//                }
//
//                try {
//                    String path = "http://apimeme.com/meme?meme=Condescending+Wonka&top=Top+text&bottom=Bottom+text";
//                    System.out.println("Get Image from " + path);
//                    URL url = new URL(path);
//                    BufferedImage image = ImageIO.read(url);
//                    System.out.println("Load image into frame...");
//                    JLabel label = new JLabel(new ImageIcon(image));
//                    JFrame f = new JFrame();
//                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                    f.getContentPane().add(label);
//                    f.pack();
//                    f.setLocation(200, 200);
//                    f.setVisible(true);
//                } catch (Exception exp) {
//                    exp.printStackTrace();
//                }
//
//            }
//        });
