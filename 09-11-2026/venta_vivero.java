import java.util.Arrays;
import java.util.Scanner;

public class venta_vivero 
{
   public static void main(String[] args) 
   {
      String[] productos = new String[5];
        Scanner consola = new Scanner (System.in);
        int[] cant_vendida = new int[5];

        productos[0] = "Cactus";
        productos[1] = "Suculenta";
        productos[2] = "Maceta";
        productos[3] = "Tierra";
        productos[4] = "Fertilizante";

        System.out.println(Arrays.toString(productos));

        String[] dia = new String[6];
        dia[0] = "Lunes";
        dia[1] = "Martes";
        dia[2] = "Miércoles";
        dia[3] = "Jueves";
        dia[4] = "Viernes";
        dia[5] = "Sábado";

        double[] precio = new double[5];
        double[][] total_ventas = new double[6][5];
        precio[0] = 45.5;
        precio[1] = 35.5;
        precio[2] = 60;
        precio[3] = 80;
        precio[4] = 95;

        double total_semanal_por_producto = 0;

        for (int i = 0; i < productos.length; i++)
        {
            total_semanal_por_producto = 0;
            for (int j = 0; j < dia.length; j++)
            {
                System.out.print("Ingrese la cantidad de " + productos[i] + " vendida el día " + dia[j] + ": ");
                int cantidad = Integer.parseInt(consola.nextLine());
                double venta_dia = cantidad * precio[i];
                total_ventas[j][i] = venta_dia;
                total_semanal_por_producto += venta_dia;
            }
           
        }
            for (int i = 0; i < productos.length; i++)
            {
                System.out.println(productos[i] + ": " + "  venta semanal: " + total_semanal_por_producto);
            }
        consola.close();
   }
}
