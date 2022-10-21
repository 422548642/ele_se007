package vip.epss.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
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

    public Admin(Integer id, String adminname, String password, Timestamp uptime) {
        this.id = id;
        this.adminname = adminname;
        this.password = password;
        this.uptime = uptime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
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
