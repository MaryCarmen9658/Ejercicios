	package morse;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
import java.util.Scanner;
	public class main {
		private static Scanner scan;
		static String[] letras = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                " " };

		static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
          ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
          "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
          "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
          "-----", " " };
              
  public static void main(String args[]) {
	  System.out.println("Introduce el texto o código morse a traducir: ");
      scan = new Scanner(System.in);
      String teclado = scan.nextLine();
	  aMorse(teclado);
      aAbc(teclado);
      /*main.aAbc(numero);*/
  }
  
  // funcion para decifrar el codigo morse
  public static void aAbc(String usuario_morse){
      String[] vector_morse = usuario_morse.split(" ");
      System.out.println(" ");
      // este ciclo es para interactura con cada uno de los valores que no da el usuario
      for(int i=0 ; i<vector_morse.length; i++){
          // este ciclo lo usamos para comparar lo que no dio el usuario y nuestro vector de los codigos morse
          for(int j=0; j<morse.length ;j++){
              if(vector_morse[i].equals(morse[j])){
                  // con esto ponemos el indice que corresponde al valor en el abecedario
                  System.out.print(letras[j]);
              }
          }
          // solucion para poner los espacios 
          if(vector_morse[i].equals("")){
              System.out.print(" ");
              i++;
          }
      }
  }
  
  // funcion para crear el codigo morse
  public static void aMorse(String usuario){
       // este ciclo es para interactura con cada uno de los valores que no da el usuario
      for(int i=0; i < usuario.length() ; i++){
          char aux = usuario.charAt(i);
          // este ciclo lo usamos para comparar lo que no dio el usuario y nuestro vector del abecedario
          for(int j=0; j<letras.length ;j++){
              if(String.valueOf(aux).equals(letras[j])) {
                  // con esto imprimimos el valor que corresponde del codigo morse
                  System.out.print(morse[j]+" ");
              }
          }
      }
  }
	}