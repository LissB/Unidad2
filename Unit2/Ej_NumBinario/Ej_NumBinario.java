package ej_numbinario;
import NumBin.NumeroBinario;
import java.util.Scanner;


public class Ej_NumBinario {
    public static void main(String[] args) {
        Scanner t1= new Scanner(System.in);
        int num;
        long resul;
        NumeroBinario ob1= new NumeroBinario(); //objeto de la clase
        System.out.println("Ingresa una cantidad: ");
        num=t1.nextInt();
        resul=ob1.Binario(num);
        System.out.println("La cantida de "+ num + " equivale a " + resul);
    }

       
}
