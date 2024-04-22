import java.util.Scanner;

public class myUtil {

    public static char [] initialiserTabMotTrouve(char tabMot[]) {
        // création et initialisation du tableau avec caractère _
        char tabMotTrouve[];

        tabMotTrouve = new char[tabMot.length];
        for (int i = 0; i < tabMotTrouve.length; i++) {
            tabMotTrouve[i] = '_';
        }
        return tabMotTrouve;
    }

    public static void bienvenue(){
        // message d'accueil 
        System.out.println("Welcom to the hangman game");
        System.out.println();
        System.out.println("Guess the mystery word");
        System.out.println("You have the right to 7 errors");
        System.out.println();
    }

    public static char saisirLettre() {
        // fonction retour du caractère saisi par l'utilisateur avec vérification

        char lettre = ' ';
        boolean ok;

        do {
            ok = true;
            try {
                System.out.println("Enter a letter");
                lettre = new Scanner(System.in).nextLine().toUpperCase().charAt(0);
                ok = true;
            } catch (Exception e) {
                System.out.println("A letter please !");
                ok = false;
            }

            if (lettre < 65 || lettre > 90) {
                // 65 - 90 valeur ascii des lettres en M%ajuscule
                // 97 - 122 valeur des lettres en minuscule
                System.out.println("A letter from A to Z please");
                ok = false;
            }

        } while (!ok);

        return lettre;
    }

    public static void trouverMotMystere (char tabMot[], char tabMotTrouve[]) {
        int cpt = 0;
        int nbreEssais = 7;
        char lettre;
        boolean lettreTrouve;

        while (cpt < tabMot.length && nbreEssais > 0) {
            lettreTrouve = false;
            lettre = myUtil.saisirLettre();
            for (int i = 0; i < tabMot.length; i++) {
                if (tabMot[i] == lettre && tabMotTrouve[i] != lettre) {
                    // remlacement du _ par la lettre trouvée
                    tabMotTrouve[i] = lettre;
                    lettreTrouve = true;
                    cpt++;
                }
            }
            if (!lettreTrouve) {
                nbreEssais--;
            }

            System.out.println("You have " + nbreEssais + " attemps left");
            System.out.println();
            System.out.println(tabMotTrouve);
        }
    }

}
