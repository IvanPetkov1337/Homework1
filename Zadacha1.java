package uni.fmi.informatics;
import java.util.Scanner;


public class Zadacha1 {

    public static void main(String args[]){

        perimeterOfRectangle();
        faceOfRectangle();

    }


    public static void perimeterOfRectangle(){
        int Perimeter;
        System.out.println("Values for Perimeter ");
        System.out.println("a= : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("b= : ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan.nextInt();


        Perimeter = (2*a) + (2*b);
        System.out.println("The perimeter of this rectangle is: " + Perimeter );
    }
    public static void faceOfRectangle() {
        int Perimeter;
        System.out.println("Values for Face ");
        System.out.println("a= : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("b= : ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan.nextInt();
        int S = a * b;
        System.out.println("The face of this rectangle is : " + S);
    }
}
