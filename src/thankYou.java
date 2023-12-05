import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class thankYou implements ActionListener {
    static int finishCount = 1;
    JFrame frame;
    JLabel orderLabel, tnxLabel;
    JButton button;
    thankYou()
    {
        frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(1600, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        orderLabel = new JLabel("Your Order is on the way...");
        orderLabel.setFont(new Font("MV Boli", Font.BOLD, 50));
        orderLabel.setBackground(Color.decode("#EAB875"));
        orderLabel.setForeground(Color.decode("#505581"));
        orderLabel.setBounds(400, 200, 800, 100);

        tnxLabel = new JLabel("Thank you & come again");
        tnxLabel.setFont(new Font("MV Boli", Font.BOLD, 40));
        tnxLabel.setBackground(Color.decode("#EAB875"));
        tnxLabel.setForeground(Color.decode("#505581"));
        tnxLabel.setBounds(480, 300, 800, 100);

        button = new JButton("Finish");
        button.setBounds(700, 550, 150, 50);
        button.setFont(new Font("MV Boli", Font.BOLD, 25));
        button.setBackground(Color.decode("#004681"));
        button.setForeground(Color.decode("#D3E3E2"));
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.add(orderLabel);
        frame.add(tnxLabel);
        frame.getContentPane().setBackground(Color.decode("#97CBD0"));
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            finishCount++;
            Arrays.fill(FoodOption.orderedItem, null);
            FoodOption.bill = 0;
            frame.dispose();
            new welcomePage();
        }

    }
}
