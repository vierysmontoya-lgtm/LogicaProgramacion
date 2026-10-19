import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;


public class carreraaritmetica 
{
public static void main (String[] args)
{
//Mes de nacimiento
System.out.println("¿En qué mes naciste?");
int mes=Integer.parseInt(IO.readln());

//Promedios 
    int[] numeros = new int[5];
    Scanner consola = new Scanner (System.in);

        numeros[0] = 0;
        numeros[1] = 0;
        numeros[2] = 0;
        numeros[3] = 0;
        numeros[4] = 0;

        System.out.println("Ingresa 5 números al azar");
        

        int suma = 0;

        for (int i=0; i<numeros.length;i++)
        {
            numeros[i] = Integer.parseInt(consola.nextLine());   
            suma += numeros[i];             
        }
        
        double promedionum = suma/5; 
        double pfinal = promedionum + mes; 
        System.out.println("   Resultado etapa promedio:          " + pfinal  );

        //Residuo de entrada 
        double residuo = pfinal % 7;
        double rentrada = residuo + pfinal;
        System.out.println("   Residuo de entrada:          " + rentrada   );

        //Porcentaje 12%
        double porcentaje = rentrada * 0.12;
        double porcentaje12 = porcentaje + rentrada;
        System.out.println("   Porcentaje 12%:          " + porcentaje12   );

        // Suma ¨N¨Valores enteros 
        int contnum = 0;
        boolean agregar = true;
        while (agregar)
        {
            System.out.print("  Agrega un número entero:  "   );
            int adnumero = Integer.parseInt(IO.readln());
            contnum += adnumero;
            System.out.print("  ¿Desea agregar otro numero? (true/false)  "   );
            agregar = Boolean.parseBoolean(IO.readln());
       } 
       double sumanv = contnum + porcentaje12;  
       System.out.println("  Suma N Valores Enteros:  " + sumanv  );

       //Elige un divisor 
       System.out.print("  Elige un divisor entero del 1 al 9  ");    
       int divisor=Integer.parseInt(IO.readln());
       double proceso = sumanv / divisor ;
       System.out.println("  Resultado division:  " + proceso  );    

       switch(mes)
       {
           case 1:
            System.out.printf("  Tu mes es impar y los decimales del resultado son:  %.4f " + proceso % 1);
            break;

            case 2:
            System.out.print("  Tu mes es par y el entero del resultado es:  " + (int) proceso);
            break;  

            case 3:
            System.out.printf("  Tu mes es impar y los decimales del resultado son: %.4f " + proceso % 1);
            break;

            case 4:
            System.out.print("  Tu mes es par y el entero del resultado es:  " + (int) proceso);
            break;  

            case 5:
            System.out.printf("  Tu mes es impar y los decimales del resultado son: %.4f " + proceso % 1);
            break;

            case 6:
            System.out.print("  Tu mes es par y el entero del resultado es:  " + (int) proceso);
            break; 
            
            case 7:
            System.out.printf("  Tu mes es impar y los decimales del resultado son: %.4f " + proceso % 1);
            break;

            case 8:
            System.out.print("  Tu mes es par y el entero del resultado es:  " + (int) proceso);
            break; 

            case 9:
            System.out.printf("  Tu mes es impar y los decimales del resultado son:  %.4f", proceso % 1);
            break;

            case 10:
            System.out.print("  Tu mes es par y el entero del resultado es:  " + (int) proceso);
            break;

            case 11:
            System.out.print("  Tu mes es impar y los decimales del resultado son:  %.4f" + proceso % 1);
            break;

            case 12:
            System.out.print("  Tu mes es par y el entero del resultado es:  " + (int) proceso);
            break;

            



        }    


    

        consola.close();








}















}
