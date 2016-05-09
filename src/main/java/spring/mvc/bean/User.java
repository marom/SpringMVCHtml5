package spring.mvc.bean;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by maro on 14/04/16.
 */
@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue
    @Column(name="IDUSER")
    private int idUser;

    @NotEmpty
    @Column(name="USERNAME")
    private String username;

    @NotEmpty
    @Column(name="PASSWORD")
    private String password;

    @Column(name="ENABLED")
    private boolean enabled;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
