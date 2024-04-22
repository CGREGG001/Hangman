import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        String motMystere[] = { "ORANGE" };
        String mot;
        char tabMot[];
        char tabMotTrouve[];
        char choixRejouer;
        boolean rejouer = true;

        myUtil.bienvenue();

        do {

            // mot devient un string du mot mystere
            mot = motMystere[0];
            // tabmot passe le string en chaine de caractères
            tabMot = mot.toCharArray();

            tabMotTrouve = myUtil.initialiserTabMotTrouve(tabMot);
            System.out.println();

            myUtil.trouverMotMystere(tabMot, tabMotTrouve);
            System.out.println();

            System.out.println("Press c to continue or another letter to exit");
            choixRejouer = new Scanner(System.in).nextLine().charAt(0);
            if (choixRejouer == 'c' || choixRejouer == 'C') {
                rejouer = true;
            } else {
                rejouer = false;
                System.out.println("\nthank you for participating ;-)\n");
            }

        } while (rejouer);

    }
}
