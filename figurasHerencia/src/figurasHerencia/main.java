package figurasHerencia;

import java.util.Scanner;

public class main {

	static Cubo cubo;
    static double respuesta;
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        valores();
        resultado();
        scanner.nextLine();
    }
    	private static void resultado(){
	        int  opcion =get_menu();
	
	        while(opcion != 5)
	        {
	            respuesta = calcular(opcion,cubo);
	            System.out.println("El valor es " +respuesta+ "\n");
	            opcion = get_menu();
	        }
	        valores();
	        resultado();
	    }

	    private static void valores(){
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el valor del lado:\t");
	        try{
	            double lado  = Double.parseDouble( scanner.nextLine());
	            cubo = new Cubo(lado);
	        }
	        catch (NumberFormatException nfe){
	            System.out.println ("El valor debe de ser un entero");
	            valores();
	        }
 }


    public static double calcular( int opt, Cubo cubo){

        double result = 0;
        switch (opt){
            case 1: result =cubo.calcularPerimetro(true); break;
            case 2: result = cubo.calcularArea (); break;
            case 3: result = cubo.calcularVolumen(); break;
            case 4: result = cubo.calcularPerimetro(false); break;
            case 5: valores();break;
            case 6: System.out.println ("Se salió del programa");System.exit (0);break;

        }
        return result;
    }

    public static int get_menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Elija un opción:\n");
        System.out.print ("1: Calcular perímetro cuadrado \n");
        System.out.print ("2: Calcular área\n");
        System.out.print ("3: Calcular Perímetro cubo\n");
        System.out.print ("4: Calcular Volúmen\n");
        System.out.print ("5: Reiniciar \n");
        System.out.print ("6: Salir del programa \n");

        int opt  = Integer.parseInt( scanner.nextLine());
        return opt;
    }

}
