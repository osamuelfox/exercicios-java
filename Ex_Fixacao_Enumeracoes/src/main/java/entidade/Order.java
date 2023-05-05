
package entidade;

import entidade.enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
public class Order {
    private OrderStatus status;
    private Date moment;
    private Client client;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");

    private List<OrderItem> Itens = new ArrayList<>();
    
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    
    public Order(){
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItem() {
        return Itens;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.Itens = orderItem;
    }
    
    public void addItem(OrderItem item){
        Itens.add(item);
    }
    
    public void removeItem(OrderItem item){
        Itens.remove(item);
    };

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItens() {
        return Itens;
    }
 
    public double Total(OrderItem order){
        double total = 0;
        
        for(OrderItem item : Itens){
            total += item.subTotal();
        }
        
        return total;
    }

    @Override
    public String toString() {
        return "Order{" + "status=" + status + ", moment=" +sdf.format(moment) + ", client=" + client + ", Itens=" + Itens + '}';
        

    }    
    
    
    
}
