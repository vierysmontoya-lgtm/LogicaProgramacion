import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prueba 
{

    public static void main(String[] args)
    {
        String[] dulces = new String[4];
        Scanner consola = new Scanner (System.in);
        int[] ventas = new int[4];
        

        dulces[0] = "Chocolate";
        dulces[1] = "Paleta";
        dulces[2] = "Gomitas";
        dulces[3] = "Galletas";

        System.out.println(Arrays.toString(dulces));

        int[] precio = new int[4];
        precio[0] = 18;
        precio[1] = 12;
        precio[2] = 25;
        precio[3] = 15;

        int cant_clientes=0;
        int total_ventas=0;
        
        ArrayList <String> clientes = new ArrayList<String>();
        ArrayList <String> promedioPorCliente = new ArrayList<String>();

        boolean agregar_cliente = true;
        while (agregar_cliente)
        {
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = consola.nextLine();
            clientes.add(nombre);
            cant_clientes++;
            int total_cliente = 0;
            int articulos_cliente = 0;
            System.out.print("Ingrese el código del dulce que desea comprar (1:Chocolate, 2:Paleta, 3:Gomitas, 4:Galletas):      ");
            int codigo = Integer.parseInt(IO.readln());
            boolean agregar_dulce=true;
            while (agregar_dulce)
            {
                switch (codigo)
                {
                    case 1:
                        System.out.print("Ingrese la cantidad de " + dulces[0] + " que desea comprar: ");
                        ventas[0] = Integer.parseInt(IO.readln());
                        if (ventas[0] > 0) 
                        {
                            int importe = ventas[0] * precio[0];
                            total_ventas += importe;
                            total_cliente += importe;
                            articulos_cliente += ventas[0];
                            
                        }
                        else 
                        {
                            System.out.println("Cantidad inválida. No se registró la venta.");
                        }
                        System.out.print("¿Desea agregar otro dulce para este cliente? (true/false): ");
                        agregar_dulce = Boolean.parseBoolean(IO.readln());
                        if (agregar_dulce)
                        {
                            System.out.print("Ingrese el código del dulce que desea comprar (1:Chocolate, 2:Paleta, 3:Gomitas, 4:Galletas):      ");
                            codigo = Integer.parseInt(IO.readln());
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad de " + dulces[1] + " que desea comprar: ");
                        ventas[1] = Integer.parseInt(IO.readln());
                        if (ventas[1] > 0) 
                        {
                            int importe = ventas[1] * precio[1];
                            total_ventas += importe;
                            total_cliente += importe;
                            articulos_cliente += ventas[1];
                        }
                        else 
                        {
                            System.out.println("Cantidad inválida. No se registró la venta.");
                        }
                        System.out.print("¿Desea agregar otro dulce para este cliente? (true/false): ");
                        agregar_dulce = Boolean.parseBoolean(IO.readln());
                        if (agregar_dulce)
                        {
                            System.out.print("Ingrese el código del dulce que desea comprar (1:Chocolate, 2:Paleta, 3:Gomitas, 4:Galletas):      ");
                            codigo = Integer.parseInt(IO.readln());
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese la cantidad de " + dulces[2] + " que desea comprar: ");
                        ventas[2] = Integer.parseInt(IO.readln());
                        if (ventas[2] > 0) 
                        {
                            int importe = ventas[2] * precio[2];
                            total_ventas += importe;
                            total_cliente += importe;
                            articulos_cliente += ventas[2];
                        }
                        else 
                        {
                            System.out.println("Cantidad inválida. No se registró la venta.");
                        }
                        System.out.print("¿Desea agregar otro dulce para este cliente? (true/false): ");
                        agregar_dulce = Boolean.parseBoolean(IO.readln());
                        if (agregar_dulce)
                        {
                            System.out.print("Ingrese el código del dulce que desea comprar (1:Chocolate, 2:Paleta, 3:Gomitas, 4:Galletas):      ");
                            codigo = Integer.parseInt(IO.readln());
                        }
                        break;
                    case 4:
                        System.out.print("Ingrese la cantidad de " + dulces[3] + " que desea comprar: ");
                        ventas[3] = Integer.parseInt(IO.readln());
                        if (ventas[3] > 0) 
                        {
                            int importe = ventas[3] * precio[3];
                            total_ventas += importe;
                            total_cliente += importe;
                            articulos_cliente += ventas[3];
                        }
                        else 
                        {
                            System.out.println("Cantidad inválida. No se registró la venta.");
                        }
                        System.out.print("¿Desea agregar otro dulce para este cliente? (true/false): ");
                        agregar_dulce = Boolean.parseBoolean(IO.readln());
                        if (agregar_dulce)
                        {
                            System.out.print("Ingrese el código del dulce que desea comprar (1:Chocolate, 2:Paleta, 3:Gomitas, 4:Galletas):      ");
                            codigo = Integer.parseInt(IO.readln());
                        }
                        break;
                    default:
                        System.out.println("Código de dulce inválido.");
                }               
            }   

            if (articulos_cliente > 0)
            {
                double promedio = (double) total_cliente / articulos_cliente;
                promedioPorCliente.add(nombre + ": $" + promedio + " por artículo");
            }
            else
            {
                promedioPorCliente.add(nombre + ": no compró artículos");
            }

            System.out.println(Arrays.toString(dulces) + "\n Precio unidad: " + Arrays.toString(precio) + "\n Cantidad vendida: " + Arrays.toString(ventas)+ "\n Total de ventas: " + total_ventas);
            System.out.print("Desea agregar un cliente? (true/false): ");
            agregar_cliente = Boolean.parseBoolean(IO.readln());
        }   
        System.out.print("Reporte Final: ");
        System.out.println("Cantidad de clientes: " + cant_clientes + "\n Nombre de los clientes: " + clientes + "\n Cantidad vendida: " + Arrays.toString(dulces) + Arrays.toString(ventas)+ "\n Total de ventas: " + total_ventas + "\n Promedio por cliente (total individual / artículos comprados): " + promedioPorCliente);
    }
 
}