package com.itheima.pojo;

public class Address {
    private String prince;
    private String city;

    public Address() {
    }

    public Address(String prince, String city) {
        this.prince = prince;
        this.city = city;
    }

    /**
     * 获取
     * @return prince
     */
    public String getPrince() {
        return prince;
    }

    /**
     * 设置
     * @param prince
     */
    public void setPrince(String prince) {
        this.prince = prince;
    }

    /**
     * 获取
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Address{prince = " + prince + ", city = " + city + "}";
    }
}
