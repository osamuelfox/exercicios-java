
package Exception;

import entidade.reserva;

public class entrada extends RuntimeException{
    
    public entrada (reserva res){
        throw new exception("Erro de entrada");
    }
    
}
