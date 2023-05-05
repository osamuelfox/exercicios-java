
package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    
    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");


    @Override
    public String toString() {
        return "Client: " + "name: " + name + ", email: " + email + ", birthDate: " + sdf.format(birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
    
}
