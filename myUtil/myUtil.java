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

}
