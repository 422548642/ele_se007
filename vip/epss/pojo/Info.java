package vip.epss.pojo;

import java.security.Timestamp;

public class Info {
    private  Integer id;
    private String phone;
    private  String avater;
    private Short gender;
    private Admin admin;
    private Timestamp uptime;

    public Info() {
    }

    public Info(String phone, String avater, short gender) {
        this.phone = phone;
        this.avater = avater;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Timestamp getUptime() {
        return uptime;
    }


    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", avater='" + avater + '\'' +
                ", gender=" + gender +
                ", admin=" + admin +
                ", uptime=" + uptime +
                '}';
    }
}
