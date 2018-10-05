
package NumBin;

/**
 *
 * @author Ingrid xooc
 */
public class NumeroBinario {
    public long Binario(int num){
        if (num<2){ //si el numero es menor a 2 entonces el valor en bnario es 1
            return num;
        }else{
            //
            return (num%2 + Binario(num/2)*10); // si el numero es mayor a uno, entoces al modulo se realiza el mismo metodo 
                                                // hasta que el numero de que se le envia al metodo se el caso base (1).
                                                // Cada vez que se le llama al mètodo, se multiplica el resultado
                                                // para que el primer resultado vaya de izquierda a derecha
        }
    }
}
