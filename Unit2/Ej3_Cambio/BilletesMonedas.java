package Cambio;

/**
 *
 * @author Ingrid Xooc
 */
public class BilletesMonedas {
    public int Doscientos(int cambio){
        if(cambio/200 == 0){return 0;}
        else{
            if(cambio/200 == 1){return 1;}
            else{
                return (1) + Doscientos(cambio-200);
            }
        } 
    }  
    public int Cien(int cambio){
        cambio=cambio-(Doscientos(cambio)*200);
        if(cambio/100==0){return 0;}
        else{
            if(cambio/100 == 1){return 1;}
            else{
                return (1) + Cien(cambio-100);
            }
        }
    }
    public int Cincuenta(int cambio){
        cambio=cambio-(Doscientos(cambio)*200)-(Cien(cambio)*100);
        if(cambio/50==0){return 0;}
        else{
            if(cambio/50 == 1){return 1;}
            else{
                return (1) + Cincuenta(cambio-50);
            }
        }
    }
    public int Veinte(int cambio){
        cambio=cambio-(Doscientos(cambio)*200)-(Cien(cambio)*100)-(Cincuenta(cambio)*50);
        if(cambio/20==0){return 0;}
        else{
            if(cambio/20 == 1){return 1;}
            else{
                return (1) + Veinte(cambio-20);
            }
        }
    }
    public int Diez(int cambio){
        cambio=cambio-(Doscientos(cambio)*200)-(Cien(cambio)*100)-(Cincuenta(cambio)*50)-(Veinte(cambio)*20);
        if(cambio/10==0){return 0;}
        else{
            if(cambio/10 == 1){return 1;}
            return 0;
        }
    }
    public int Cinco(int cambio){
        cambio=cambio-(Doscientos(cambio)*200)-(Cien(cambio)*100)-(Cincuenta(cambio)*50)-(Veinte(cambio)*20)-(Diez(cambio)*10);
        if(cambio/5==0){return 0;}
        else{
            if(cambio/5 == 1){return 1;}
            return 0;
        }
    }
    public int Dos(int cambio){
        cambio=cambio-(Doscientos(cambio)*200)-(Cien(cambio)*100)-(Cincuenta(cambio)*50)-(Veinte(cambio)*20)-(Diez(cambio)*10)-(Cinco(cambio)*5);
        if(cambio/2==0){return 0;}
        else{
            if(cambio/2 == 1){return 1;}
            else{return (1) + Dos(cambio-2);}
        }
    }    
    public int Peso(int cambio){
        cambio=cambio-(Doscientos(cambio)*200)-(Cien(cambio)*100)-(Cincuenta(cambio)*50)-(Veinte(cambio)*20)-(Diez(cambio)*10)-(Cinco(cambio)*5)-(Dos(cambio)*2);
        if(cambio==0){return 0;}
        else{
            return 1;
        }
    } 
}

