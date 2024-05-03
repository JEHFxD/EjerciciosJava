package JavaIII;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio4 {
	
	public static void main(String[] args) throws IOException {
	        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	        int num;
	        System.out.print("Inserte un numero: ");
	        num = Integer.parseInt(input.readLine());
	        if (num > 0) {
	            System.out.println("El numero es mayora 0");
	        } else if (num==0) {
	        	System.out.println("El numero es igual que 0");
	        } else if (num<0){
	        	System.out.println("El numero es menor que 0");
	        }
		}       
}