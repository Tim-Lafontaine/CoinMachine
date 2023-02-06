// Timothy Lafontaine, Student ID: 261066866 
// Assignment one - Coin Machine 

public class CoinMachine {

    public static void main(String[] args) {

        // coin values

        int toonie = 200;
        int loonie = 100;
        int quarter = 25;
        int dime = 10;
        int nickel = 5;

        // command line inputs

        int cash = Integer.parseInt(args[0]);
        int price = Integer.parseInt(args[1]);

        // change due

        int changeDue1 = (cash) - (price);

        // coin counter

        int numToonies = (changeDue1) / (toonie);
        changeDue1 = changeDue1-numToonies*toonie;
        int numLoonies = (changeDue1) / (loonie);
        changeDue1 = changeDue1-numLoonies*loonie;
        int numQuarters = (changeDue1) / (quarter);
        changeDue1 = changeDue1-numQuarters*quarter;
        int numDimes = (changeDue1) / (dime);
        changeDue1 = changeDue1-numDimes*dime;
        int numNickels = (changeDue1) / (nickel);
        changeDue1 = changeDue1-numNickels*nickel;

        // coin return information for user

        System.out.println("Ammount Recieved: " + cash);
        System.out.println("Cost of the item: " + price);
        System.out.println("Required Change: " + (cash - price));
        System.out.println();
        System.out.println("Change:");
        System.out.println("toonies x " + numToonies);
        System.out.println("loonies x " + numLoonies);
        System.out.println("quarters x " + numQuarters);
        System.out.println("dimes x " + numDimes);
        System.out.println("nickles x " + numNickels);

        //Thanks for using my Coin Machine!

    }
}