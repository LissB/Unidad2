
package ej3_cambio;
import Cambio.BilletesMonedas;
import java.util.Scanner;

/**
 *
 * @author Windows 8
 */
public class Ej3_Cambio {public static void main(String[] args) {
    BilletesMonedas ob1 =new BilletesMonedas();//objeto de la clase, para poder llamar metodos 
    Scanner t1 =new Scanner(System.in); //Declaracion del escaner para leer datos que el usuario ingresa
    int compra,efectivo, cambio, res;
    System.out.println("Compra realizada: ");
    compra=t1.nextInt();
    System.out.println("Efectivo: ");
    efectivo=t1.nextInt();
    cambio=efectivo-compra;
    int[] BilMod = new int[8];
    BilMod[0]=1;
    BilMod[1]=2;
    BilMod[2]=5;
    BilMod[3]=10; 
    BilMod[4]=20;
    BilMod[5]=50;
    BilMod[6]=100;
    BilMod[7]=200;
    if(ob1.Doscientos(cambio)>=1){System.out.println(ob1.Doscientos(cambio)+ " billete(s) de "+BilMod[7]);
    }
    if(ob1.Cien(cambio)>=1){System.out.println(ob1.Cien(cambio)+ " moneda(s) de "+BilMod[6]);    
    }    
    if(ob1.Cincuenta(cambio)>=1){System.out.println(ob1.Cincuenta(cambio)+ " moneda(s) de "+BilMod[5]);
    }
    if(ob1.Veinte(cambio)>=1){System.out.println(ob1.Veinte(cambio)+ " moneda(s) de "+BilMod[4]);
    }
    if(ob1.Diez(cambio)>=1){System.out.println(ob1.Diez(cambio)+ " moneda(s) de "+BilMod[3]);
    }
    if(ob1.Cinco(cambio)>=1){System.out.println(ob1.Cinco(cambio)+ " moneda(s) de "+BilMod[2]);
    }
    if(ob1.Dos(cambio)>=1){System.out.println(ob1.Dos(cambio)+ " moneda(s) de "+BilMod[1]);
    }
    if(ob1.Peso(cambio)>=1){System.out.println(ob1.Peso(cambio)+ " moneda(s) de "+BilMod[0]);
    }
       
    }
    
}
