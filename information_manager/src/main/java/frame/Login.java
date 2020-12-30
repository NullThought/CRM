package frame;

import sun.java2d.cmm.lcms.LCMS;

import javax.swing.*;

/**
 * @ClassName Login
 * @Description TODO
 * @Author admin
 * @Date 2020/12/29
 **/
public class Login extends JFrame {
    private JPanel Login_main_center;
    private ImagePanel jp1;
    private JPanel Login_main_top;
    private JPanel Login_main_left;
    private JPanel Login_main_right;
    private JPanel Login_main_bottom;
    private JLabel Login_main_center_label1;
    private JPanel Login_main_center_panel1;
    private JButton Login_main_center_panel1_button1;
    private JLabel Login_main_center_label2;
    private JTextField Login_main_center_panel1_textField1;
    private JPasswordField Login_main_center_panel1_passwordField1;

    public Login() {
        jp1.setFileName("st_dianqi1.jpg");
        this.setTitle("登录");
        this.setContentPane(jp1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 620);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Login_main_bottom.setOpaque(false);
        Login_main_top.setOpaque(false);
        Login_main_left.setOpaque(false);
        Login_main_right.setOpaque(false);
        Login_main_center.setOpaque(false);
    }

    public static void main(String[] args) {
        new Login();
    }
}
