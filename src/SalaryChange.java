import javax.swing.*;
import javax.xml.transform.Source;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaryChange implements ActionListener {
    Staff_info l =new Staff_info();

  static int x;
    JFrame sF =new JFrame("Manager page");
    JPanel sP =new JPanel();
    JTextField j =new JTextField();
    JLabel sL1,sL2;
    JComboBox sb =new JComboBox();
    JButton sB1,sB2,sB3,sB4,sB5,sB6,sB7,sB8,sB9,sB10,sB11,sB12,sB13,sB14,SC,PC;
    JButton osB1,osB2,osB3,osB4,osB5,osB6,osB7,osB8,osB9,osB10,osB11,osB12,osB13,osB14;
    JButton ba_Button,sp;
    public void BP(JButton b)
    {
        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.WHITE);
        b.setFocusable(false);
        b.setFont(new Font("MV Boli", Font.BOLD, 25));
        b.setVisible(true);
        b.addActionListener(this);
    }
    public void BP1(JButton b)
    {

        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.WHITE);
        b.setFocusable(false);
        b.setFont(new Font("null", Font.BOLD, 25));
        b.setVisible(false);
        b.addActionListener(this);
        b.setBounds(380, 275,150,35);
    }
    public void B(JButton b)
    {
        b.setBackground(Color.CYAN);
        SC.setVisible(true);
        PC.setVisible(true);
        sL2.setVisible(true);
        j.setVisible(true);
        osB1.setVisible(false);
        osB2.setVisible(false);
        osB3.setVisible(false);
        osB4.setVisible(false);
        osB5.setVisible(false);
        osB6.setVisible(false);
        osB7.setVisible(false);
        osB8.setVisible(false);
        osB9.setVisible(false);
        osB10.setVisible(false);
        osB11.setVisible(false);
        osB12.setVisible(false);
        osB13.setVisible(false);
        osB14.setVisible(false);

    }


    SalaryChange()
    {
       String[] s={"Manager","Executive Chef","Assistant Chef","Senior Waiter","Waiter","Dishwasher"} ;
        sb = new JComboBox<>(s);
        sb.setBounds(650, 160,300,40);
        sb.setFont(new Font("MV Boli", Font.BOLD, 40));
        sb.setVisible(false);
        sF.add(sb);
        sb.addActionListener(this);

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
        SC=new JButton("Change Salary");
        PC=new JButton("Change Post");
        ba_Button =new JButton("Back");
        sp =new JButton("Staff Page");

        osB1=new JButton("Confirm");
        osB2=new JButton("Confirm");
        osB3=new JButton("Confirm");
        osB4=new JButton("Confirm");
        osB5=new JButton("Confirm");
        osB6=new JButton("Confirm");
        osB7=new JButton("Confirm");
        osB8=new JButton("Confirm");
        osB9=new JButton("Confirm");
        osB10=new JButton("Confirm");
        osB11=new JButton("Confirm");
        osB12=new JButton("Confirm");
        osB13=new JButton("Confirm");
        osB14=new JButton("Confirm");

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
        BP1(osB1);
        BP1(osB2);
        BP1(osB3);
        BP1(osB4);
        BP1(osB5);
        BP1(osB6);
        BP1(osB7);
        BP1(osB8);
        BP1(osB9);
        BP1(osB10);
        BP1(osB11);
        BP1(osB12);
        BP1(osB13);
        BP1(osB14);
        BP(SC);
        BP(PC);
        BP(sp);
        BP(ba_Button);

        SC.setVisible(false);
        PC.setVisible(false);



        sL1 =new JLabel("Click On Name");
        sL1.setBounds(400,0,400,50);
        sL1.setFont(new Font(null, Font.BOLD, 30));


        sL2 =new JLabel("Enter New Salary :");
        sL2.setFont(new Font(null, Font.BOLD, 25));
        sL2.setVisible(false);
       // sL3 =new JLabel();
        //sL4 =new JLabel();
        //Lp(sL2);
        //Lp(sL3);
       // Lp(sL4);

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

        ba_Button.setBounds(10, 600,120,30);
        sp.setBounds(900,600,200,35);

        SC.setBounds(350, 100,300,50);
        sL2.setBounds(350, 160,300,50);
        j.setBounds(350, 215,300,50);
        j.addActionListener(this);
        j.setVisible(false);
        PC.setBounds(650, 100,300,50);
       // sL3.setBounds(350,300,300,50);



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

        sF.add(SC);
        sF.add(PC);
        sF.add(osB1);
        sF.add(osB2);
        sF.add(osB3);
        sF.add(osB4);
        sF.add(osB5);
        sF.add(osB6);
        sF.add(osB7);
        sF.add(osB8);
        sF.add(osB9);
        sF.add(osB10);
        sF.add(osB11);
        sF.add(osB12);
        sF.add(osB13);
        sF.add(osB14);
        sF.add(ba_Button);
        sF.add(sp);


        //sF.add(sP);
        sF.add(sL1);
        sF.add(sL2);
        sF.add(j);
      // sF.add(sL3);

        sF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sF.setSize(1500,800);
        sF.setLayout(null);
        sF.setVisible(true);
        sP.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        sP.setLayout(null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();





        if (sB1.equals(source)) {
            B(sB1);
            osB1.setVisible(true);

        } else if (sB2.equals(source)) {
            B(sB2);
            osB2.setVisible(true);

        } else if (sB3.equals(source)) {B(sB3);
            osB3.setVisible(true);

        } else if (sB4.equals(source)) {B(sB4);
            osB4.setVisible(true);

        } else if (sB5.equals(source)) {B(sB5);
            osB5.setVisible(true);

        } else if (sB6.equals(source)) {B(sB6);
            osB6.setVisible(true);

        } else if (sB7.equals(source)) {B(sB7);
            osB7.setVisible(true);

        } else if (sB8.equals(source)) {B(sB8);
            osB8.setVisible(true);

        } else if (sB9.equals(source)) {B(sB9);
            osB9.setVisible(true);

        } else if (sB10.equals(source)) {B(sB10);
            osB10.setVisible(true);


        } else if (sB11.equals(source)) {B(sB11);
            osB11.setVisible(true);

        } else if (sB12.equals(source)) {B(sB12);
            osB12.setVisible(true);

        } else if (sB13.equals(source)) {B(sB13);
            osB13.setVisible(true);

        } else if (sB14.equals(source)) {B(sB14);
            osB14.setVisible(true);

        }
        else if (PC.equals(source)) {
            sb.setVisible(true);

        }
        else if(SC.equals(source))
        {
            new Staff_page();
            sb.setVisible(false);

        }
        else if(sp.equals(source))
        {
            new Staff_page();
        }
        else if(ba_Button.equals(source))
        {
            new Manager();
            sF.dispose();
        }
        String m = j.getText();
        int n =Integer.parseInt(m);
        x = n;

        int z=l.PI.get(sb.getSelectedIndex());




        if (osB1.equals(source)){
            Staff_info.sp[0]=Staff_info.sp[z];
            Staff_info.ss[0]=Staff_info.ss[z];
            Staff_info.ss[0]=x;
             j.setText("");


        }
        else if (osB2.equals(source)) {
           Staff_info.sp[1]=Staff_info.sp[z];
             Staff_info.ss[1]=Staff_info.ss[z];
             Staff_info.ss[1]=x;
             j.setText("");

        }  if (osB3.equals(source)) {
            Staff_info.sp[2]=Staff_info.sp[z];
            Staff_info.ss[2]=Staff_info.ss[z];
             Staff_info.ss[2]=x;
             j.setText("");

        } else if (osB4.equals(source)) {
            Staff_info.sp[3]=Staff_info.sp[z];
            Staff_info.ss[3]=Staff_info.ss[z];
             Staff_info.ss[3]=x;

            j.setText("");

        } else if (osB5.equals(source)) {
            Staff_info.sp[4]=Staff_info.sp[z];
            Staff_info.ss[4]=Staff_info.ss[z];
             Staff_info.ss[4]=x;
             j.setText("");

        } else if (osB6.equals(source)) {
            Staff_info.sp[5]=Staff_info.sp[z];
            Staff_info.ss[5]=Staff_info.ss[z];
             Staff_info.ss[5]=x;
             j.setText("");

        } else if (osB7.equals(source)) {
            Staff_info.sp[6]=Staff_info.sp[z];
            Staff_info.ss[6]=Staff_info.ss[z];
             Staff_info.ss[6]=x;
             j.setText("");

        } else if (osB8.equals(source)) {
            Staff_info.sp[7]=Staff_info.sp[z];
            Staff_info.ss[7]=Staff_info.ss[z];
             Staff_info.ss[7]=x;
             j.setText("");

        } else if (osB9.equals(source)) {
            Staff_info.sp[8]=Staff_info.sp[z];
            Staff_info.ss[8]=Staff_info.ss[z];
             Staff_info.ss[8]=x;
             j.setText("");

        } else if (osB10.equals(source)) {
            Staff_info.sp[9]=Staff_info.sp[z];
            Staff_info.ss[9]=Staff_info.ss[z];
             Staff_info.ss[9]=x;
             j.setText("");


        } else if (osB11.equals(source)) {
            Staff_info.sp[10]=Staff_info.sp[z];
            Staff_info.ss[10]=Staff_info.ss[z];
             Staff_info.ss[10]=x;
             j.setText("");

        } else if (osB12.equals(source)) {
            Staff_info.sp[11]=Staff_info.sp[z];
            Staff_info.ss[11]=Staff_info.ss[z];
             Staff_info.ss[11]=x;
             j.setText("");

        } else if (osB13.equals(source)) {
            Staff_info.sp[12]=Staff_info.sp[z];
            Staff_info.ss[12]=Staff_info.ss[z];
             Staff_info.ss[12]=x;
             j.setText("");

        } else if (osB14.equals(source)) {
            Staff_info.sp[13]=Staff_info.sp[z];
            Staff_info.ss[13]=Staff_info.ss[z];
             Staff_info.ss[13]=x;
             j.setText("");
        }


    }
}

