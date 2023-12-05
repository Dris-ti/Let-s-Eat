import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;

public class OrderList extends JFrame implements ActionListener {
    JLabel warningLabel;
    BufferedWriter bw = new BufferedWriter(new FileWriter("file", true));
    JList list;
    JFrame frame;
    JPanel panel;
     JLabel billLabel;    JLabel label, cashLabel;
    JButton proceedButton, backButton, removeButton;
    DefaultListModel<String> defaultList;
    String[] oItem = new String[FoodOption.orderedItem.length];
    String[] rmvItem = new String[FoodOption.orderedItem.length - 1];
    String removedItem = null;

    OrderList() throws IOException {
        frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(1600, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        defaultList = new DefaultListModel<>();

        for(int i = 0; i < FoodOption.orderedItem.length; i++)
        {
            if(FoodOption.orderedItem[i] != null)
            {
                defaultList.addElement(FoodOption.orderedItem[i]);
                oItem[i] = FoodOption.orderedItem[i];
            }
        }

        list = new JList<>(defaultList);
        list.setFixedCellHeight(30);
        list.setFont(new Font("MV Boli", Font.BOLD, 22));
        list.setAlignmentX(JList.CENTER_ALIGNMENT);
        list.setAlignmentY(JList.CENTER_ALIGNMENT);
        list.setBackground(Color.decode("#F2F2F2"));
        list.setForeground(Color.decode("#0B698B"));
        list.setBounds(550, 250, 400, 200);

        panel = new JPanel();
        panel.setBounds(400, 50, 700, 200);
        panel.setBackground(Color.decode("#41436A"));
        panel.setForeground(Color.decode("#F2F2F2"));

        label = new JLabel("Ordered Item");
        label.setBounds(700, 150, 550, 250);
        label.setFont(new Font("MV Boli", Font.BOLD, 100));
        label.setBackground(Color.decode("#41436A"));
        label.setForeground(Color.decode("#F2F2F2"));
        label.setOpaque(true);
        panel.add(label);

        billLabel = new JLabel("Bill: " + String.valueOf(FoodOption.bill));
        billLabel.setBounds(700, 460, 140, 50);
        billLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        billLabel.setBackground(Color.decode("#F2F2F2"));
        billLabel.setForeground(Color.decode("#0B698B"));
        billLabel.setOpaque(true);


        backButton = new JButton("Back");
        backButton.setBounds(100, 650, 150, 40);
        backButton.setBackground(Color.GRAY);
        backButton.setFont(new Font("MV Boli", Font.BOLD, 20));
        backButton.setBackground(Color.decode("#E9EEf2"));
        backButton.setForeground(Color.decode("#244D61"));
        backButton.setVisible(true);
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        proceedButton = new JButton("Confirm");
        proceedButton.setBounds(1300, 650, 150, 40);
        proceedButton.setBackground(Color.GRAY);
        proceedButton.setFont(new Font("MV Boli", Font.BOLD, 20));
        proceedButton.setBackground(Color.decode("#E9EEf2"));
        proceedButton.setForeground(Color.decode("#244D61"));
        proceedButton.setVisible(true);
        proceedButton.setFocusable(false);
        proceedButton.addActionListener(this);

        removeButton = new JButton("Remove");
        removeButton.setBounds(680, 700, 150, 40);
        removeButton.setBackground(Color.GRAY);
        removeButton.setFont(new Font("MV Boli", Font.BOLD, 20));
        removeButton.setBackground(Color.decode("#E65C4F"));
        removeButton.setForeground(Color.decode("#E9EEF2"));
        removeButton.setVisible(true);
        removeButton.setFocusable(false);
        removeButton.addActionListener(this);


        warningLabel = new JLabel("Please place your order");
        warningLabel.setBounds(0,0, 400,50);
        warningLabel.setVisible(false);




        frame.add(warningLabel);
        frame.add(backButton);
        frame.add(proceedButton);
        frame.add(removeButton);
        frame.add(panel);
        frame.add(billLabel);
        frame.add(list);
        frame.getContentPane().setBackground(Color.decode("#41436A"));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(defaultList.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Place your order before confirming.", "Information", JOptionPane.WARNING_MESSAGE);
            frame.dispose();
            try {
                new FoodOption();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
        else
        {
            proceedButton.setEnabled(true);

            if(e.getSource() == backButton)
            {
                frame.dispose();
                try {
                    new FoodOption();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            else if(e.getSource() == proceedButton)
            {
                try (FileWriter fw = new FileWriter("file.txt", true);
                     BufferedWriter bw = new BufferedWriter(fw);
                     PrintWriter pw = new PrintWriter(bw))
                {

                    pw.println("Ordered Item: " + defaultList);
                    pw.println("Bill: " + FoodOption.bill);
                    pw.println("========================================================================================");
                    pw.flush();


                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                try (FileWriter historyFW = new FileWriter("History.txt", true);
                     BufferedWriter historyBW = new BufferedWriter(historyFW);
                     PrintWriter historyPW = new PrintWriter(historyBW)) {

                    historyPW.println("Ordered Item: " + defaultList);
                    historyPW.println("Bill: " + FoodOption.bill);
                    historyPW.println("========================================================================================");
                    historyPW.flush();


                    historyPW.flush();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                FoodOption.totalBill = FoodOption.totalBill + FoodOption.bill;

                frame.dispose();
                new thankYou();
            }
            else if(e.getSource() == removeButton)
            {
                for(int i = 0; i < defaultList.size(); i++)
                {
                    oItem[i] = defaultList.getElementAt(i);
                }

                removedItem = (String) list.getSelectedValue();
                defaultList.removeElementAt(list.getSelectedIndex());

                for(int i = 0; i < defaultList.size(); i++)
                {
                    rmvItem[i] = defaultList.getElementAt(i);
                }


               switch (removedItem)
                {
                    case "Rice" :
                        FoodOption.bill = FoodOption.bill - FoodOption.simRicePrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Polao" :
                        FoodOption.bill = FoodOption.bill - FoodOption.polaoPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Fried Rice" :
                        FoodOption.bill = FoodOption.bill - FoodOption.friedRPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Alu Vaji" :
                        FoodOption.bill = FoodOption.bill - FoodOption.aluPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Sobji" :
                        FoodOption.bill = FoodOption.bill - FoodOption.sobjiPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Sheem Vaji" :
                        FoodOption.bill = FoodOption.bill - FoodOption.sheemPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Beef" :
                        FoodOption.bill = FoodOption.bill - FoodOption.beefPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Mutton" :
                        FoodOption.bill = FoodOption.bill - FoodOption.muttonPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Chicken" :
                        FoodOption.bill = FoodOption.bill - FoodOption.chickenPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Ilish" :
                        FoodOption.bill = FoodOption.bill - FoodOption.ilishPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Chingri" :
                        FoodOption.bill = FoodOption.bill - FoodOption.chingriPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Pabda" :
                        FoodOption.bill = FoodOption.bill - FoodOption.pabdaPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Kacchi" :
                        FoodOption.bill = FoodOption.bill - FoodOption.kacchiPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Chicken Biriany" :
                        FoodOption.bill = FoodOption.bill - FoodOption.chiBirianyPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Teheri" :
                        FoodOption.bill = FoodOption.bill - FoodOption.teheriPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Hot Pot" :
                        FoodOption.bill = FoodOption.bill - FoodOption.hotPotPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Cuisine" :
                        FoodOption.bill = FoodOption.bill - FoodOption.cuisinePrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Noodles" :
                        FoodOption.bill = FoodOption.bill - FoodOption.noodlesPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Mango Sticky Rice" :
                        FoodOption.bill = FoodOption.bill - FoodOption.stickyRPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Pad Thai" :
                        FoodOption.bill = FoodOption.bill - FoodOption.padthaiPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Som Tum" :
                        FoodOption.bill = FoodOption.bill - FoodOption.somtumPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Bulgogi" :
                        FoodOption.bill = FoodOption.bill - FoodOption.bulgogiPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Bibimbap" :
                        FoodOption.bill = FoodOption.bill - FoodOption.bibimbapPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Tteokbokki" :
                        FoodOption.bill = FoodOption.bill - FoodOption.tokPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Kimchi" :
                        FoodOption.bill = FoodOption.bill - FoodOption.kimchiPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Soda" :
                        FoodOption.bill = FoodOption.bill - FoodOption.sodaPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Milk Shake" :
                        FoodOption.bill = FoodOption.bill - FoodOption.milkPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Juice" :
                        FoodOption.bill = FoodOption.bill - FoodOption.juicePrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    case "Lassi" :
                        FoodOption.bill = FoodOption.bill - FoodOption.lassiPrice;
                        billLabel.setText("Bill: " + FoodOption.bill);
                        break;

                    default:
                        System.out.println("00");

                }

            }

        }

    }
}

