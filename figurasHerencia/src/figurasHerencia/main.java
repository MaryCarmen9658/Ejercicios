package figurasHerencia;

import java.util.Scanner;

public class main {

	static Cubo cubo;
    static double current;
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        init ();


        loop ();


        scanner.nextLine();


    }


    private static void loop(){

        int  opt =get_menu();

        while(opt != 5)
        {
            current = calculate(opt ,cubo);

            System.out.println("El valor es " +current+ "\n");

            opt = get_menu ();
        }



        init ();
        loop ();
    }


    private static void init(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado:\t");
        try{
            double lado  = Double.parseDouble( scanner.nextLine());
            cubo = new Cubo(lado);
        }
        catch (NumberFormatException nfe){
            System.out.println ("El valor debe de ser un entero");
            init ();
        }



    }


    public static double calculate( int opt, Cubo cubo){

        double result = 0;
        switch (opt){
            case 1: result =cubo.calculatePerimeter(true); break;
            case 2: result = cubo.calculateArea (); break;
            case 3: result = cubo.calculateVolume(); break;
            case 4: result = cubo.calculatePerimeter(false); break;
            case 5: init();break;
            case 6: System.out.println ("Gracias por su visita vuelva pronto");System.exit (0);break;

        }
        return result;
    }

    public static int get_menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Ingrese el calculo a realizar:\n");
        System.out.print ("1: Perímetro cuadrado \n");
        System.out.print ("2: calcular área\n");
        System.out.print ("3: calcular Volúmen\n");
        System.out.print ("4: calcular Perímetro cubo\n");
        System.out.print ("5: Reinicio \n");
        System.out.print ("6: Salir del programa \n");

        int opt  = Integer.parseInt( scanner.nextLine());
        return opt;
    }

}
