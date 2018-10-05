package ej_palindrome;
import Palindrome.Palabra;
import java.util.Scanner;

/**
 *
 * @author Ingrid Xooc
 */
public class Ej_Palindrome {
    public static void main(String[] args) {
        Palabra ob1=new Palabra();//objeto de la clase
        Scanner t1= new Scanner(System.in);
        String texto;
        int i, j;
        /*int op;
        op=1;
        //while(op!=0){*/
        System.out.println("Ingresa la palabra");
        texto=t1.nextLine();
        texto=texto.replaceAll(" ","");
        i=0;
        j=texto.length()-1;        
        if(ob1.Palindromo(texto,i,j)==true){
            System.out.println("Es palindrome");
        }else{
            System.out.println("No es palindrome");
        } 
        //op=t1.nextInt();
        //}

    }
    
}
