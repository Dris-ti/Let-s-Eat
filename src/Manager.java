import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Manager implements ActionListener{

    String name;
    JFrame oF = new JFrame("Manager page");
    JLabel oL = new JLabel();
    JLabel oL1 = new JLabel("Write New name :");
    JTextField ot= new JTextField();
    JPanel oP =new JPanel();
    JButton oB1,oB2,oB3,oB4,oB5,oB7,oB6;

    void BOption(JButton b)
    {
       // b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.BLACK);
        b.setFocusable(false);
        b.setFont(new Font("null", Font.BOLD, 25));
    }
    Manager()
    {
        oB1 =new JButton("Change Food Price");
        oB2 = new JButton("Change Staff Details");
        oB3 =new JButton("Change Restaurant Name");
        oB4 = new JButton("Total Sell Amount");
        oB7 = new JButton("Set Name");
        oB5 = new JButton("Back");
        oB6 = new JButton("Clear");

        //oB5= new JButton("Add Staff");
        //oB6= new JButton("Add Food");
        BOption(oB1);
        BOption(oB2);
        BOption(oB3);
        BOption(oB4);
        BOption(oB7);
        BOption(oB5);
        BOption(oB6);

        oB1.addActionListener((ActionListener) this);
        oB2.addActionListener((ActionListener) this);
        oB3.addActionListener((ActionListener) this);
        oB4.addActionListener((ActionListener) this);
        ot.addActionListener((ActionListener) this);
        oB7.addActionListener((ActionListener) this);
        oB5.addActionListener((ActionListener) this);
        oB6.addActionListener((ActionListener) this);



        oP.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));

        oF.add(oB1);
        oB1.setBounds(320,10,300,50);
        oF.add(oB2);
        oB2.setBounds(630,10,300,50);
        oF.add(oB3);
        oB3.setBounds(940,10,400,50);
        oF.add(oB4);
        oB4.setBounds(10,10,300,50);
        oF.add(oB7);
        oF.add(oB5);
        oB5.setBounds(50, 600,100,40);
        oF.add(oB6);
        oB6.setBounds(100, 200,120,50);
        oB6.setVisible(false);


        oL.setText("Total sell today : 0");
        oF.add(oL);
        oL.setVisible(false);
        oL.setBounds(10,100,600,50);


        oF.add(oL1);
        oL1.setVisible(false);
        oL1.setBounds(900,80,400,50);
        oL1.setFont(new Font("null", Font.BOLD, 40));
        oL1.setForeground(Color.CYAN);
        oF.add(ot);
        ot.setVisible(false);
        ot.setBounds(900,140,400,50);
        oB7.setVisible(false);
        oB7.setBounds(1000,200,200,50);



        oF.add(oP,BorderLayout.CENTER);
        oF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        oF.pack();
        oF.setSize(1500,800);
        oF.setVisible(true);
        oP.setBackground(Color.black);
        oP.setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==oB4)
        {
            oL.setVisible(true);
            oL1.setVisible(false);
            ot.setVisible(false);
            oB7.setVisible(false);
            oL.setText("Total sell today : "+ FoodOption.totalBill+"  taka");
            oL.setFont(new Font("MV Boli", Font.BOLD, 40));
            oB6.setVisible(true);
            oL.setForeground(Color.blue);
        }
        else if(e.getSource()==oB1)
        {

            oL.setVisible(false);
            oL1.setVisible(false);
            ot.setVisible(false);
            oB7.setVisible(false);

            new PriceChange();
            oF.dispose();

        }
        else if(e.getSource()==oB2)
        {
            oL.setVisible(false);
            oL1.setVisible(false);
            ot.setVisible(false);
            oB7.setVisible(false);
            new  SalaryChange();
            oF.dispose();
        }
        else if(e.getSource()==oB3)
        {

            oL.setVisible(false);
            oL1.setVisible(true);
            ot.setVisible(true);
            oB7.setVisible(true);


        }
        else if (e.getSource()==oB3) {
            welcomePage.resName =ot.getText();
            ot.setVisible(false);
            oB7.setVisible(false);


        } else if(e.getSource()==oB5)
        {
            oF.dispose();
            new welcomePage();
        }
        else if(e.getSource()==oB6)
        {
            FoodOption.totalBill=0;
        }
        else if(e.getSource()==oB7)
        {
            name =ot.getText();
            ot.setVisible(false);
            oL1.setVisible(false);
            oB7.setVisible(false);
            oB6.setVisible(false);

        }

    }
}
