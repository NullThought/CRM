package frame;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName ImagePanel1
 * @Description TODO
 * @Author admin
 * @Date 2020/12/30
 **/
public class ImagePanel1 extends JPanel {
    private String filename;
    public void setFileName(String fileName){
        this.filename=fileName;
    }

    @Override
    public void paintComponent(Graphics g) {
        ImageIcon icon=new ImageIcon("src/main/resources/Login_background1.png");
        Image image=icon.getImage();
        g.drawImage(image,0,0,this.getWidth(),this.getHeight(),icon.getImageObserver());
    }
}