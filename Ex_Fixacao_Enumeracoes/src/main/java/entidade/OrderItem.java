
package entidade;

public class OrderItem {
    
    
    
    private Integer quantify;
    private Double price;
    
    public OrderItem(Integer quantify, Double price) {
        this.quantify = quantify;
        this.price = price;
    }

    public OrderItem() {
    }

    public Integer getQuantify() {
        return quantify;
    }

    public void setQuantify(Integer quantify) {
        this.quantify = quantify;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public double subTotal(){
        return quantify * price;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "quantify=" + quantify + ", SubTotal=" +  + '}';
    }
    
    
   
    
    

}
