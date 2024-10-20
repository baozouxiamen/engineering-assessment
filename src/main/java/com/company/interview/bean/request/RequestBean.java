package com.company.interview.bean.request;

/**
 * @author liangong.ge
 * @Created 2024/10/18 12:03
 */
public class RequestBean {

    private double latitude;

    private double longitude;

    private int limit = 20;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
