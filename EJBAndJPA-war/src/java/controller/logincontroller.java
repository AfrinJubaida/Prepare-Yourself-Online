/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.sun.glass.ui.Cursor.setVisible;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author afrin
 */
@Named(value = "logincontroller")
@SessionScoped
public class logincontroller implements Serializable {

    int userid,adminid;
    String username,adminname;
    public logincontroller() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }
    public String validatestudent()
    {
            if(userid==52 && username.equals("afrin")) {return "home";}
            else if(userid==75 && username.equals("hafiz")) {return "home";}
            else if(userid==50 && username.equals("anika")) {return "home";}
            else if(userid==49 && username.equals("raisa")) {return "home";}
            else if(userid==46 && username.equals("hamim")) {return "home";}
            else return "index";
}
    public String validateadmin()
    {
        if(adminid==1 && adminname.equals("admin")) {return "admin_page";}
        
        else return "index";
    }
}
