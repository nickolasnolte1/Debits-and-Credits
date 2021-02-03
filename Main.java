import java.util.*;

public class Main{

static double[] Borrar(double[] arr, int remove){
    arr[remove-1] = 0;
    return arr;
}

public static void main(String args[]){
    Scanner input = new Scanner (System.in);

    //declaro variables 
    double[] creditos = new double[50];

    double[] debitos = new double[50];

    double promedio = 0;

    double maxvalue = 0;

    double saldototal = 0;

    int contador1 = 0;

    int contador2 = 0;

    double sumacredits = 0;

    double sumadebits = 0;
    
    

    //Menú

    boolean condicion = true;
        while (condicion == true) {
            System.out.print ("\n\n* Elija la opción que desee: *\n");
            System.out.print("presione 1 --------- Ingresar un débito (Ingrese 10 como mínimo)  \n");
            System.out.print("presione 2 --------- Ingresar un crédito (Ingrese 5 como mínimo) \n");
            System.out.print("presione 3 --------- Eliminar un crédito  \n");
            System.out.print("presione 4 --------- Mostrar información (debe haber ingresado 10 débitos y 5 créditos como mínimo)  \n");
            int npnb = input.nextInt();
        
            switch (npnb) {
                    case 1:
                    System.out.print ("\n  Ingrese el monto del débito: Q. ");
                    double debit = input.nextInt();
                    debitos[contador2] = debit;

                    System.out.print (debitos[contador2]);
                    contador2++;

                    System.out.print ("\n Total de débitos ingresados hasta ahora: " +contador2);
                    break;
                   

                case 2:
                    System.out.print ("\n  Ingrese el monto del crédito: Q.");
                    double credit = input.nextInt();
                    creditos[contador1] = credit;

                    System.out.print (creditos[contador1]);
                    contador1++;

                    System.out.print ("\n Total de créditos ingresados hasta ahora:  " + contador1);
                    break;
     
                    
            
                case 3: 
                    System.out.print("¿Cuál crédito desea eliminar? ");
                    int borrar = input.nextInt();
                    creditos = Borrar(creditos, borrar);

                case 4: 
                    if (contador1 < 4 && contador2 < 9){
                        condicion = true;
                        break;
                    }
                    else if (contador1 >= 4 && contador2 >=9) {
                        condicion = false;
                    }
            }
        }
        for (int a = 0; a < creditos.length; a++){
            sumacredits += creditos[a];
            sumadebits += debitos[a];

        }
        //Print de la información

        System.out.print ("\n SUMA TOTAL DE DEBITOS: "+ sumadebits);

        System.out.print ("\n SUMA TOTAL DE CREDITOS: "+ sumacredits);

        saldototal = sumacredits-sumadebits  ;

        System.out.print ("\n SALDO TOTAL: " + saldototal);

        promedio = sumadebits / contador2;

        System.out.print ("\n PROMEDIO DE DEBITO: " + promedio);

        for (int b = 0; b < debitos.length; b++){
            if (maxvalue < debitos[b]){
                maxvalue = debitos[b];
            }
        }

        System.out.print ("\n DEBITO MAS GRANDE: " + maxvalue);

        System.out.print ("\n TOTAL DE DEBITOS: " + contador2);

        System.out.print ("\n TOTAL DE CREDITOS: " + contador1);
        
        

    }
} 
