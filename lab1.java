import java.util.Scanner;

public class lab1{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("Enter age:");
        int age = scanner.nextInt();

        scanner.close();

        System.out.println(name + " " +age);



    }


}