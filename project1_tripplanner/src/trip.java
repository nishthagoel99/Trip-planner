import java.util.Scanner;

public class trip {
    public static void main(String[] args)
    {
        greeting();
        budget();
        time_diffrence();
        distance();
    }

    public static void greeting() // ASKS DETAILS SUCH AS NAME AND THE VACATION SPOT
    {
        Scanner input= new Scanner(System.in);
        System.out.println("WELCOME TO TRIP PLANNER!");
        System.out.print("What is your name? ");
        String name=input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String place=input.nextLine();
        System.out.println("Great ! " + place + " sounds like a great trip.");
        System.out.println("***********************************");
        System.out.println();
        System.out.println();
    }

    public static void budget()//asks number of days,and total money which is then converted into total hours spent and change of currency    {
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going spend travelling? ");
        int day = input.nextInt();
        System.out.print("How much money,in USD, are you willing to spend on your trip? ");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travelling destination? ");
        String currency = input.next();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        double val = input.nextDouble();
        System.out.println();
        System.out.println();

       int hour,min;
       double perday,perday_cur,total;
       perday=(int)(money/day*100);
       perday/=100;
       total=(int)(money*val*100) ;
       total=total/100;
       perday_cur=(int)(perday*val*100);
       perday_cur/=100;

        hour=day*24;
        min=hour*60;

        System.out.println("If you are travelling for " + day + " days that is the same as " + hour + " hours or " + min + " minutes."  );
        System.out.println("If you are going to spend $ " + money + " USD, that means per day you can spend upto $ " + perday + " USD.");
        System.out.println("Your total budget in " + currency + " is " + total + " " + currency + ", which per day is " + perday_cur + " " + currency + ".");
        System.out.println("***********************************");
        System.out.println();
        System.out.println();
    }
    public static void time_diffrence()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("What is the time difference,in hours between your home and your destination? ");
        int time=input.nextInt();
        int final_time,time2;
        time2=time+12;
        time=time+24;
        final_time=time%24;

        System.out.println("That means when it is midnight at home it will be " + final_time + ":00 in your travel destination and when it is noon at home it will be " + time2 + ":00" );
        System.out.println("***********************************");
        System.out.println();
        System.out.println();
    }
    public static void distance()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("What is the square area of your destination in kilometer square? ");
        double area=input.nextDouble();
        double area_mil;
        area_mil = (int)(area*0.386102*100);
        area_mil/=100;
        System.out.println("In miles square, area is " + area_mil);
        System.out.println("***********************************");
        System.out.println();
        System.out.println();
    }


}