package prova;

import java.util.Scanner;

/**
 *
 * @author utente
 */
public class ProvaTest {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);                
        
        String testo;
        Integer numero;
        
        numero = input.nextInt();
        testo = input.next();
                
        System.out.println(numero);
        System.out.println(testo);
        
    }
}
