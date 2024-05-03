package JavaIV;

import java.io.IOException;
import java.util.Scanner;


public class Ejercicio6 {
	    public static void main(String[] args) throws IOException {
	        Scanner input = new Scanner(System.in);
	        int n = -1;
	        do {
	            System.out.print("Ingrese un numero: ");
	            n = input.nextInt();
	        } while (n!=0);
	    }
}
