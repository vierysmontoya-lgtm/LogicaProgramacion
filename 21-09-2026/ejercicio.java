void main()
{

/* Declaración de Variables */
int Bono = 1000; 

/* Decimales */
float Porcent_Generado=0;
double sueldo_final;
double Monto_comision=0;

/* CONTADORES */
float sueldo_total=0;
float porcent_inicial=0;  
double suma_salario=0;
float suma_ventas=0;  

/*Procesos */
String Nombre_Vendedor = IO.readln("Ingresa tu nombre: ");
IO.println();
float Sueldo=Float.parseFloat(IO.readln("Ingresa tu Sueldo: "));
IO.println();
int Cant_Ventas =Integer.parseInt( IO.readln("¿Cuántas ventas realizaste?: "));
int Cont_Ventas = Cant_Ventas;

while (Cont_Ventas>0) 
{
  float Import_ventas=Float.parseFloat(IO.readln("Ingresa el valor de venta:   "));  
  IO.println();
  suma_ventas= suma_ventas + Import_ventas;
  Cont_Ventas= Cont_Ventas -1;
}
 if (suma_ventas<20000)
 {
 Monto_comision= suma_ventas * 0.05;
 Porcent_Generado= porcent_inicial + 5;
 

 }

else
{

    if (suma_ventas>=20000 && suma_ventas<= 49999)
    { 
   Monto_comision= suma_ventas * 0.08;
    Porcent_Generado= porcent_inicial + 8;
    } 
    else 
    {
         if (suma_ventas>=50000 )
    { 
   Monto_comision= suma_ventas * 0.12;
    Porcent_Generado= porcent_inicial + 12;
    } 
    }

}

suma_salario= Sueldo + Monto_comision;
 if (Cant_Ventas >= 5 )
{
    sueldo_final = suma_salario + Bono;
    IO.readln(Nombre_Vendedor);
   System.out.println(Cant_Ventas); 
   System.out.println(Sueldo);
   System.out.println(Porcent_Generado);
   System.out.println(sueldo_final);
   System.out.println(Bono);
}
else 
{

  IO.readln(Nombre_Vendedor);
   System.out.println(Cant_Ventas); 
   System.out.println(Sueldo);
   System.out.println(Porcent_Generado);
   System.out.println(suma_ventas);

}


   





}

    
