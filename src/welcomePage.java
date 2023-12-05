import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class welcomePage extends JFrame implements ActionListener {
    JButton button;
    JButton reportButton;
    JButton loginButton;
    static String resName = "Let's Eat";

    welcomePage()
    {
        this.getContentPane().setBackground(Color.BLACK);
        ImageIcon gif = new ImageIcon("tmt.gif");


        button = new JButton("Order NOW");
        button.setBounds(670, 550, 220, 50);
        button.setFont(new Font("Calibri", Font.BOLD, 30));
        button.setBackground(Color.WHITE);
        button.setFocusable(false);

        reportButton = new JButton("Report");
        reportButton.setBounds(50, 700, 120, 35);
        reportButton.setFont(new Font("Calibri", Font.BOLD, 17));
        reportButton.setBackground(Color.WHITE);
        reportButton.setFocusable(false);
        reportButton.addActionListener(this);

        loginButton = new JButton("Log In");
        loginButton.setBounds(1300, 700, 120, 35);
        loginButton.setFont(new Font("Calibri", Font.BOLD, 17));
        loginButton.setBackground(Color.WHITE);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);


        JLabel label = new JLabel();
        label.setBackground(Color.BLACK);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.TOP);
        label.setIcon(gif);
        label.add(reportButton);
        label.add(loginButton);
        label.add(button);

        label.setOpaque(true);

        JLabel text = new JLabel(resName);
        text.setBounds(150, 150, 600, 250);
        text.setFont(new Font("Advertising Script Monoline", Font.BOLD,170));
        text.setForeground(Color.WHITE);
        label.add(text);

        JLabel subTitle = new JLabel("Eat well, Stay well");
        subTitle.setBounds(160, 280, 600, 150);
        subTitle.setFont(new Font("Advertising Script Monoline", Font.BOLD,45));
        subTitle.setForeground(Color.WHITE);
        label.add(subTitle);

        button.addActionListener(this);
        this.add(label);
        this.setTitle(resName);
        this.setSize(1905, 815);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.setVisible(true);
        //this.pack();
        //this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            this.dispose();
            try {
                new FoodOption();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if (e.getSource() == reportButton)
        {
            this.dispose();
            new Report();
        }
        else if(e.getSource() == loginButton)
        {
            this.dispose();

            Id_Password ip =new Id_Password();
            new login_page(ip.getLogInfo(), ip.getLogInfoStaff());

        }
    }
}
