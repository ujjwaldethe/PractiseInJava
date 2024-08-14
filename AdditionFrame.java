package AdditionUsingGUI;
//Package Name Is Changeds
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class AdditionFrame extends JFrame{
    private JPanel panel;
    private JLabel L1;
    private JLabel L2;
    private JLabel L3;
    private JTextField T1;
    private JTextField T2;
    private JButton B1;

    public void initComponents()
    {
        panel.setLayout(null);
        L1.setBounds(50,50,100,20);
        T1.setBounds(170,50,100,20);
        L2.setBounds(50,100,100,20);
        T2.setBounds(170,100,100,20);
        B1.setBounds(130,150,100,40);
        L3.setBounds(150,230,200,20);
        panel.add(L1);
        panel.add(T1);
        panel.add(L2);
        panel.add(T2);
        panel.add(B1);
        panel.add(L3);
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                int a = Integer.parseInt(T1.getText());
                int b = Integer.parseInt(T2.getText());
                int c =  a + b ;
                L3.setText("Addition : "+c);
                }
                catch(Exception c)
                {
                    L3.setText("Number Tak Lawdya");
                }
            }
        });
    }
    public AdditionFrame()
    {
       initComponents();
       setContentPane(panel);
       setSize(400,400);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
