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

        int x;
        x = 13;
        System.out.println(x);

        int etaPersona = 34;
        int eta_persona = 38;
         System.out.println(etaPersona);
          System.out.println(eta_persona);

        int y = 24;
        double o;
        o = 2.5;
        x = 27;

        System.out.println(o);
        System.out.println(x);
        System.out.println("x");
        System.out.println(y);

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


    /*
     * - Dati Primitive e reference
	    -bolean|true,false| 1bit
	    -byte|-128 : 127|1 Bytes
	    -short| 2 bytes
	    -int| 4 bytes
	    -long| 8bytes

    -float  n. 6/7 cifre decimali 1.222222 4 bytes
    -double n. 15 cifre decimali 8bytes

	    -char singolo carattere/lettera/ASCII "f" 2 bytes
	    -string + caratteri , variabile
     */
        
     boolean luce = true;
     Boolean gas = false;

     System.out.println(luce);
     System.out.println(gas);

        float ciao = 1.232323f;
        System.out.println(ciao);
        double ciaone = 1.232323232323232f;
        System.out.println(ciaone);

        char come = 'F';
        char stai = '%';

        System.out.println(come);
        System.out.println(stai);
     
           






    }
    // if & else a seguire

}
