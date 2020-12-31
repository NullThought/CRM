package frame;

import javax.swing.*;

/**
 * @ClassName EmployeeFrame
 * @Description TODO
 * @Author MECHREVO
 * @Date 2020/12/30
 */
public class EmployeeFrame extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JTable table1;
    private JButton 基本信息Button;
    private JButton 业绩信息Button;
    private JButton 工作计划Button;
public EmployeeFrame(){
    this.setContentPane(panel1);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(900, 640);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
}

    public static void main(String[] args) {
    new EmployeeFrame();
    }
}
