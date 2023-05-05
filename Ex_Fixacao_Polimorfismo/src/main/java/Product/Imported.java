
package Product;

public class Imported extends Produto{
    
    private Double customsFree;
    
    public Imported(){
    }

    public Imported(Double customsFree, String name, Double price) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public Double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFree = customsFree;
    }
    
    public double totalPrice(){
        return super.getPrice() + customsFree;
    }
    
    @Override
    public String priceTag(){
        return super.getName() + " $ " + totalPrice() + " Customs fee " + customsFree;  
    }   
}
