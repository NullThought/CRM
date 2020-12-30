package frame;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName ImagePanel
 * @Description TODO
 * @Author admin
 * @Date 2020/12/3
 **/
public class ImagePanel extends JPanel {
    private String filename;
    public void setFileName(String fileName){
        this.filename=fileName;
    }

    @Override
    public void paintComponent(Graphics g) {
       ImageIcon icon=new ImageIcon("src/main/resources/"+filename);
       Image image=icon.getImage();
       g.drawImage(image,0,0,this.getWidth(),this.getHeight(),icon.getImageObserver());
    }
}
