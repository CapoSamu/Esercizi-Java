public class EsercizioAlfa {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("s:ciao da samuel il programmatore");
        System.out.println("S:Ciao Marika come stai?");
        // Anthony joined the chat
        /*
        ciao
        test
        studio
        java
        ciao
        */

        System.out.print("M:Ciao sono Marika");
        System.out.println("M: Come stai?");
        // Giorno n.2 studio delle variabili
        // x = 8 es 3*x + 5 = 29
        int numero= 24;
        String scritta ="ciao";
        String città = "Genova";
        System.out.println(numero);
        System.out.println(scritta);
        System.out.println(numero);
        System.out.println(città);

        for(int cifra=0;cifra<10;cifra++) {
            numero++;
            System.out.println(numero+"questo è numero");
            System.out.println(cifra+"questo è cifra");

        }
        
        int numero1= 10;
        for(int drive=32;drive<42;drive++) {
            numero1*=20;
            System.out.println(numero1+"Questo è variabile numero1");
            System.out.println(drive+"Questa è la variabile drive" );
            System.out.println(funzione1(50));  
            funzione2(45); 
        }
    }

        // Funzioni

    
    public static String  funzione1(int numero2) {
        
        int numero3=40;

        System.out.println("Funzione avviata");
        return "il risultato è "+(numero2 + numero3);

    }

    // Funzioni nascoste
    public static void  funzione2(int numero5) {
        
        int numero3=40;

        System.out.println("Funzione avviata");
        System.out.println("il risultato è "+(numero5 + numero3));


    }
    // if & else a seguire

}
