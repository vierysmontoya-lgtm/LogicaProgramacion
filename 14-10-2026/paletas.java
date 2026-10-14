import java.util.Scanner;

public class paletas 
{
    public static void main(String[] args)
    {
        
    String[] paletas = new String[3];
    int[] dia1 = new int[3];
    int[] dia2 = new int[3];
    Scanner consola = new Scanner (System.in);

    paletas[0] = "Fresa";
    paletas[1] = "Limón";
    paletas[2] = "Coco";
  
    System.out.print("Registra las ventas del día correspondiente         ");

    for (int i=0; i<paletas.length;i++){
            System.out.print("           Total de ventas del dia 1:      ");
            dia1[i] = Integer.parseInt(consola.nextLine());
            
        }
       
    for (int i=0; i<paletas.length;i++)
    {
    System.out.print("           Total de ventas del dia 2:          ");
    dia2[i] = Integer.parseInt(consola.nextLine());
            
    }

    int[] precio = new int[3];
    precio[0] = 15;
    precio[1] = 12;
    precio[2] = 18;
        
    int ventas1 = 0;
    int ventas2 = 0;
  

        for (int i=0; i<dia1.length; i++)
        {
        ventas1 += dia1[i] * precio[i];

        }

        for (int i=0; i<dia1.length; i++)
        {
        ventas2 += dia2[i] * precio[i];

        }


       System.out.print("Dinero del dia 1      "  +     ventas1);
        System.out.print("Dinero del dia 1      "  +     ventas2); 
     
      
        








    }










}
