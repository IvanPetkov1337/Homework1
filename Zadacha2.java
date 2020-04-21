package uni.fmi.informatics;
import java.util.Scanner;

public class Zadacha2 {
    public static void main(String args[]){
    DaysInAMonth();
    }
    /*static int January = 31 ,
    February = 28 ,
    March = 31 ,
    April = 30 ,
    May = 31 ,
    June = 30 ,
    July = 31,
    August = 31 ,
    September = 30 ,
    October = 31 ,
    November = 30 ,
    December = 31 ; */
    public static void DaysInAMonth() {
        System.out.println("Enter a month: ");
        Scanner scan = new Scanner(System.in);
        String Month = scan.nextLine();


        if(Month.equals("January") || Month.equals("March") || Month.equals("May") || Month.equals("July") || Month.equals("August") || Month.equals("October") || Month.equals("December")) System.out.println(Month + "-> 31");
        else if  (Month.equals("April") || Month.equals("June") || Month.equals("September") || Month.equals("November")) System.out.println(Month + "-> 30");
            else  System.out.println(Month + "-> 28");




    }
}
