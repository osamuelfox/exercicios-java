package Employee;

public class terceirizados extends Funcionarios{
    
    private Double taxaAdicional;

    public terceirizados() {
        super();
    }

    public terceirizados(Double taxaAdicional, String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
        this.taxaAdicional = taxaAdicional;
    }

    public Double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(Double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }
    
    
    @Override
    public double pagamento(){
        return super.pagamento() + taxaAdicional * 1.1;
        
    }
    
}
