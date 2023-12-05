import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Report extends JFrame implements ActionListener {

    String report;
    JButton button;
    JLabel label;
    JTextField textField;

    Report()
    {
        button = new JButton("Submit");
        button.setBounds(650, 550, 200, 50);
        button.setFocusable(false);
        button.setFont(new Font("MV Boli", Font.BOLD, 20));
        button.setBackground(Color.decode("#244D61"));
        button.setForeground(Color.decode("#EAEBED"));
        button.addActionListener(this);

        textField = new JTextField();
        textField.setBounds(500, 200, 500, 300);

        this.setSize(1600, 850);
        setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.decode("#CEE9B6"));

        label = new JLabel("Share your concern");
        label.setBounds(500, 100, 900, 300);
        label.setFont(new Font("MV Boli", Font.BOLD, 46));
        label.setBackground(Color.decode("#CEE9B6"));
        label.setForeground(Color.decode("#2D8D79"));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setOpaque(true);
        label.add(button);

        this.add(textField);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            report = textField.getText();

            try (FileWriter historyFW = new FileWriter("History.txt", true);
                 BufferedWriter historyBW = new BufferedWriter(historyFW);
                 PrintWriter historyPW = new PrintWriter(historyBW)) {

                historyPW.println("========================================================================================");
                historyPW.println("Report from Customer: " + report);
                historyPW.println("========================================================================================");
                historyPW.flush();


                historyPW.flush();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            this.dispose();
            new submitReport();
        }
    }
}
