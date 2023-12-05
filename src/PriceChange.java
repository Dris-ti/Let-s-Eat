import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PriceChange  implements ActionListener {

    JFrame SFP =new JFrame();
    int a;

    String[] price =new String[20];
    JLabel label;
    JComboBox b;






    JButton ben_button, thai_button, chin_button, kor_button, drinks_button;
    JButton riceButton, vegButton, meatButton, fishButton, cBenButton;
    JButton hotpButton;
    JButton cuisineButton;
    JButton noodlesButton;


    JLabel hpPriceLabel, cPriceLabel, nPriceLabel;
    JButton stickyrButton, padthaiButton, somtumButton;

    JLabel srPriceLabel, ptPriceLabel, stPriceLabel;
    JButton bulgogiButton, tokButton, kimchiButton, bibimbapButton;

    JLabel bPriceLabel, tbPriceLabel, bbPriceLabel, kimchiPriceLabel;
    JButton sodaButton, milkButton, juiceButton, lassiButton;

    JLabel sPriceLabel, msPriceLabel, jPriceLabel, lPriceLabel;
    JButton simRiceButton, polaoButton, friedRiceButton;

    JLabel simrPriceLabel, pPriceLabel, frPriceLabel;
    JButton aluButton, sobjiButton, sheemButton;

    JLabel avPriceLabel, sobjiPriceLabel, svPriceLabel;
    JButton muttonButton, chickenButton, beefButton;

    JLabel mPriceLabel, chickenPriceLabel, beefPriceLabel;
    JButton ilishButton, chingriButton, pabdaButton;

    JLabel iPriceLabel, chingriPriceLabel, pabdaPriceLabel;
    JButton kacchiButton, chickenBirianyButton, teheriButton;

    JLabel kPriceLabel, birianyPriceLabel, teheriPriceLabel;

    JButton ba_Button;

    void priceLabel(JLabel l, int p)
    {

        l.setText(String.valueOf(p));
        l.setForeground(Color.BLUE);
        l.setBackground(Color.GRAY);
        l.setFont(new Font("MV Boli", Font.BOLD, 20));
        l.setVisible(false);
        l.setOpaque(true);
        label.add(l);

    }

    void butOption2(JButton b)
    {
        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.WHITE);
        b.setFocusable(false);
        b.setFont(new Font("MV Boli", Font.BOLD, 25));
        b.setVisible(false);
    }

    void butOption3(JButton b)
    {
        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.WHITE);
        b.setFocusable(false);
        b.setFont(new Font("MV Boli", Font.BOLD, 20));
        b.setVisible(false);
    }

    // FoodOption f= new FoodOption();


    PriceChange() {

        for (int i = 0; i < price.length; i++)
        {
            if(i<price.length/2)
            {
                price[i] = "+" + ((i+1) *10);

            }
            else {
                price[i] = "-" + ((price.length-i) *10);}
        }

        b = new JComboBox<>(price);
        b.setBounds(1050, 50, 200, 35);
        b.setFont(new Font("MV Boli", Font.BOLD, 40));
        b.setVisible(true);



        SFP.setSize(1500, 800);
        SFP.setLocationRelativeTo(SFP);
        SFP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        ben_button = new JButton("Bengali");
        ben_button.setBackground(Color.DARK_GRAY);
        ben_button.setForeground(Color.WHITE);
        ben_button.setFocusable(false);
        ben_button.setFont(new Font("MV Boli", Font.BOLD, 33));
        ben_button.setBounds(70, 150, 220, 50);
        ben_button.addActionListener(this);

        chin_button = new JButton("Chinese");
        chin_button.setBackground(Color.DARK_GRAY);
        chin_button.setForeground(Color.WHITE);
        chin_button.setFocusable(false);
        chin_button.setFont(new Font("MV Boli", Font.BOLD, 33));
        chin_button.setBounds(70, 240, 220, 50);
        chin_button.addActionListener(this);

        thai_button = new JButton("Thai");
        thai_button.setBackground(Color.DARK_GRAY);
        thai_button.setForeground(Color.WHITE);
        thai_button.setFocusable(false);
        thai_button.setFont(new Font("MV Boli", Font.BOLD, 33));
        thai_button.setBounds(70, 330, 220, 50);
        thai_button.addActionListener(this);

        kor_button = new JButton("Korean");
        kor_button.setBackground(Color.DARK_GRAY);
        kor_button.setForeground(Color.WHITE);
        kor_button.setFocusable(false);
        kor_button.setFont(new Font("MV Boli", Font.BOLD, 33));
        kor_button.setBounds(70, 420, 220, 50);
        kor_button.addActionListener(this);

        drinks_button = new JButton("Drinks");
        drinks_button.setBackground(Color.DARK_GRAY);
        drinks_button.setForeground(Color.WHITE);
        drinks_button.setFocusable(false);
        drinks_button.setFont(new Font("MV Boli", Font.BOLD, 33));
        drinks_button.setBounds(70, 510, 220, 50);
        drinks_button.addActionListener(this);



        riceButton = new JButton("Rice");
        butOption2(riceButton);
        riceButton.setBounds(350, 150, 170, 45);
        riceButton.addActionListener(this);

        simRiceButton = new JButton("Rice");
        butOption3(simRiceButton);
        simRiceButton.setBounds(360,230, 150, 40);
        simRiceButton.addActionListener(this);

        polaoButton = new JButton("Polao");
        butOption3(polaoButton);
        polaoButton.setBounds(360,310, 150, 40);
        polaoButton.addActionListener(this);

        friedRiceButton = new JButton("Fried Rice");
        butOption3(friedRiceButton);
        friedRiceButton.setBounds(360,390, 150, 40);
        friedRiceButton.addActionListener(this);

        vegButton = new JButton("Vegetables");
        butOption2(vegButton);
        vegButton.setBounds(570, 150, 170, 45);
        vegButton.addActionListener(this);
        aluButton = new JButton("Alu Vaji");
        butOption3(aluButton);
        aluButton.setBounds(580,230, 150, 40);
        aluButton.addActionListener(this);

        sobjiButton = new JButton("Sobji");
        butOption3(sobjiButton);
        sobjiButton.setBounds(580,310, 150, 40);
        sobjiButton.addActionListener(this);

        sheemButton = new JButton("Sheem Vaji");
        butOption3(sheemButton);
        sheemButton.setBounds(580,390, 150, 40);
        sheemButton.addActionListener(this);


        meatButton = new JButton("Meat");
        butOption2(meatButton);
        meatButton.setBounds(790, 150, 170, 45);
        meatButton.addActionListener(this);

        beefButton = new JButton("Beef");
        butOption3(beefButton);
        beefButton.setBounds(800,230, 150, 40);
        beefButton.addActionListener(this);

        muttonButton = new JButton("Mutton");
        butOption3(muttonButton);
        muttonButton.setBounds(800,310, 150, 40);
        muttonButton.addActionListener(this);

        chickenButton = new JButton("Chiken");
        butOption3(chickenButton);
        chickenButton.setBounds(800,390, 150, 40);
        chickenButton.addActionListener(this);


        fishButton = new JButton("Fish");
        butOption2(fishButton);
        fishButton.setBounds(1010, 150, 170, 45);
        fishButton.addActionListener(this);

        ilishButton = new JButton("Ilish");
        butOption3(ilishButton);
        ilishButton.setBounds(1020, 230, 150, 45);
        ilishButton.addActionListener(this);

        chingriButton = new JButton("Chingri");
        butOption3(chingriButton);
        chingriButton.setBounds(1020, 310, 150, 45);
        chingriButton.addActionListener(this);

        pabdaButton = new JButton("Pabda");
        butOption3(pabdaButton);
        pabdaButton.setBounds(1020, 390, 150, 45);
        pabdaButton.addActionListener(this);


        cBenButton = new JButton("Combo Pack");
        butOption2(cBenButton);
        cBenButton.setBounds(1230, 150, 180, 45);
        cBenButton.addActionListener(this);

        kacchiButton = new JButton("Kacchi");
        butOption3(kacchiButton);
        kacchiButton.setBounds(1245, 230, 150, 45);
        kacchiButton.addActionListener(this);

        chickenBirianyButton = new JButton("Chicken Biriany");
        butOption3(chickenBirianyButton);
        chickenBirianyButton.setBounds(1220, 310, 200, 45);
        chickenBirianyButton.addActionListener(this);

        teheriButton = new JButton("Teheri");
        butOption3(teheriButton);
        teheriButton.setBounds(1245, 390, 150, 45);
        teheriButton.addActionListener(this);


        hotpButton = new JButton("Hot Pot");
        butOption2(hotpButton);
        hotpButton.setBounds(400, 240, 170, 45);
        hotpButton.addActionListener(this);

        cuisineButton = new JButton("Cuisine");
        butOption2(cuisineButton);
        cuisineButton.setBounds(700, 240, 170, 45);
        cuisineButton.addActionListener(this);

        noodlesButton = new JButton("Noodles");
        butOption2(noodlesButton);
        noodlesButton.setBounds(1000, 240, 170, 45);
        noodlesButton.addActionListener(this);

        stickyrButton = new JButton("Mango Sticky Rice");
        butOption2(stickyrButton);
        stickyrButton.setBounds(400,330, 300, 45);
        stickyrButton.addActionListener(this);

        padthaiButton = new JButton("Pad Thai");
        butOption2(padthaiButton);
        padthaiButton.setBounds(800,330, 200, 45);
        padthaiButton.addActionListener(this);

        somtumButton = new JButton("Som Tum");
        butOption2(somtumButton);
        somtumButton.setBounds(1100,330, 200, 45);
        somtumButton.addActionListener(this);

        bulgogiButton = new JButton("Bulgogi");
        butOption2(bulgogiButton);
        bulgogiButton.setBounds(400, 420, 170, 45);
        bulgogiButton.addActionListener(this);

        bibimbapButton = new JButton("Bibimbap");
        butOption2(bibimbapButton);
        bibimbapButton.setBounds(650, 420, 170, 45);
        bibimbapButton.addActionListener(this);

        tokButton = new JButton("Tteokbokki");
        butOption2(tokButton);
        tokButton.setBounds(900, 420, 170, 45);
        tokButton.addActionListener(this);

        kimchiButton = new JButton("Kimchi");
        butOption2(kimchiButton);
        kimchiButton.setBounds(1150, 420, 170, 45);
        kimchiButton.addActionListener(this);

        sodaButton = new JButton("Soda");
        butOption2(sodaButton);
        sodaButton.setBounds(400, 510, 170, 45);
        sodaButton.addActionListener(this);

        milkButton = new JButton("Milk Shake");
        butOption2(milkButton);
        milkButton.setBounds(650, 510, 170, 45);
        milkButton.addActionListener(this);

        juiceButton = new JButton("Juice");
        butOption2(juiceButton);
        juiceButton.setBounds(900, 510, 170, 45);
        juiceButton.addActionListener(this);

        lassiButton = new JButton("Lassi");
        butOption2(lassiButton);
        lassiButton.setBounds(1150, 510, 170, 45);
        lassiButton.addActionListener(this);

        ba_Button = new JButton("Back");
        ba_Button.setBackground(Color.DARK_GRAY);
        ba_Button.setForeground(Color.WHITE);
        ba_Button.setFocusable(false);
        ba_Button.setFont(new Font("MV Boli", Font.BOLD, 33));
        ba_Button.setBounds(100, 650, 150, 50);
        ba_Button.addActionListener(this);


        label = new JLabel("Change Food price");
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("MV Boli", Font.BOLD, 70));


        label.add(b);



        label.add(ben_button);
        label.add(chin_button);
        label.add(thai_button);
        label.add(kor_button);
        label.add(drinks_button);

        label.add(riceButton);
        label.add(vegButton);
        label.add(meatButton);
        label.add(fishButton);
        label.add(cBenButton);

        label.add(hotpButton);
        label.add(cuisineButton);
        label.add(noodlesButton);

        label.add(stickyrButton);
        label.add(padthaiButton);
        label.add(somtumButton);

        label.add(bulgogiButton);
        label.add(tokButton);
        label.add(bibimbapButton);
        label.add(kimchiButton);

        label.add(sodaButton);
        label.add(milkButton);
        label.add(juiceButton);
        label.add(lassiButton);

        label.add(simRiceButton);
        label.add(polaoButton);
        label.add(friedRiceButton);

        label.add(aluButton);
        label.add(sobjiButton);
        label.add(sheemButton);

        label.add(beefButton);
        label.add(muttonButton);
        label.add(chickenButton);

        label.add(ilishButton);
        label.add(chingriButton);
        label.add(pabdaButton);

        label.add(kacchiButton);
        label.add(chickenBirianyButton);
        label.add(teheriButton);

        label.add(ba_Button);


        hpPriceLabel = new JLabel();
        priceLabel(hpPriceLabel, FoodOption.hotPotPrice);
        hpPriceLabel.setBounds(580, 250, 60, 30);

        cPriceLabel = new JLabel();
        priceLabel(cPriceLabel, FoodOption.cuisinePrice);
        cPriceLabel.setBounds(880, 250, 60, 30);

        nPriceLabel = new JLabel();
        priceLabel(nPriceLabel, FoodOption.noodlesPrice);//sob gulate FoodOption. likhba
        nPriceLabel.setBounds(1180, 250, 60, 30);


        srPriceLabel = new JLabel();
        priceLabel(srPriceLabel, FoodOption.stickyRPrice);
        srPriceLabel.setBounds(710, 340, 60, 30);

        ptPriceLabel = new JLabel();
        priceLabel(ptPriceLabel, FoodOption.padthaiPrice);
        ptPriceLabel.setBounds(1010, 340, 60, 30);

        stPriceLabel = new JLabel();
        priceLabel(stPriceLabel, FoodOption.somtumPrice);
        stPriceLabel.setBounds(1310, 340, 60, 30);


        bPriceLabel = new JLabel();
        priceLabel(bPriceLabel, FoodOption.bulgogiPrice);
        bPriceLabel.setBounds(580, 430, 60, 30);

        tbPriceLabel = new JLabel();
        priceLabel(tbPriceLabel, FoodOption.tokPrice);
        tbPriceLabel.setBounds(1080, 430, 60, 30);

        bbPriceLabel = new JLabel();
        priceLabel(bbPriceLabel, FoodOption.bibimbapPrice);
        bbPriceLabel.setBounds(830, 430, 60, 30);

        kimchiPriceLabel = new JLabel();
        priceLabel(kimchiPriceLabel, FoodOption.kimchiPrice);
        kimchiPriceLabel.setBounds(1330, 430, 60, 30);


        sPriceLabel = new JLabel();
        priceLabel(sPriceLabel, FoodOption.sodaPrice);
        sPriceLabel.setBounds(580, 520, 60, 30);

        msPriceLabel = new JLabel();
        priceLabel(msPriceLabel, FoodOption.milkPrice);
        msPriceLabel.setBounds(830, 520, 60, 30);

        jPriceLabel = new JLabel();
        priceLabel(jPriceLabel, FoodOption.juicePrice);
        jPriceLabel.setBounds(1080, 520, 60, 30);

        lPriceLabel = new JLabel();
        priceLabel(lPriceLabel, FoodOption.lassiPrice);
        lPriceLabel.setBounds(1330, 520, 60, 30);


        simrPriceLabel = new JLabel();
        priceLabel(simrPriceLabel, FoodOption.simRicePrice);
        simrPriceLabel.setBounds(520, 235, 60, 30);

        pPriceLabel = new JLabel();
        priceLabel(pPriceLabel, FoodOption.polaoPrice);
        pPriceLabel.setBounds(520, 315, 60, 30);

        frPriceLabel = new JLabel();
        priceLabel(frPriceLabel, FoodOption.friedRPrice);
        frPriceLabel.setBounds(520, 395, 60, 30);


        avPriceLabel = new JLabel();
        priceLabel(avPriceLabel, FoodOption.aluPrice);
        avPriceLabel.setBounds(740, 235, 60, 30);

        sobjiPriceLabel = new JLabel();
        priceLabel(sobjiPriceLabel, FoodOption.sobjiPrice);
        sobjiPriceLabel.setBounds(740, 315, 60, 30);

        svPriceLabel = new JLabel();
        priceLabel(svPriceLabel, FoodOption.sheemPrice);
        svPriceLabel.setBounds(740, 395, 60, 30);


        mPriceLabel = new JLabel();
        priceLabel(mPriceLabel,FoodOption.muttonPrice);
        mPriceLabel.setBounds(960, 315, 60, 30);

        chickenPriceLabel = new JLabel();
        priceLabel(chickenPriceLabel, FoodOption.chickenPrice);
        chickenPriceLabel.setBounds(960, 395, 60, 30);

        beefPriceLabel = new JLabel();
        priceLabel(beefPriceLabel,FoodOption.beefPrice);
        beefPriceLabel.setBounds(960, 230, 60, 30);

        iPriceLabel = new JLabel();
        priceLabel(iPriceLabel,FoodOption.ilishPrice);
        iPriceLabel.setBounds(1180, 235, 60, 30);

        chingriPriceLabel = new JLabel();
        priceLabel(chingriPriceLabel, FoodOption.chingriPrice);
        chingriPriceLabel.setBounds(1180, 315, 60, 30);

        pabdaPriceLabel = new JLabel();
        priceLabel(pabdaPriceLabel, FoodOption.pabdaPrice);
        pabdaPriceLabel.setBounds(1180, 395, 60, 30);


        kPriceLabel = new JLabel();
        priceLabel(kPriceLabel, FoodOption.kimchiPrice);
        kPriceLabel.setBounds(1400, 235, 60, 30);

        birianyPriceLabel = new JLabel();
        priceLabel(birianyPriceLabel, FoodOption.chiBirianyPrice);
        birianyPriceLabel.setBounds(1430, 315, 60, 30);

        teheriPriceLabel = new JLabel();
        priceLabel(teheriPriceLabel, FoodOption.teheriPrice);
        teheriPriceLabel.setBounds(1400, 395, 60, 30);







        label.setOpaque(true);


        SFP.add(label);
        SFP.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(b.getSelectedIndex()<price.length/2){
            a = (b.getSelectedIndex()+1)*10;}
        else{
            a = - (price.length-b.getSelectedIndex())*10;}


        if(e.getSource() == ben_button)
        {
            iPriceLabel.setVisible(false);
            chingriPriceLabel.setVisible(false);
            pabdaPriceLabel.setVisible(false);

            kPriceLabel.setVisible(false);
            birianyPriceLabel.setVisible(false);
            teheriPriceLabel.setVisible(false);

            avPriceLabel.setVisible(false);
            sobjiPriceLabel.setVisible(false);
            svPriceLabel.setVisible(false);

            mPriceLabel.setVisible(false);
            chickenPriceLabel.setVisible(false);
            beefPriceLabel.setVisible(false);

            sPriceLabel.setVisible(false);
            msPriceLabel.setVisible(false);
            jPriceLabel.setVisible(false);
            lPriceLabel.setVisible(false);

            simrPriceLabel.setVisible(false);
            pPriceLabel.setVisible(false);
            frPriceLabel.setVisible(false);

            bPriceLabel.setVisible(false);
            tbPriceLabel.setVisible(false);
            bbPriceLabel.setVisible(false);
            kimchiPriceLabel.setVisible(false);

            srPriceLabel.setVisible(false);
            ptPriceLabel.setVisible(false);
            stPriceLabel.setVisible(false);

            riceButton.setVisible(true);
            vegButton.setVisible(true);
            meatButton.setVisible(true);
            fishButton.setVisible(true);
            cBenButton.setVisible(true);

            hotpButton.setVisible(false);
            cuisineButton.setVisible(false);
            noodlesButton.setVisible(false);

            hpPriceLabel.setVisible(false);
            cPriceLabel.setVisible(false);
            nPriceLabel.setVisible(false);

            stickyrButton.setVisible(false);
            padthaiButton.setVisible(false);
            somtumButton.setVisible(false);

            bulgogiButton.setVisible(false);
            tokButton.setVisible(false);
            bibimbapButton.setVisible(false);
            kimchiButton.setVisible(false);

            sodaButton.setVisible(false);
            juiceButton.setVisible(false);
            milkButton.setVisible(false);
            lassiButton.setVisible(false);

            simRiceButton.setVisible(false);
            polaoButton.setVisible(false);
            friedRiceButton.setVisible(false);

            aluButton.setVisible(false);
            sobjiButton.setVisible(false);
            sheemButton.setVisible(false);

            beefButton.setVisible(false);
            muttonButton.setVisible(false);
            chickenButton.setVisible(false);

            ilishButton.setVisible(false);
            chingriButton.setVisible(false);
            pabdaButton.setVisible(false);

            kacchiButton.setVisible(false);
            chickenBirianyButton.setVisible(false);
            teheriButton.setVisible(false);
        }

        else if(e.getSource() == chin_button)
        {
            iPriceLabel.setVisible(false);
            chingriPriceLabel.setVisible(false);
            pabdaPriceLabel.setVisible(false);

            kPriceLabel.setVisible(false);
            birianyPriceLabel.setVisible(false);
            teheriPriceLabel.setVisible(false);

            avPriceLabel.setVisible(false);
            sobjiPriceLabel.setVisible(false);
            svPriceLabel.setVisible(false);

            mPriceLabel.setVisible(false);
            chickenPriceLabel.setVisible(false);
            beefPriceLabel.setVisible(false);

            sPriceLabel.setVisible(false);
            msPriceLabel.setVisible(false);
            jPriceLabel.setVisible(false);
            lPriceLabel.setVisible(false);

            simrPriceLabel.setVisible(false);
            pPriceLabel.setVisible(false);
            frPriceLabel.setVisible(false);

            bPriceLabel.setVisible(false);
            tbPriceLabel.setVisible(false);
            bbPriceLabel.setVisible(false);
            kimchiPriceLabel.setVisible(false);

            srPriceLabel.setVisible(false);
            ptPriceLabel.setVisible(false);
            stPriceLabel.setVisible(false);

            hotpButton.setVisible(true);
            cuisineButton.setVisible(true);
            noodlesButton.setVisible(true);

            hpPriceLabel.setVisible(true);
            cPriceLabel.setVisible(true);
            nPriceLabel.setVisible(true);

            stickyrButton.setVisible(false);
            padthaiButton.setVisible(false);
            somtumButton.setVisible(false);

            bulgogiButton.setVisible(false);
            tokButton.setVisible(false);
            bibimbapButton.setVisible(false);
            kimchiButton.setVisible(false);

            sodaButton.setVisible(false);
            juiceButton.setVisible(false);
            milkButton.setVisible(false);
            lassiButton.setVisible(false);

            simRiceButton.setVisible(false);
            polaoButton.setVisible(false);
            friedRiceButton.setVisible(false);

            aluButton.setVisible(false);
            sobjiButton.setVisible(false);
            sheemButton.setVisible(false);

            beefButton.setVisible(false);
            muttonButton.setVisible(false);
            chickenButton.setVisible(false);

            ilishButton.setVisible(false);
            chingriButton.setVisible(false);
            pabdaButton.setVisible(false);

            kacchiButton.setVisible(false);
            chickenBirianyButton.setVisible(false);
            teheriButton.setVisible(false);

            riceButton.setVisible(false);
            vegButton.setVisible(false);
            meatButton.setVisible(false);
            fishButton.setVisible(false);
            cBenButton.setVisible(false);
        }

        else if(e.getSource() == thai_button)
        {
            iPriceLabel.setVisible(false);
            chingriPriceLabel.setVisible(false);
            pabdaPriceLabel.setVisible(false);

            kPriceLabel.setVisible(false);
            birianyPriceLabel.setVisible(false);
            teheriPriceLabel.setVisible(false);

            avPriceLabel.setVisible(false);
            sobjiPriceLabel.setVisible(false);
            svPriceLabel.setVisible(false);

            mPriceLabel.setVisible(false);
            chickenPriceLabel.setVisible(false);
            beefPriceLabel.setVisible(false);

            sPriceLabel.setVisible(false);
            msPriceLabel.setVisible(false);
            jPriceLabel.setVisible(false);
            lPriceLabel.setVisible(false);

            simrPriceLabel.setVisible(false);
            pPriceLabel.setVisible(false);
            frPriceLabel.setVisible(false);

            bPriceLabel.setVisible(false);
            tbPriceLabel.setVisible(false);
            bbPriceLabel.setVisible(false);
            kimchiPriceLabel.setVisible(false);

            stickyrButton.setVisible(true);
            padthaiButton.setVisible(true);
            somtumButton.setVisible(true);

            srPriceLabel.setVisible(true);
            ptPriceLabel.setVisible(true);
            stPriceLabel.setVisible(true);

            bulgogiButton.setVisible(false);
            tokButton.setVisible(false);
            bibimbapButton.setVisible(false);
            kimchiButton.setVisible(false);

            sodaButton.setVisible(false);
            juiceButton.setVisible(false);
            milkButton.setVisible(false);
            lassiButton.setVisible(false);

            simRiceButton.setVisible(false);
            polaoButton.setVisible(false);
            friedRiceButton.setVisible(false);

            aluButton.setVisible(false);
            sobjiButton.setVisible(false);
            sheemButton.setVisible(false);

            beefButton.setVisible(false);
            muttonButton.setVisible(false);
            chickenButton.setVisible(false);

            ilishButton.setVisible(false);
            chingriButton.setVisible(false);
            pabdaButton.setVisible(false);

            kacchiButton.setVisible(false);
            chickenBirianyButton.setVisible(false);
            teheriButton.setVisible(false);

            riceButton.setVisible(false);
            vegButton.setVisible(false);
            meatButton.setVisible(false);
            fishButton.setVisible(false);
            cBenButton.setVisible(false);

            hotpButton.setVisible(false);
            cuisineButton.setVisible(false);
            noodlesButton.setVisible(false);

            hpPriceLabel.setVisible(false);
            cPriceLabel.setVisible(false);
            nPriceLabel.setVisible(false);
        }

        else if(e.getSource() == kor_button)
        {
            iPriceLabel.setVisible(false);
            chingriPriceLabel.setVisible(false);
            pabdaPriceLabel.setVisible(false);

            kPriceLabel.setVisible(false);
            birianyPriceLabel.setVisible(false);
            teheriPriceLabel.setVisible(false);

            avPriceLabel.setVisible(false);
            sobjiPriceLabel.setVisible(false);
            svPriceLabel.setVisible(false);

            mPriceLabel.setVisible(false);
            chickenPriceLabel.setVisible(false);
            beefPriceLabel.setVisible(false);

            sPriceLabel.setVisible(false);
            msPriceLabel.setVisible(false);
            jPriceLabel.setVisible(false);
            lPriceLabel.setVisible(false);

            simrPriceLabel.setVisible(false);
            pPriceLabel.setVisible(false);
            frPriceLabel.setVisible(false);

            bPriceLabel.setVisible(true);
            tbPriceLabel.setVisible(true);
            bbPriceLabel.setVisible(true);
            kimchiPriceLabel.setVisible(true);

            srPriceLabel.setVisible(false);
            ptPriceLabel.setVisible(false);
            stPriceLabel.setVisible(false);

            bulgogiButton.setVisible(true);
            tokButton.setVisible(true);
            bibimbapButton.setVisible(true);
            kimchiButton.setVisible(true);

            sodaButton.setVisible(false);
            juiceButton.setVisible(false);
            milkButton.setVisible(false);
            lassiButton.setVisible(false);

            simRiceButton.setVisible(false);
            polaoButton.setVisible(false);
            friedRiceButton.setVisible(false);

            aluButton.setVisible(false);
            sobjiButton.setVisible(false);
            sheemButton.setVisible(false);

            beefButton.setVisible(false);
            muttonButton.setVisible(false);
            chickenButton.setVisible(false);

            ilishButton.setVisible(false);
            chingriButton.setVisible(false);
            pabdaButton.setVisible(false);

            kacchiButton.setVisible(false);
            chickenBirianyButton.setVisible(false);
            teheriButton.setVisible(false);

            riceButton.setVisible(false);
            vegButton.setVisible(false);
            meatButton.setVisible(false);
            fishButton.setVisible(false);
            cBenButton.setVisible(false);

            hotpButton.setVisible(false);
            cuisineButton.setVisible(false);
            noodlesButton.setVisible(false);

            hpPriceLabel.setVisible(false);
            cPriceLabel.setVisible(false);
            nPriceLabel.setVisible(false);

            stickyrButton.setVisible(false);
            padthaiButton.setVisible(false);
            somtumButton.setVisible(false);
        }
        else if (e.getSource() == drinks_button)
        {
            iPriceLabel.setVisible(false);
            chingriPriceLabel.setVisible(false);
            pabdaPriceLabel.setVisible(false);

            kPriceLabel.setVisible(false);
            birianyPriceLabel.setVisible(false);
            teheriPriceLabel.setVisible(false);

            avPriceLabel.setVisible(false);
            sobjiPriceLabel.setVisible(false);
            svPriceLabel.setVisible(false);

            mPriceLabel.setVisible(false);
            chickenPriceLabel.setVisible(false);
            beefPriceLabel.setVisible(false);

            sPriceLabel.setVisible(true);
            msPriceLabel.setVisible(true);
            jPriceLabel.setVisible(true);
            lPriceLabel.setVisible(true);

            simrPriceLabel.setVisible(false);
            pPriceLabel.setVisible(false);
            frPriceLabel.setVisible(false);

            bPriceLabel.setVisible(false);
            tbPriceLabel.setVisible(false);
            bbPriceLabel.setVisible(false);
            kimchiPriceLabel.setVisible(false);

            srPriceLabel.setVisible(false);
            ptPriceLabel.setVisible(false);
            stPriceLabel.setVisible(false);

            sodaButton.setVisible(true);
            juiceButton.setVisible(true);
            milkButton.setVisible(true);
            lassiButton.setVisible(true);

            simRiceButton.setVisible(false);
            polaoButton.setVisible(false);
            friedRiceButton.setVisible(false);

            aluButton.setVisible(false);
            sobjiButton.setVisible(false);
            sheemButton.setVisible(false);

            beefButton.setVisible(false);
            muttonButton.setVisible(false);
            chickenButton.setVisible(false);

            ilishButton.setVisible(false);
            chingriButton.setVisible(false);
            pabdaButton.setVisible(false);

            kacchiButton.setVisible(false);
            chickenBirianyButton.setVisible(false);
            teheriButton.setVisible(false);

            riceButton.setVisible(false);
            vegButton.setVisible(false);
            meatButton.setVisible(false);
            fishButton.setVisible(false);
            cBenButton.setVisible(false);

            hotpButton.setVisible(false);
            cuisineButton.setVisible(false);
            noodlesButton.setVisible(false);

            hpPriceLabel.setVisible(false);
            cPriceLabel.setVisible(false);
            nPriceLabel.setVisible(false);

            stickyrButton.setVisible(false);
            padthaiButton.setVisible(false);
            somtumButton.setVisible(false);

            bulgogiButton.setVisible(false);
            tokButton.setVisible(false);
            bibimbapButton.setVisible(false);
            kimchiButton.setVisible(false);

            simRiceButton.setVisible(false);
            polaoButton.setVisible(false);
            friedRiceButton.setVisible(false);
        }
        else if(e.getSource() == riceButton)
        {
            iPriceLabel.setVisible(false);
            chingriPriceLabel.setVisible(false);
            pabdaPriceLabel.setVisible(false);

            kPriceLabel.setVisible(false);
            birianyPriceLabel.setVisible(false);
            teheriPriceLabel.setVisible(false);

            avPriceLabel.setVisible(false);
            sobjiPriceLabel.setVisible(false);
            svPriceLabel.setVisible(false);

            mPriceLabel.setVisible(false);
            chickenPriceLabel.setVisible(false);
            beefPriceLabel.setVisible(false);

            sPriceLabel.setVisible(false);
            msPriceLabel.setVisible(false);
            jPriceLabel.setVisible(false);
            lPriceLabel.setVisible(false);

            simrPriceLabel.setVisible(true);
            pPriceLabel.setVisible(true);
            frPriceLabel.setVisible(true);

            bPriceLabel.setVisible(false);
            tbPriceLabel.setVisible(false);
            bbPriceLabel.setVisible(false);
            kimchiPriceLabel.setVisible(false);

            srPriceLabel.setVisible(false);
            ptPriceLabel.setVisible(false);
            stPriceLabel.setVisible(false);

            simRiceButton.setVisible(true);
            polaoButton.setVisible(true);
            friedRiceButton.setVisible(true);

            aluButton.setVisible(false);
            sobjiButton.setVisible(false);
            sheemButton.setVisible(false);

            beefButton.setVisible(false);
            muttonButton.setVisible(false);
            chickenButton.setVisible(false);

            ilishButton.setVisible(false);
            chingriButton.setVisible(false);
            pabdaButton.setVisible(false);

            kacchiButton.setVisible(false);
            chickenBirianyButton.setVisible(false);
            teheriButton.setVisible(false);

            riceButton.setVisible(true);
            vegButton.setVisible(true);
            meatButton.setVisible(true);
            fishButton.setVisible(true);
            cBenButton.setVisible(true);

            hotpButton.setVisible(false);
            cuisineButton.setVisible(false);
            noodlesButton.setVisible(false);

            hpPriceLabel.setVisible(false);
            cPriceLabel.setVisible(false);
            nPriceLabel.setVisible(false);

            stickyrButton.setVisible(false);
            padthaiButton.setVisible(false);
            somtumButton.setVisible(false);

            bulgogiButton.setVisible(false);
            tokButton.setVisible(false);
            bibimbapButton.setVisible(false);
            kimchiButton.setVisible(false);

            sodaButton.setVisible(false);
            juiceButton.setVisible(false);
            milkButton.setVisible(false);
            lassiButton.setVisible(false);


        }

        else if(e.getSource() == vegButton)
        {
            iPriceLabel.setVisible(false);
            chingriPriceLabel.setVisible(false);
            pabdaPriceLabel.setVisible(false);

            kPriceLabel.setVisible(false);
            birianyPriceLabel.setVisible(false);
            teheriPriceLabel.setVisible(false);

            avPriceLabel.setVisible(true);
            sobjiPriceLabel.setVisible(true);
            svPriceLabel.setVisible(true);

            mPriceLabel.setVisible(false);
            chickenPriceLabel.setVisible(false);
            beefPriceLabel.setVisible(false);

            sPriceLabel.setVisible(false);
            msPriceLabel.setVisible(false);
            jPriceLabel.setVisible(false);
            lPriceLabel.setVisible(false);

            simrPriceLabel.setVisible(false);
            pPriceLabel.setVisible(false);
            frPriceLabel.setVisible(false);

            bPriceLabel.setVisible(false);
            tbPriceLabel.setVisible(false);
            bbPriceLabel.setVisible(false);
            kimchiPriceLabel.setVisible(false);

            srPriceLabel.setVisible(false);
            ptPriceLabel.setVisible(false);
            stPriceLabel.setVisible(false);

            aluButton.setVisible(true);
            sobjiButton.setVisible(true);
            sheemButton.setVisible(true);

            beefButton.setVisible(false);
            muttonButton.setVisible(false);
            chickenButton.setVisible(false);

            ilishButton.setVisible(false);
            chingriButton.setVisible(false);
            pabdaButton.setVisible(false);

            kacchiButton.setVisible(false);
            chickenBirianyButton.setVisible(false);
            teheriButton.setVisible(false);

            riceButton.setVisible(true);
            vegButton.setVisible(true);
            meatButton.setVisible(true);
            fishButton.setVisible(true);
            cBenButton.setVisible(true);

            hotpButton.setVisible(false);
            cuisineButton.setVisible(false);
            noodlesButton.setVisible(false);

            hpPriceLabel.setVisible(false);
            cPriceLabel.setVisible(false);
            nPriceLabel.setVisible(false);

            stickyrButton.setVisible(false);
            padthaiButton.setVisible(false);
            somtumButton.setVisible(false);

            bulgogiButton.setVisible(false);
            tokButton.setVisible(false);
            bibimbapButton.setVisible(false);
            kimchiButton.setVisible(false);

            sodaButton.setVisible(false);
            juiceButton.setVisible(false);
            milkButton.setVisible(false);
            lassiButton.setVisible(false);

            simRiceButton.setVisible(false);
            polaoButton.setVisible(false);
            friedRiceButton.setVisible(false);
        }

        else if(e.getSource() == meatButton)
        {
            iPriceLabel.setVisible(false);
            chingriPriceLabel.setVisible(false);
            pabdaPriceLabel.setVisible(false);

            kPriceLabel.setVisible(false);
            birianyPriceLabel.setVisible(false);
            teheriPriceLabel.setVisible(false);

            avPriceLabel.setVisible(false);
            sobjiPriceLabel.setVisible(false);
            svPriceLabel.setVisible(false);

            mPriceLabel.setVisible(true);
            chickenPriceLabel.setVisible(true);
            beefPriceLabel.setVisible(true);

            sPriceLabel.setVisible(false);
            msPriceLabel.setVisible(false);
            jPriceLabel.setVisible(false);
            lPriceLabel.setVisible(false);

            simrPriceLabel.setVisible(false);
            pPriceLabel.setVisible(false);
            frPriceLabel.setVisible(false);

            bPriceLabel.setVisible(false);
            tbPriceLabel.setVisible(false);
            bbPriceLabel.setVisible(false);
            kimchiPriceLabel.setVisible(false);

            srPriceLabel.setVisible(false);
            ptPriceLabel.setVisible(false);
            stPriceLabel.setVisible(false);

            beefButton.setVisible(true);
            muttonButton.setVisible(true);
            chickenButton.setVisible(true);

            ilishButton.setVisible(false);
            chingriButton.setVisible(false);
            pabdaButton.setVisible(false);

            kacchiButton.setVisible(false);
            chickenBirianyButton.setVisible(false);
            teheriButton.setVisible(false);

            riceButton.setVisible(true);
            vegButton.setVisible(true);
            meatButton.setVisible(true);
            fishButton.setVisible(true);
            cBenButton.setVisible(true);

            hotpButton.setVisible(false);
            cuisineButton.setVisible(false);
            noodlesButton.setVisible(false);

            hpPriceLabel.setVisible(false);
            cPriceLabel.setVisible(false);
            nPriceLabel.setVisible(false);

            stickyrButton.setVisible(false);
            padthaiButton.setVisible(false);
            somtumButton.setVisible(false);

            bulgogiButton.setVisible(false);
            tokButton.setVisible(false);
            bibimbapButton.setVisible(false);
            kimchiButton.setVisible(false);

            sodaButton.setVisible(false);
            juiceButton.setVisible(false);
            milkButton.setVisible(false);
            lassiButton.setVisible(false);

            aluButton.setVisible(false);
            sobjiButton.setVisible(false);
            sheemButton.setVisible(false);

            simRiceButton.setVisible(false);
            polaoButton.setVisible(false);
            friedRiceButton.setVisible(false);
        }

        else if(e.getSource() == fishButton)
        {
            iPriceLabel.setVisible(true);
            chingriPriceLabel.setVisible(true);
            pabdaPriceLabel.setVisible(true);

            kPriceLabel.setVisible(false);
            birianyPriceLabel.setVisible(false);
            teheriPriceLabel.setVisible(false);

            avPriceLabel.setVisible(false);
            sobjiPriceLabel.setVisible(false);
            svPriceLabel.setVisible(false);

            mPriceLabel.setVisible(false);
            chickenPriceLabel.setVisible(false);
            beefPriceLabel.setVisible(false);

            sPriceLabel.setVisible(false);
            msPriceLabel.setVisible(false);
            jPriceLabel.setVisible(false);
            lPriceLabel.setVisible(false);

            simrPriceLabel.setVisible(false);
            pPriceLabel.setVisible(false);
            frPriceLabel.setVisible(false);

            bPriceLabel.setVisible(false);
            tbPriceLabel.setVisible(false);
            bbPriceLabel.setVisible(false);
            kimchiPriceLabel.setVisible(false);

            srPriceLabel.setVisible(false);
            ptPriceLabel.setVisible(false);
            stPriceLabel.setVisible(false);

            ilishButton.setVisible(true);
            chingriButton.setVisible(true);
            pabdaButton.setVisible(true);

            kacchiButton.setVisible(false);
            chickenBirianyButton.setVisible(false);
            teheriButton.setVisible(false);

            riceButton.setVisible(true);
            vegButton.setVisible(true);
            meatButton.setVisible(true);
            fishButton.setVisible(true);
            cBenButton.setVisible(true);

            hotpButton.setVisible(false);
            cuisineButton.setVisible(false);
            noodlesButton.setVisible(false);

            hpPriceLabel.setVisible(false);
            cPriceLabel.setVisible(false);
            nPriceLabel.setVisible(false);

            stickyrButton.setVisible(false);
            padthaiButton.setVisible(false);
            somtumButton.setVisible(false);

            bulgogiButton.setVisible(false);
            tokButton.setVisible(false);
            bibimbapButton.setVisible(false);
            kimchiButton.setVisible(false);

            sodaButton.setVisible(false);
            juiceButton.setVisible(false);
            milkButton.setVisible(false);
            lassiButton.setVisible(false);

            aluButton.setVisible(false);
            sobjiButton.setVisible(false);
            sheemButton.setVisible(false);

            beefButton.setVisible(false);
            muttonButton.setVisible(false);
            chickenButton.setVisible(false);

            simRiceButton.setVisible(false);
            polaoButton.setVisible(false);
            friedRiceButton.setVisible(false);
        }

        else if(e.getSource() == cBenButton)
        {
            iPriceLabel.setVisible(false);
            chingriPriceLabel.setVisible(false);
            pabdaPriceLabel.setVisible(false);

            kPriceLabel.setVisible(true);
            birianyPriceLabel.setVisible(true);
            teheriPriceLabel.setVisible(true);

            avPriceLabel.setVisible(false);
            sobjiPriceLabel.setVisible(false);
            svPriceLabel.setVisible(false);

            mPriceLabel.setVisible(false);
            chickenPriceLabel.setVisible(false);
            beefPriceLabel.setVisible(false);

            sPriceLabel.setVisible(false);
            msPriceLabel.setVisible(false);
            jPriceLabel.setVisible(false);
            lPriceLabel.setVisible(false);

            simrPriceLabel.setVisible(false);
            pPriceLabel.setVisible(false);
            frPriceLabel.setVisible(false);

            bPriceLabel.setVisible(false);
            tbPriceLabel.setVisible(false);
            bbPriceLabel.setVisible(false);
            kimchiPriceLabel.setVisible(false);

            srPriceLabel.setVisible(false);
            ptPriceLabel.setVisible(false);
            stPriceLabel.setVisible(false);

            kacchiButton.setVisible(true);
            chickenBirianyButton.setVisible(true);
            teheriButton.setVisible(true);

            riceButton.setVisible(true);
            vegButton.setVisible(true);
            meatButton.setVisible(true);
            fishButton.setVisible(true);
            cBenButton.setVisible(true);

            hotpButton.setVisible(false);
            cuisineButton.setVisible(false);
            noodlesButton.setVisible(false);

            hpPriceLabel.setVisible(false);
            cPriceLabel.setVisible(false);
            nPriceLabel.setVisible(false);

            stickyrButton.setVisible(false);
            padthaiButton.setVisible(false);
            somtumButton.setVisible(false);

            bulgogiButton.setVisible(false);
            tokButton.setVisible(false);
            bibimbapButton.setVisible(false);
            kimchiButton.setVisible(false);

            sodaButton.setVisible(false);
            juiceButton.setVisible(false);
            milkButton.setVisible(false);
            lassiButton.setVisible(false);

            aluButton.setVisible(false);
            sobjiButton.setVisible(false);
            sheemButton.setVisible(false);

            beefButton.setVisible(false);
            muttonButton.setVisible(false);
            chickenButton.setVisible(false);

            ilishButton.setVisible(false);
            chingriButton.setVisible(false);
            pabdaButton.setVisible(false);

            simRiceButton.setVisible(false);
            polaoButton.setVisible(false);
            friedRiceButton.setVisible(false);
        }
        else if (e.getSource() == ba_Button) {
            SFP.dispose();
            new Manager();
        }


        if (hotpButton.equals(e.getSource())) {
            hotpButton.setBackground(Color.orange);
            FoodOption.hotPotPrice = FoodOption.hotPotPrice +a;
            hpPriceLabel.setText(String.valueOf(FoodOption.hotPotPrice));
        }
        else if(cuisineButton.equals(e.getSource())) {
            cuisineButton.setBackground(Color.orange);
            FoodOption.cuisinePrice =FoodOption.cuisinePrice +a;
            cPriceLabel.setText(String.valueOf(FoodOption.cuisinePrice));

        }
        else if(noodlesButton.equals(e.getSource())) {

            noodlesButton.setBackground(Color.orange);
            FoodOption.noodlesPrice =FoodOption.noodlesPrice +a;
            nPriceLabel.setText(String.valueOf(FoodOption.noodlesPrice));
        }
        else if(stickyrButton.equals(e.getSource())) {
            stickyrButton.setBackground(Color.orange);
            FoodOption.stickyRPrice=FoodOption.stickyRPrice +a;
            srPriceLabel.setText(String.valueOf(FoodOption.stickyRPrice));

        }
        else if(padthaiButton.equals(e.getSource())) {
            padthaiButton.setBackground(Color.orange);
            FoodOption.padthaiPrice=FoodOption.padthaiPrice +a;
            ptPriceLabel.setText(String.valueOf(FoodOption.padthaiPrice));

        }
        else if(somtumButton.equals(e.getSource())) {
            somtumButton.setBackground(Color.orange);
            FoodOption.somtumPrice=FoodOption.somtumPrice +a;
            stPriceLabel.setText(String.valueOf(FoodOption.somtumPrice));

        }
        else if(bulgogiButton.equals(e.getSource())) {
            bulgogiButton.setBackground(Color.orange);
            FoodOption.bulgogiPrice=FoodOption.bulgogiPrice +a;
            bPriceLabel.setText(String.valueOf(FoodOption.bulgogiPrice));


        }
        else if(tokButton.equals(e.getSource())) {
            tokButton.setBackground(Color.orange);
            FoodOption.tokPrice =FoodOption.tokPrice +a;
            tbPriceLabel.setText(String.valueOf(FoodOption.tokPrice));

        }
        else if(bibimbapButton.equals(e.getSource())) {
            bibimbapButton.setBackground(Color.orange);
            FoodOption.bibimbapPrice =FoodOption.bibimbapPrice +a;
            bbPriceLabel.setText(String.valueOf(FoodOption.bibimbapPrice));

        }
        else if(kimchiButton.equals(e.getSource())) {
            kimchiButton.setBackground(Color.orange);

            FoodOption.kimchiPrice =FoodOption.kimchiPrice +a;
            kimchiPriceLabel.setText(String.valueOf(FoodOption.kimchiPrice));

        }
        else if(sodaButton.equals(e.getSource())) {
            sodaButton.setBackground(Color.orange);
            FoodOption.sodaPrice =FoodOption.sodaPrice +a;
            sPriceLabel.setText(String.valueOf(FoodOption.sodaPrice));
        }
        else if(milkButton.equals(e.getSource())) {
            milkButton.setBackground(Color.orange);
            FoodOption.milkPrice =FoodOption.milkPrice +a;
            msPriceLabel.setText(String.valueOf(FoodOption.milkPrice));
        }
        else if(juiceButton.equals(e.getSource())) {
            juiceButton.setBackground(Color.orange);
            FoodOption.juicePrice =FoodOption.juicePrice +a;
            jPriceLabel.setText(String.valueOf(FoodOption.juicePrice));

        }
        else if(lassiButton.equals(e.getSource())) {
            lassiButton.setBackground(Color.orange);
            FoodOption.lassiPrice =FoodOption.lassiPrice +a;
            lPriceLabel.setText(String.valueOf(FoodOption.lassiPrice));

        }
        else if(simRiceButton.equals(e.getSource())) {
            simRiceButton.setBackground(Color.orange);
            FoodOption.simRicePrice =FoodOption.simRicePrice +a;
            simrPriceLabel.setText(String.valueOf(FoodOption.simRicePrice));

        }
        else if(polaoButton.equals(e.getSource())) {
            polaoButton.setBackground(Color.orange);
            FoodOption.polaoPrice =FoodOption.polaoPrice +a;
            pPriceLabel.setText(String.valueOf(FoodOption.polaoPrice));


        }
        else if(friedRiceButton.equals(e.getSource())) {
            friedRiceButton.setBackground(Color.orange);
            FoodOption.friedRPrice =FoodOption.friedRPrice +a;
            frPriceLabel.setText(String.valueOf(FoodOption.friedRPrice));

        }
        else if(aluButton.equals(e.getSource())) {
            aluButton.setBackground(Color.orange);
            FoodOption.aluPrice =FoodOption.aluPrice +a;
            avPriceLabel.setText(String.valueOf(FoodOption.aluPrice));


        }
        else if(sobjiButton.equals(e.getSource())) {
            sobjiButton.setBackground(Color.orange);
            FoodOption.sobjiPrice =FoodOption.sobjiPrice +a;
            sobjiPriceLabel.setText(String.valueOf(FoodOption.sobjiPrice));


        }
        else if(sheemButton.equals(e.getSource())) {
            sheemButton.setBackground(Color.orange);
            FoodOption. sheemPrice =FoodOption.sheemPrice +a;
            svPriceLabel.setText(String.valueOf(FoodOption.sobjiPrice));

        }
        else if(muttonButton.equals(e.getSource())) {
            muttonButton.setBackground(Color.orange);
            FoodOption. muttonPrice =FoodOption.muttonPrice +a;
            mPriceLabel.setText(String.valueOf(FoodOption.muttonPrice));

        }
        else if(beefButton.equals(e.getSource())) {
            beefButton.setBackground(Color.orange);
            FoodOption.beefPrice =FoodOption.beefPrice +a;
            beefPriceLabel.setText(String.valueOf(FoodOption.beefPrice));


        }
        else if(chickenButton.equals(e.getSource())) {
            chickenButton.setBackground(Color.orange);
            FoodOption.chickenPrice =FoodOption.chickenPrice +a;
            chickenPriceLabel.setText(String.valueOf(FoodOption.muttonPrice));

        }
        else if(ilishButton.equals(e.getSource())) {
            ilishButton.setBackground(Color.orange);
            FoodOption. ilishPrice = FoodOption.ilishPrice +a;
            iPriceLabel.setText(String.valueOf(FoodOption.ilishPrice));

        }
        else if(chingriButton.equals(e.getSource())) {
            chingriButton.setBackground(Color.orange);
            FoodOption.chingriPrice = FoodOption.chingriPrice +a;
            chingriPriceLabel.setText(String.valueOf(FoodOption.chingriPrice));

        }
        else if(pabdaButton.equals(e.getSource())) {
            pabdaButton.setBackground(Color.orange);
            FoodOption.pabdaPrice = FoodOption.pabdaPrice +a;
            pabdaPriceLabel.setText(String.valueOf(FoodOption.pabdaPrice));


        }
        else if(kacchiButton.equals(e.getSource())) {
            kacchiButton.setBackground(Color.orange);
            FoodOption. kacchiPrice= FoodOption. kacchiPrice +a;
            kPriceLabel.setText(String.valueOf(FoodOption. kacchiPrice));

        }
        else if(chickenBirianyButton.equals(e.getSource())) {
            chickenBirianyButton.setBackground(Color.orange);
            FoodOption. chiBirianyPrice= FoodOption. chiBirianyPrice +a;
            birianyPriceLabel.setText(String.valueOf( FoodOption.chiBirianyPrice));


        }
        else if(teheriButton.equals(e.getSource())) {
            teheriButton.setBackground(Color.orange);
            FoodOption.teheriPrice =  FoodOption.teheriPrice +a;
            teheriPriceLabel.setText(String.valueOf(  FoodOption.teheriPrice));


        }


    }

}
