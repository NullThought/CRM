package frame;

import javax.swing.*;

/**
 * @ClassName MainPage
 * @Description TODO
 * @Author admin
 * @Date 2020/12/30
 **/
public class MainPage extends JFrame{
    private JPanel MainPage_mainPanel;

    public MainPage() {
        this.setTitle("登录");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 620);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainPage();
    }
}
