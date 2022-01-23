package com.lucky.extension.selfEditor;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author: Loki
 * @data: 2021-10-13 15:13
 **/
public class Address {
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 镇
     */
    private String town;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("province='").append(province).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", town='").append(town).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
