import javax.swing.*;
import java.util.HashMap;

public class Staff_info {

   static HashMap<String, Integer> SI =new HashMap<String, Integer>();
   static HashMap<Integer, Integer> PI =new HashMap<Integer, Integer>();
    {
        SI.put("Raihan Alom",0);SI.put("Imtiz Sumon",1);SI.put("Badol Akhon",2);SI.put("Noyon",3);
        SI.put("Laboni Begum",4);SI.put("Fahad Ali",5);SI.put("Roni",6);SI.put("Kamal",7);SI.put("Rakib",8);
        SI.put("Jeddal Mollah",9);SI.put("Rasel",10);SI.put("Fatema begum",11);SI.put("Nahid",12);
        SI.put("Sahalom",13);


        PI.put(0,0);PI.put(1,1);PI.put(2,2);PI.put(3,4);
        PI.put(4,5);PI.put(5,12);

    }

    static String[] sp = {"Manager","Executive Chef","Assistant Chef","Assistant Chef","Senior Waiter","Waiter",
            "Waiter","Waiter","Waiter","Waiter","Waiter","Waiter","Dishwasher","Dishwasher"};
    static int[] ss ={40000,35000,30000,30000,25000,20000,20000,20000,20000,20000,20000,20000,15000,15000};
    final String[] jd ={"03-04-2022","03-05-2022","16-04-2022","11-06-2022","03-05-2022","03-06-2022","03-06-2022",
            "03-06-2022","03-06-2022","03-06-2022","03-06-2022","03-06-2022","03-06-2022","03-06-2022"};

}
