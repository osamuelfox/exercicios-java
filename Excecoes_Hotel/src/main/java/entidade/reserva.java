
package entidade;

import Exception.entrada;
import Exception.exception;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class reserva {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    private Integer numeroQuarto;
    private Date checkin;
    private Date chechout;
    
    public reserva(){
    }

    public reserva(Integer numeroQuarto, Date checkin, Date chechout) {
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

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getChechout() {
        return chechout;
    }

    public void setChechout(Date chechout) {
        this.chechout = chechout;
    }
    
    public Integer duracao(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
         
        int ini = Integer.parseInt(sdf.format(checkin));
        int fim = Integer.parseInt(sdf.format(chechout));
        
        return fim - ini;
    }

   
    
    public void updateDates(Date dataIni, Date datafim ){
        this.checkin = dataIni;
        this.chechout = datafim;
    }
    
  
    public void data(){
        if(this.duracao() < 0){
            try {
                throw new Exception("Erro: a data nao ser inferior");
            } catch (Exception ex) {
                Logger.getLogger(reserva.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
     @Override
    public String toString() {
        return "reserva: Quarto " + numeroQuarto + ", checkin: " + sdf.format(getCheckin()) + " chechout: " + sdf.format(getChechout()) + " " + duracao() + " Noites ";
    }

    

}
