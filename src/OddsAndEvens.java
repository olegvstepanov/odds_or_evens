import java.util.Scanner;

public class OddsAndEvens {
    public static void main (String args[]){
        Greeting();
    }

    public static void Greeting() {
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hi " + name + " , which do you choose? (O)dds or (E)vens?");
        String choice = input.next();
        if (choice.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (choice.equals("E")) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        } else {
            System.out.println("Please type eather O or P");
        }
    }
}
