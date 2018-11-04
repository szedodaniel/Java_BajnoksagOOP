package bajnoksagoop;

public class BajnoksagOOP {

    public static void main(String[] args) {

        Csapat cs1 = new Csapat("Ftc", 0.6,3, 0.5);
        Csapat cs2 = new Csapat("Ujpest 0.7 2 0.6");

        System.out.println(cs1);
        System.out.println(cs2);
        
                
        Merkozes orokRangado = new Merkozes(cs1, cs2);
        Csapat vegeredmeny = orokRangado.leJatszas();
        System.out.println("gyoztest: " + vegeredmeny);
        Bajnoksag csapatok = new Bajnoksag("focieb.txt");
        csapatok.toString();
        System.out.println();
        
    }
    
}
