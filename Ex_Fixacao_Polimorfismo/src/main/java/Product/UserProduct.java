
package Product;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UserProduct extends Produto {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date manuFactureDate;
    
    public UserProduct(){
        super();
    }
    
    public UserProduct(Date manuFactureDate, String name, Double price) {
        super(name, price);
        this.manuFactureDate = manuFactureDate;
    }
    
    @Override
    public String priceTag(){    
        return super.getName() + "(used)" +  " $ " + super.getPrice() + " Date: " + sdf.format(manuFactureDate);    
    }
}
