package frame;

import sun.java2d.cmm.lcms.LCMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @ClassName Login
 * @Description TODO
 * @Author admin
 * @Date 2020/12/29
 **/
public class Login extends JFrame {
    private JPanel Login_main_center;
    private ImagePanel jp1;
    private ImagePanel1 jp2=new ImagePanel1();
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
        jp1.setFileName("background_picture.png");
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
        Login_main_center_panel1_textField1.setText("请输入用户名");
        Login_main_center_panel1_textField1.setForeground(Color.LIGHT_GRAY);
        Login_main_center_panel1_passwordField1.setEchoChar('\0');
        Login_main_center_panel1_passwordField1.setText("请输入密码");
        Login_main_center_panel1_passwordField1.setForeground(Color.LIGHT_GRAY);
        Login_main_center_panel1_button1.addActionListener(e ->{
             new MainPage();
        });
        Login_main_center_panel1_textField1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(Login_main_center_panel1_textField1.getText().trim().equals("请输入用户名")){
                    Login_main_center_panel1_textField1.setText("");
                    Login_main_center_panel1_textField1.setForeground(Color.black);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
               if(Login_main_center_panel1_textField1.getText().trim().equals("")){
                   Login_main_center_panel1_textField1.setText("请输入用户名");
                   Login_main_center_panel1_textField1.setForeground(Color.LIGHT_GRAY);
               }
            }
        });
        Login_main_center_panel1_passwordField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                String pswd=new String(Login_main_center_panel1_passwordField1.getPassword()).trim();
                if(pswd.equals("请输入密码")){
                    Login_main_center_panel1_passwordField1.setEchoChar('☆');
                    Login_main_center_panel1_passwordField1.setText("");
                    Login_main_center_panel1_passwordField1.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                String pswd=new String(Login_main_center_panel1_passwordField1.getPassword()).trim();
                if(pswd.equals("")){
                    Login_main_center_panel1_passwordField1.setEchoChar('\0');
                    Login_main_center_panel1_passwordField1.setText("请输入密码");
                    Login_main_center_panel1_passwordField1.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Login();
    }
}
