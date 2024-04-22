public class Hangman {
    public static void main(String[] args) {
        
        String motMystere[] = {"ORANGE"};
        String mot; 
        char tabMot[];
        char tabMotTrouve[];

        myUtil.bienvenue();

        mot = motMystere[0];
        tabMot = mot.toCharArray();


        tabMotTrouve =  myUtil.initialiserTabMotTrouve(tabMot);
        System.out.println(tabMotTrouve);
        System.out.println(tabMot);

        myUtil.trouverMotMystere(tabMot, tabMotTrouve);

    }
}
