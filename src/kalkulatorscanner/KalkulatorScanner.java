
package kalkulatorscanner;

import java.util.Scanner;

public class KalkulatorScanner {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("Unesite 2 broja: ");
        int a = s1.nextInt();
        int b = s1.nextInt();
        System.out.println("Izaberite operaciju:\n+ \n_ \n* \n/");
        char op;
        String znak = s.nextLine();
        op =znak.charAt(0);
        System.out.println("Rezultat je ");
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;
        }

        System.out.println("Znak koji ste uneli je: "+op);

        
    
    }
    
}
