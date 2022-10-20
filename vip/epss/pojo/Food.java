package vip.epss.pojo;

import java.security.Timestamp;

public class Food {
    private  Integer id;
    private  String foodName;
    private  String foodExplain;
    private  Double foodPrice;
    private Integer businessId;
    private  Business business;
    private Timestamp uptime;

    public Food() {
    }

    public Food(String foodName, String foodExplain, Double foodPrice) {
        this.foodName = foodName;
        this.foodExplain = foodExplain;
        this.foodPrice = foodPrice;
    }

    public Integer getId() {
        return id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public void setFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Timestamp getUptime() {
        return uptime;
    }


    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", foodExplain='" + foodExplain + '\'' +
                ", foodPrice=" + foodPrice +
                ", businessId=" + businessId +
                ", business=" + business +
                ", uptime=" + uptime +
                '}';
    }
}
