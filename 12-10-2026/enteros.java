
public class enteros {
    public static void main(String[] args) {
    int[] numeros = new int[10];
    

    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;
    numeros[5] = 6;
    numeros[6] = 7;
    numeros[7] = 8;
    numeros[8] = 9;
    numeros[9] = 10;

   
    int min = numeros[0];
    int max = numeros[0];
    int pos1 = 0;
    int pos2 = 0;

    for (int i=0; i<numeros.length;i++){
        if (numeros[i]<min){
            min=numeros[i]; 
            pos1=i;
        }
        
        else{
            if (numeros[i]>max){
                max=numeros[i]; 
                pos2=i;
           
            }
        }     
    }
    System.out.println("El número más pequeño es:   " +   min           );
    System.out.println("Posición:   " +   pos1    );
    System.out.println("El número más grande es:   " +    max          );
    System.out.println("Posición:   " +   pos2    );
   
    }
   
}
