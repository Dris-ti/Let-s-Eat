import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class submitReport implements ActionListener {
    JFrame frame;
    JLabel label;
    JButton button;
    submitReport()
    {
        frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(1600, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Your review is submitted.");
        label.setFont(new Font("MV Boli", Font.BOLD, 50));
        label.setBounds(400, 200, 800, 100);
        label.setBackground(Color.decode("#FAF0CA"));

        button = new JButton("Home");
        button.setBounds(700, 550, 150, 50);
        button.setFont(new Font("MV Boli", Font.BOLD, 25));
        button.setBackground(Color.decode("#244D61"));
        button.setForeground(Color.decode("#EAEBED"));
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(label);
        frame.add(button);
        frame.getContentPane().setBackground(Color.decode("#FAF0CA"));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            frame.dispose();
            new welcomePage();
        }
    }
}
