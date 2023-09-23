import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String democrat = "D";
        String republican = "R";
        String independent = "I";
        String party = null;
        Scanner select = new Scanner(System.in);
        System.out.println("Enter your party affiliation ");
        party = select.nextLine();
        if (party.equalsIgnoreCase(democrat)){
            System.out.println("Your party is Democrat, you get a Donkey");
        }
        else if (party.equalsIgnoreCase(republican)) {
            System.out.println("Your party is Republican, you get an Elephant");
        }
        else if (party.equalsIgnoreCase(independent)) {
            System.out.println("Your party is Independent, you get a man");
        }
        else {
            System.out.println("Invalid output, restart the program and re-enter");
        }
    }
}
