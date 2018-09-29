import java.util.*;

public class OddsAndEvens {
    public static void main (String args[]){
        Greeting();
        Gameplay();
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
        System.out.println("-----------------------------------------");
    }

    public static void Gameplay(){
        System.out.println("How many 'fingers' do you put out?");
        Scanner input = new Scanner(System.in);
        int player = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " fingers.");
        System.out.println("-----------------------------------------");
        int sum = player + computer;
        System.out.println(player + " + " + computer + " = " + sum);
        boolean oddOrEven = sum%2 == 0;
        if (oddOrEven == true) {
            System.out.println(sum + " is ...even");
        } else {System.out.println(sum + " is ...odd");}
        System.out.println("-----------------------------------------");



    }
}
