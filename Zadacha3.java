package uni.fmi.informatics;
import java.util.Scanner;

public class Zadacha3 {
    public static void main(String args[]) {
        Cheater();
    }
     public static void Cheater(){
        System.out.println("Enter a floor level between 0-8: ");
        Scanner scan = new Scanner(System.in);
        int Floor = scan.nextInt();
        switch(Floor){
            case 8:
                System.out.println("Здравей Миме");
                break;
            case 7:
                System.out.println("Мара Пепи");
                break;
            case 6:
                System.out.println("Хей Ваня");
                break;
            case 5:
                System.out.println("Hola Иванке");
                break;
            case 4:
                System.out.println("Konichiwa Zaya");
                break;
            case 3:
                System.out.println("sup kp Гери");
                break;
            case 2:
                System.out.println("Как е Маргаритке");
                break;
            case 1:
                System.out.println("zdr Ралче");
                break;
            case 0:
                System.out.println("Ауч"); // He shouldn't be able to talk tho x)
                break;

        }


    }
}
