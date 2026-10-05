//IMPORTAR LIBRERIAS 
import java.util.Scanner; //para tipo Scanner 

public class entrada_datos
{

    public static void main (String [] args)
    //Opción 1: Declarar nuevo objeto tipo scanner
    Scanner scan = new Scanner (System.in);

    //Escribir por consola 
    System.out.println ("Escribe tu nombre"); 
    //Leer por consola 
    String nombre1 = scan.nextLine();
    //Escribir por consoa. Mensaje + Variable
    System.out.println("Tu nombre es:" + nombre1);
    //Desechar objeto scanner
    scan.close();
    






}
