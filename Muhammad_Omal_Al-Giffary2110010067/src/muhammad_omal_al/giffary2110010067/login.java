package muhammad_omal_al.giffary2110010067;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Horizz
 */
public class login {
    private int id_login;
    private String username;
    private String password;
    private owner owner;
    private kasir kasir;

    public login(int id_login, String username, String password, owner owner, kasir kasir) {
        this.id_login = id_login;
        this.username = username;
        this.password = password;
        this.owner = owner;
        this.kasir = kasir;
    }

    // Getter and Setter methods

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

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

    public owner getowner() {
        return owner;
    }

    public void setowner(owner owner) {
        this.owner = owner;
    }

    public kasir getkasir() {
        return kasir;
    }

    public void setkasir(kasir kasir) {
        this.kasir = kasir;
    }
}
