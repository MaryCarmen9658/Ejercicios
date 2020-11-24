package numerosRomanos;

import java.util.Scanner;

public class main {

	private static Scanner scan;
	public static void main(String args[]) {
		System.out.println("Introduce el numero a convertir: ");
		scan = new Scanner(System.in);
	      int teclado = scan.nextInt();
		  romano(teclado);
    }
    
    
    public static void romano(int number) {
        int num[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String romanos[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int i=12;    
        while(number>0) {
          int div = number/num[i];
          number = number%num[i];
          while(div>0) {
            System.out.print(romanos[i]);
            div--;
          }
          i--;
        }
    }
}