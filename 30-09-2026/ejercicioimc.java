public class ejercicioimc {
  public static void main (String[] args)
    {
        boolean continuar = true;

        do{
      
 double Peso = Double.parseDouble(IO.readln("Ingresa tu peso: "));
 IO.println();
 double Altura = Double.parseDouble(IO.readln("Ingresa tu Altura: "));
 IO.println();
 Double IMC= (Peso)/(Altura*Altura); 
 System.out.println(IMC);

 if (IMC <= 18.5)
{
System.out.println("Bajo Peso ");
System.out.println("Consulta nutricional para diseñar un plan hipercalórico balanceado.  ");
System.out.println("Ejercicios de fuerza para aumentar masa muscular (no solo grasa).  ");
System.out.println("Evaluación médica para descartar causas subyacentes o Trastornos de la Conducta Alimentaria (TCA). ");
IO.println();


 }
 else 
 {
      if (IMC >= 18.5 && IMC <= 24.9)
      {
       System.out.println("Adecuado ");
       System.out.println(" Mantener una alimentación equilibrada basada en alimentos integrales.  ");
       System.out.println("Realizar al menos 150 minutos de actividad física moderada a la semana.  ");
       System.out.println("Revisiones médicas de rutina anuales. ");
       IO.println();      

      }
      else 
      {

           if (IMC >= 25 && IMC <= 29.9) {
                System.out.println("Sobrepeso ");
                System.out.println(" Pequeños ajustes en la dieta (reducir ultraprocesados, azúcares y grasas saturadas).  ");
                System.out.println("Incrementar la actividad física diaria (mínimo 150-300 min/semana).  ");
                System.out.println("Monitoreo de presión arterial y glucosa en sangre. ");
                IO.println(); 

           } 
           else 
           {
                if (IMC >= 30 && IMC <= 34.9) {
                System.out.println("Obecidad Grado 1  ");
                System.out.println(" Asesoría integral con nutricionista e idear un plan de déficit calórico sostenible. ");
                System.out.println("Rutina de ejercicio personalizada de bajo impacto para proteger articulaciones. ");
                System.out.println("Apoyo psicológico/conductual si existen patrones de alimentación emocional. ");
                IO.println(); 
                }
                else
                {
                    if (IMC >= 35 && IMC <= 39.9) {
                    System.out.println("Obecidad Grado 2  ");
                    System.out.println(" Intervención médica multidisciplinaria (médico, nutricionista, psicólogo). ");
                    System.out.println("Evaluación farmacológica si los cambios en el estilo de vida no dan resultado. ");
                    System.out.println("Monitoreo estrecho de perfil lipídico, glucemia y función cardiovascular. ");
                    IO.println(); 
                    }
                    else
                    {
                        if (IMC >=40) {
                            System.out.println("Obecidad Grado 3  ");
                          System.out.println(" Evaluación urgente por un equipo especializado en manejo de obesidad. ");
                          System.out.println("Considerar opciones avanzadas como fármacos o evaluación para cirugía bariátrica. ");
                           System.out.println("Tratamiento coordinado para comorbilidades (apnea del sueño, diabetes, hipertensión).");
                          IO.println(); 
                            }

                    }
                }



                }



           }

      }
  String respuesta = IO.readln ("¿Deseas agregar otro paciente? (s/n): ");
  continuar = respuesta.equalsIgnoreCase ("s");
  int categoria;
            if (IMC < 18.5) {
                categoria = 1;
            } else if (IMC < 25) {
                categoria = 2;
            } else if (IMC < 30) {
                categoria = 3;
            } else if (IMC < 35) {
                categoria = 4;
            } else if (IMC < 40) {
                categoria = 5;
            } else {
                categoria = 6;
            }
            switch (categoria) {
                case 1:
                    System.out.println("Descripción papular: Delgado ");
                   
                    break;

                case 2:
                    System.out.println("Descripción papular: Aceptable ");
                         
                    break;

                case 3:
                    System.out.println("Descripción papular: Sobrepeso ");
                   
                    break;

                case 4:
                    System.out.println("Descripción papular: obesidad  ");
                    
                    break;

                case 5:
                    System.out.println("Descripción papular: obesidad  ");
                    
                    break;

                case 6:
                   System.out.println("Descripción papular: obesidad  ");
                    break;
  } }while (continuar);

 }

 

   


 







    }   

