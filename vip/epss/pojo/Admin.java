package vip.epss.pojo;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Admin implements Serializable {
private Integer id;
private  String adminname;
private  String password;
private  Info info;
private List<Business> businesses=new ArrayList<>();
private Timestamp uptime;

    public Admin() {
    }

    public Admin(String adminname, String password) {
        this.adminname = adminname;
        this.password = password;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminname='" + adminname + '\'' +
                ", password='" + password + '\'' +
                ", uptime=" + uptime +
                '}';
    }
}
