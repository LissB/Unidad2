package Palindrome;
/**
 *
 * @author Ingrid Xooc
 */
public class Palabra {
    public boolean Palindromo(String texto, int i, int j){
        //int tam= texto.length()/2;
        if(i != texto.length()/2){
            if( texto.charAt(i) == texto.charAt(j)){
                 return Palindromo(texto,i+1,j-1);
            }else{ return false;
            } 
        }return true;
        
    }
}