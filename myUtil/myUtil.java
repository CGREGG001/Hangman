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

}
