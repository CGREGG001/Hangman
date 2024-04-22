import java.util.Random;
import java.util.Scanner;

public class Hangman {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        String motMystere[] = { "ORANGE", "PECHE", "POIRE", "POMME", "TOMATE", "SALADE", "BROCOLI" , "EPINARD", "BANANNE" };
        String mot;
        char tabMot[];
        char tabMotTrouve[];
        char choixRejouer;
        boolean rejouer = true;

        // déclaration r en random
        Random r = new Random();

        myUtil.bienvenue();

        do {

            // dans le tableau motMystere r.nextInt choisi un nbre aléatoire et envoi le mot choisi dans la variable mot
            mot = motMystere[r.nextInt(motMystere.length)];
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
