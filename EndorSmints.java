
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class EndorSmints {
    private static int difficulty;
    
    
     private static String character;
    /**
     * This will make our character equal to an inputed person.
     * @param c 
     * @return  
     */
    public static String endorsmints(String c){
        character = c;
        return character;
    }
    /* this is starting population */
    public static int population = 100;
    /**
     * This gives you the starting value for the game. 
     */
    public static double ewoks;
    public static double survivedEwoks;
    /**
     * This is where all the code for what occurs to the ewoks will be.
     * @return
     */
    public static int ewoks(){
        if(Year == 0){
        ewoks = population;}
        else{
            ewoks = survivedEwoks;
        }
        
        /* this is what happens if a meteor shower occurs */
       Random x = new Random();
       int m;
       double z = 0;
       double y = 0;
       if(difficulty == 1)
           m =13;
            m = x.nextInt(100 - 1)+1;
        double e = ewoks;
        if(m < 12){
            System.out.println("You had a meteor shower occur");
             z = e * 0.09; /* ewoks that swam away */
             System.out.println("You had " + z + " ewoks swim away.");
             y = e * 0.28; /* ewoks that die */
             System.out.println("You had " + y + "ewoks die");
    }
        else
            System.out.println("You had 0 ewoks die to a meteor shower");
        /* This is what happens to unfed ewoks */
        int u;
        if(ewoks > (feed/20)){
          u = (int) (ewoks - (feed/20));
        System.out.println("You starved: " + u + "ewoks this year");}
        else{
            u = 0;
            System.out.println("This year you had 0 ewoks starve");
        }
        /**
         * This is the chance of imigrant ewoks.
         */
        int i;
        if(ewoks == (feed/20) & y == 0){
            int v = x.nextInt(1-0);
           i = (int) (((20 * acres + smints)/ (100 * survivedEwoks)+1)*(v));
           System.out.println("You had " + i + " imigrant ewoks swim over");
        }
        else{
            i = 0;
            System.out.println("This year you had 0 imigrant ewoks swim over");
        }
       /* This is all the lost ewoks */
       survivedEwoks = (int) (ewoks + i - (u + z + y));
        return (int) survivedEwoks;
        
    }
      
    /**
     * This gives starting value of acres.
     */
    public static int acres = 1000;
   
    /**
     * This gives us starting value of smints.

     */
    public static int supplys = 3000;
    public static int smints;
    /**
     * This is what occurs to smints through out each year.
     * @return 
     */
    public static int Smints(){
        if( Year == 0){
            if(difficulty==1)
                smints = supplys + 3000;
            else if(difficulty ==2)
                smints = supplys;
            else
                smints = 2000;
        }
        
        else{
          smints = totalSmints;}
        /*This does the calculations of smints that are used */
         int x = smints;
        smints = x + (s * price) - ((price * b) + feed + (planted * 2));
        /*occurance of Womp Rat */
        Random z = new Random();
        
        int r;
           
           if(difficulty == 1)
               r = 47;
           else
               r = z.nextInt(100 - 1)+1;
       if(r < 46){
           double a = smints * 0.4;
           double c = smints * 0.04;
           System.out.println("A womp Rat occurred");
           int w = (int) (z.nextInt((int) (a - c))+(c));
           
           System.out.println("You lost: " + w + " smints to The womp Rat" );
           smints = (int) (smints - w);  
       }
       else
           System.out.println("You lost 0 smints to a womp Rat");
       return smints;
        
    }
    /*This is the amount of smints in storage along with new smints */
    public static int totalSmints;
    /* this is the amount of smints you grow */
    public static int freshSmints;
    /**
     * This calculates the amount of smints harvested
     * @return 
     */
    public static int FreshSmints(){
        Random x = new Random();
       
            int q = x.nextInt(9 - 1)+1;
            freshSmints = planted * q;
        
        return freshSmints;
    }
    /**
     * This creates the new total of smints.
     * @return 
     */
    public static int TotalSmints(){
        totalSmints = freshSmints + smints;
        return totalSmints;
    }
    
/**
 * This gives you the year
 */
    public static int Year;
 
    public static int b;
    public static int s;
    /**
     * This is for buying/ selling land
     * @param boughtLand
     * @param soldLand
     * @return 
     */
    
    public static int landTrade(int boughtLand, int soldLand){
         b = boughtLand;
         s = soldLand;
       int a = acres;
        acres = b + a - s; 
       return acres;
    }
    public static int planted;
    /**
     * This will get the amount of land planted
     * @param p
     * @return 
     */
    public static int Planted(int p){
        planted = p;
        return planted;   
    }
    /**
     * Starting price of land
     */
    public static int price;
    /**
     * How to calculate the amount land is worth.
     * random # between 17 - 26
     * @return 
     */
    public static int LandValue(){
        Random r = new Random();
        if(Year == 0){
            price = 20;}
        else{
        price = r.nextInt(26 - 17) + 17;}
        
        return price;      
    }
   
    
    /**
     * This is to have an int that controls the amount of ewoks fed.
     */
    public static int feed;
    /**
     * Feeding of Ewoks
     * @param f
     * @return 
     */
    public static int Feed(int f){
        feed = f;
        return feed;
    }
  
    /**
     * This is the main function
     * @param args 
     */

    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        
        System.out.println("Who is your Character (Luke Skywalker, Han Solo, or Princess Leia): ");
        String c = a.nextLine();
        EndorSmints.endorsmints(c);
        /**
         * Implementing difficulties
         */
        System.out.println("Select difficulty: easy, medium, hard: ");
        String d = a.nextLine();
         if(d.contains("e") == true){
            System.out.println("*In the easy setting there will be no Womp Rats or Meteors,"
                    + "and you will be given 3000 more smints");
            difficulty = 1;
        }
        if(d.contains("m") == true){
            System.out.println("*You will be playing by the normal rules");
            difficulty = 2;
        }
        if(d.contains("h") == true){
            System.out.println("*In the hard setting you will start with 2000 smints \n"
                    + "Play wisely and good luck");
            difficulty = 3;
        }
        System.out.println("You are " + character +", and you recently parachuted onto Calduum "
                + "Island of the forest moon Endor. The Ewoks of Calduum Island"
                + " elected you to be their leader.  You have to keep Calduum "
                + "Island alive for 10 years, at which time the Millennium Falcon"
                + " will return and you will be reunited with your Star Wars "
                + "friend.  You have to buy/sell land, direct smĭnts farming,"
                + " and dispense smĭnts to the Ewoks. Teeny-weeny-meteor showers"
                + " and womp rats affect your life on Calduum. The following will"
                + " help you make decisions.\n" +
              "  * Each Ewok needs at least 20 bushels of smĭnts per year to survive.\n" +
              "  * Each Ewok can farm at most 10 acres of land.\n" +
              "  * It takes 2 bushels of smĭnts to farm an acre of land.\n" +
              "  * The market price for land fluctuates yearly.\n" +
              "Initial values are the following.\n" +
             "  * Population: 100\n" +
            "  * Acres owned: 1000\n" +
            "  * Land Value: 20\n" +
            "  * Smints in Storage: 3000\n" +
            "Rule wisely for 10 years and you will be reunited with your friends. Rule poorly,"
         + " the Ewoks will die, you will perish, and you will never see your friend again.");

        
        while(Year < 10){
         System.out.println("you've been here for " + Year + " years.");
         System.out.println("It costs " + EndorSmints.LandValue() + " Smints for 1 acre");
        System.out.println("How many acres do you want to sell: ");
        int y = a.nextInt();
        System.out.println("How many acres do you want to buy; ");
        int x = a.nextInt();
        EndorSmints.landTrade(x, y);
        System.out.println("How many smints do you want to use to feed ewoks: ");
        int f = a.nextInt();
        EndorSmints.Feed(f);
        System.out.println("How much land do you want to plant: ");
        int p = a.nextInt();
        EndorSmints.Planted(p);
        System.out.println("-------------------------------------------------------");
        System.out.println("At the end of year: " + (1000 + Year));
        System.out.println("You have " + acres + " acres");
        System.out.println("You have this many ewoks left: " + EndorSmints.ewoks());
        System.out.println("You have this many smints left in storage " + EndorSmints.Smints());
        System.out.println("You harvested this many smints this year " + EndorSmints.FreshSmints());
        System.out.println("You start your next year with: " + EndorSmints.TotalSmints() + " smints");
         /* added feature: civil war */
        if(feed < (survivedEwoks * .6)){
            System.out.println("You have caused a civil war due to not feeding enough of your ewoks,"
                    + " they revolt and leave you to survive on your own, you lose");
            System.exit(0);
        }
        if(survivedEwoks < 53){
            System.out.println("You don't have a sufficent number of ewoks, you lose.");
            System.exit(0);
        }
        if(acres < 0 & smints < 0){
            System.out.println("You ran out of land and smints, you lose.");
            System.exit(0);
        }
        if(smints < 0){
            System.out.println("You ran out of smints, you lose");
        }
        if(totalSmints < 0){
            System.out.println("You ran out of smints, you lose");
            System.exit(0);
        }
        if(survivedEwoks/acres < 1/20){
            System.out.println("You don't have enough land so the ewoks left, you lose");
            System.exit(0);
        }
       
        Year++;
        System.out.println("-------------------------------------------------------");
        }
          System.out.println("Congrats you survived 10 years!!!!");
    }


   
}