package frame;

import javax.swing.*;

/**
 * @ClassName Customer
 * @Description TODO
 * @Author MECHREVO
 * @Date 2020/12/30
 */
public class Customer {
    private JPanel customerPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JPanel centerPanel;
    private JTextField textField1;
    private JButton button1;
    private JLabel welLabel;
    private JButton 基本信息Button;
    private JButton 消费情况Button;
    private JTable table1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Customer");
        frame.setContentPane(new Customer().customerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
