import javax.swing.*;
import javax.xml.transform.Source;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staff_page implements ActionListener {

    Staff_info si =new Staff_info();
    JFrame sF =new JFrame("Staff page");
    JPanel sP =new JPanel();
    JLabel sL1,sL2,sL3,sL4;
    JButton sB1,sB2,sB3,sB4,sB5,sB6,sB7,sB8,sB9,sB10,sB11,sB12,sB13,sB14,b;
   public void BP(JButton b)
    {
        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.WHITE);
        b.setFocusable(false);
        b.setFont(new Font("MV Boli", Font.BOLD, 25));
        b.setVisible(true);
        b.addActionListener(this);
    }
    public void Lp(JLabel p)
    {
        p.setBackground(Color.DARK_GRAY);
        p.setForeground(Color.RED);
        p.setFont(new Font("MV Boli", Font.BOLD, 25));
        p.setVisible(false);
    }
    public void show(String n)
    {
        int i=si.SI.get(n);
        sL2.setText("Post :"+ si.sp[i]);
        sL3.setText("Joining Date :"+ si.jd[i]);
        sL4.setText("Salary :"+ si.ss[i]+" Taka");
        sL2.setVisible(true);
        sL3.setVisible(true);
        sL4.setVisible(true);



    }

    Staff_page()
    {

        sB1 =new JButton("Raihan Alom");
        sB2 =new JButton("Imtiz Sumon");
        sB3 =new JButton("Badol Akhon");
        sB4 =new JButton("Noyon");
        sB5 =new JButton("Laboni Begum");
        sB6 =new JButton("Fahad Ali");
        sB7 =new JButton("Roni");
        sB8 =new JButton("Kamal");
        sB9 =new JButton("Rakib");
        sB10 =new JButton("Jeddal Mollah");
        sB11=new JButton("Rasel");
        sB12=new JButton("Fatema Begum");
        sB13=new JButton("Nahid");
        sB14=new JButton("Sahalom");
        b=new JButton("Back");
        BP(sB1);
        BP(sB2);
        BP(sB3);
        BP(sB4);
        BP(sB5);
        BP(sB6);
        BP(sB7);
        BP(sB8);
        BP(sB9);
        BP(sB10);
        BP(sB11);
        BP(sB12);
        BP(sB13);
        BP(sB14);
        BP(b);


        sL1 =new JLabel("Click on your name");
        sL1.setBounds(400,0,400,50);
        sL1.setFont(new Font(null, Font.BOLD, 30));
        sL2 =new JLabel();
        sL3 =new JLabel();
        sL4 =new JLabel();
        Lp(sL2);
        Lp(sL3);
        Lp(sL4);

        sB1.setBounds(10,70,220,25);

        sB2.setBounds(10,100,220,25);
        sB3.setBounds(10,130,220,25);
        sB4.setBounds(10,160,220,25);
        sB5.setBounds(10,190,220,25);
        sB6.setBounds(10,220,220,25);
        sB7.setBounds(10,250,220,25);
        sB8.setBounds(10,280,220,25);
        sB9.setBounds(10,310,220,25);
        sB10.setBounds(10,340,220,25);
        sB11.setBounds(10,370,220,25);
        sB12.setBounds(10,400,220,25);
        sB13.setBounds(10,430,220,25);
        sB14.setBounds(10,460,220,25);
        b.setBounds(10, 600,120,30);


        sF.add(sB1);
        sF.add(sB2);
        sF.add(sB3);
        sF.add(sB4);
        sF.add(sB5);
        sF.add(sB6);
        sF.add(sB7);
        sF.add(sB8);
        sF.add(sB9);
        sF.add(sB10);
        sF.add(sB11);
        sF.add(sB12);
        sF.add(sB13);
        sF.add(sB14);
        sF.add(b);

        //sF.add(sP);
        sF.add(sL1);
        sF.add(sL2);
        sF.add(sL3);
        sF.add(sL4);

        sF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sF.setSize(1500,800);
        sF.setLayout(null);
        sF.setVisible(true);
        sP.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        sP.setLayout(null);

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {

        Object source = e.getSource();
        if (sB1.equals(source)) {
            show("Raihan Alom");
            sL2.setBounds(300,70,400,25);
            sL3.setBounds(600,70,500,25);
            sL4.setBounds(1100,70,300,25);
        }
        else if (sB2.equals(source)) {
            show("Imtiz Sumon");
            sL2.setBounds(300,100,300,25);
            sL3.setBounds(680,100,500,25);
            sL4.setBounds(1100,100,300,25);

        }
        else if (sB3.equals(source)) {
            show("Badol Akhon");
            sL2.setBounds(300,130,300,25);
            sL3.setBounds(600,130,500,25);
            sL4.setBounds(1100,130,300,25);
        }
        else if (sB4.equals(source)) {
            show("Noyon");
            sL2.setBounds(300,160,300,25);
            sL3.setBounds(600,160,500,25);
            sL4.setBounds(1100,160,300,25);
        }
        else if (sB5.equals(source)) {
            show("Laboni Begum");
            sL2.setBounds(300,190,300,25);
            sL3.setBounds(600,190,500,25);
            sL4.setBounds(1100,190,300,25);
        }
        else if (sB6.equals(source)) {
            show("Fahad Ali");
            sL2.setBounds(300,220,300,25);
            sL3.setBounds(600,220,500,25);
            sL4.setBounds(1100,220,300,25);
        }
        else if (sB7.equals(source)) {
            show("Roni");
            sL2.setBounds(300,250,300,25);
            sL3.setBounds(600,250,500,25);
            sL4.setBounds(1100,250,300,25);
        }
        else if (sB8.equals(source)) {
            sL2.setBounds(300,280,300,25);
            sL3.setBounds(600,280,500,25);
            sL4.setBounds(1100,280,300,25);
            show("Kamal");
        } else if (sB9.equals(source)) {
            sL2.setBounds(300,310,300,25);
            sL3.setBounds(600,310,500,25);
            sL4.setBounds(1100,310,300,25);
            show("Rakib");
        } else if (sB10.equals(source)) {
            sL2.setBounds(300,340,300,25);
            sL3.setBounds(600,340,500,25);
            sL4.setBounds(1100,340,300,25);
            show("Jeddal Mollah");
        } else if (sB11.equals(source)) {
            sL2.setBounds(300,370,300,25);
            sL3.setBounds(600,370,500,25);
            sL4.setBounds(1100,370,300,25);
            show("Rasel");
        } else if (sB12.equals(source)) {
            sL2.setBounds(300,400,300,25);
            sL3.setBounds(600,400,500,25);
            sL4.setBounds(1100,400,300,25);
            show("Nurjahan begum");
        } else if (sB13.equals(source)) {
            sL2.setBounds(300,430,300,25);
            sL3.setBounds(600,430,500,25);
            sL4.setBounds(1100,430,300,25);

            show("Nahid");
        } else if (sB14.equals(source)) {
            sL2.setBounds(300,460,300,25);
            sL3.setBounds(600,460,500,25);
            sL4.setBounds(1100,460,300,25);
            show("Sahalom");
        }
        else if (b.equals(source)) {
            sF.dispose();
            new welcomePage();

        }


    }
}
