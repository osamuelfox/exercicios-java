
package entidade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Reserva {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    private Integer numeroQuarto;
    private Date checkin;
    private Date chechout;
    
    public Reserva(){
    }

    public Reserva(Integer numeroQuarto, Date checkin, Date chechout) {
        this.numeroQuarto = numeroQuarto;
        this.checkin = checkin;
        this.chechout = chechout;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
    public Date getCheckin() {
        return checkin;
    }

    public Date getChechout() {
        return chechout;
    }
    
    public long duracao(){
        
        long diferenca = chechout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }
    
    public void updateDates( Date checkin, Date checkout){
        
        this.checkin = checkin;
        this.chechout = chechout;
    }
    

    @Override
    public String toString() {
        return "reserva: Quarto" + numeroQuarto + ", checkin: " + sdf.format(checkin) + " chechout: " + sdf.format(chechout) + " " + duracao() + " Noites ";
    }
    
}
