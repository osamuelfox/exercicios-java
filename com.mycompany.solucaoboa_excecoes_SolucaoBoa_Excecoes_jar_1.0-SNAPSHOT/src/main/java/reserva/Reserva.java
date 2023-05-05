
package reserva;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    
    private Integer quartoNumero;
    private Date entrada;
    private Date saida;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

    public Reserva(Integer quartoNumero, Date entrada, Date saida) {
        this.quartoNumero = quartoNumero;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Integer getQuartoNumero() {
        return quartoNumero;
    }

    public void setQuartoNumero(Integer quartoNumero) {
        this.quartoNumero = quartoNumero;
    }

    public Date getEntrada() {
        return entrada;
    }


    public Date getSaida() {
        return saida;
    }
    
    public long duracao(){
        long diferenca = saida.getTime() - entrada.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
           
    }
    
    public void atualizaData(Date entrada, Date saida){
        
        Date presente = new Date();
        
        if ( entrada.before(presente) || saida.before(presente)){
            throw new IllegalArgumentException(" Erro na reserva: reserva somente podem ser feitas com datas futuras ");
        }
        if (!saida.after(entrada)){
            throw new IllegalArgumentException("Erro na reserva: Data de saida anterior a data de entrada");
        }
        
        this.entrada = entrada;
        this.saida = saida;
    }

    @Override
    public String toString() {
        return "Reserva: " 
                + "quartoNumero: " 
                + quartoNumero 
                + ", entrada: " 
                + sdf.format(entrada) 
                + ", saida: " 
                + sdf.format(saida) 
                + ", "
                + duracao()
                +" Noites";
    }
    
    
}
