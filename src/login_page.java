import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class login_page implements ActionListener {
    int a;
    JFrame f =new JFrame();
    JButton lB = new JButton("Login");
    JButton rB = new JButton("Reset");
    JTextField uiF =new JTextField();
    JTextField upF =new JTextField();
    JLabel uiL = new JLabel("UserID: ");
    JLabel upL = new JLabel("Password: ");
    JLabel mL = new JLabel("Enter ID and Password");
    JPanel p =new JPanel();
    HashMap<String,String> LogInfo =new HashMap<String,String>();
    HashMap<String,String> LogInfoStaff =new HashMap<String,String>();

    login_page(HashMap<String,String> LI,HashMap<String,String> SI)
    {
       LogInfo = LI;
       LogInfoStaff =SI;

       uiL.setBounds(50,100,75,25);
       upL.setBounds(50,150,75,25);
       mL.setBounds(75,250,400,35);
       lB.setBounds(135,200,75,25);
       lB.setFocusable(false);
       rB.setBounds(210,200,75,25);
       rB.setFocusable(false);

       uiF.setBounds(135,100,200,25);
       upF.setBounds(135,150,200,25);
       mL.setFont(new Font(null,Font.ITALIC,25));
        p.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
       p.setLayout(new GridLayout(5,5));

        lB.addActionListener(this);
        rB.addActionListener(this);

        f.setTitle("Login page");
       f.add(uiL);
       f.add(upL);
       f.add(mL);
       f.add(lB);
       f.add(rB);
       f.add(uiF);
       f.add(upF);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setSize(420,420);
       f.setLayout(null);
       f.setVisible(true);
       //f.setBackground(Color.black);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

         if(e.getSource()==rB)
         {
           uiF.setText("");
           upF.setText("");
           mL.setVisible(false);
         }
         else if (e.getSource()==lB)
         {
             String ui =uiF.getText();
             String up =String.valueOf(upF.getText()) ;
             if(LogInfo.containsKey(ui)) {
                 if (LogInfo.get(ui).equals(up)) {
                     mL.setText("Password correct");
                     Manager mp = new Manager();
                     f.dispose();

                 } else {
                     mL.setForeground(Color.red);
                     mL.setText("Password incorrect");

                 }
             }

             else if(LogInfoStaff.containsKey(ui))
             {

                if(LogInfoStaff.get(ui).equals(up))
                 {
                     mL.setText("Password correct" );
                     Staff_page sp =new Staff_page();
                     f.dispose();
                 }
                 else
                 {
                     mL.setForeground(Color.red);
                     mL.setText("Password incorrect");

                 }
             }
             else
             {
                 mL.setForeground(Color.magenta);
                 mL.setText("ID not found");
             }
         }

    }
}
