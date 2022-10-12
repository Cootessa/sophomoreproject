import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        // Attributes of the Search class.
        // Create string variables for the search options.
        String z1 = "zone 1";
        String z2 = "zone 2";
        String z3 = "zone 3";
        String z4 = "zone 4";
        String z5 = "zone 5";
        String z6 = "zone 6";
        String z7 = "zone 7";
        String z8 = "zone 8";
        String z9 = "zone 9";
        String z10 = "zone 10";

        //Ask the user for input
        // Same message as the GUI.
        System.out.println("Please select a zone.");

        // Get input from the user.
        Scanner scan = new Scanner(System.in);
        // Create a variable for the user's search.
        String userSearch = scan.nextLine();

        // Create a while loop with if,else, elif branches for the user's search.
        // Program loops and allows user to search again.
        // --------------------------------Still working on the while loop.--------------------------------------------------------
        // First while loop that's less "polished"
        // while (userSearch.equals(z1) || (userSearch.equals(z2) || (userSearch.equals(z3) || (userSearch.equals(z4))))) {
        //while (!userSearch.equals(quit)) <--------- Second while loop option I'm working on that will look less "cluttered"
        // The "quit" will be a string input to a boolean that the user can enter to end the program.
        boolean Search_again = true;
        while (Search_again)
            if (userSearch.equals(z1)) {
                System.out.println("You chose" + z1 + ".");
            } else if (userSearch.equals(z2)) {
                System.out.println("You chose" + z2 + ".");
            } else if (userSearch.equals(z3)) {
                System.out.println("You chose" + z3 + ".");
            } else if (userSearch.equals(z4)) {
                System.out.println("You chose" + z4 + ".");
            } else if (userSearch.equals(z5)) {
                System.out.println("You chose" + z5 + ".");
            } else if (userSearch.equals(z6)) {
                System.out.println("You chose" + z6 + ".");
            } else if (userSearch.equals(z7)) {
                System.out.println("You chose" + z7 + ".");
            } else if (userSearch.equals(z8)) {
                System.out.println("You chose" + z8 + ".");
            } else if (userSearch.equals(z9)) {
                System.out.println("You chose" + z9 + ".");
            } else if (userSearch.equals(z10)) {
                System.out.println("You chose" + z10 + ".");
            } else {
                System.out.println("You did not search an appropiate zone. Please search between zone 1 through zone 10.");
            }
        /*Scanner scan = new Scanner(System.in);
        String diffSearch = scan.nextline();
        if (diffSearch == "yes") {
        }
        Search_again = false;*/
        }
    }




