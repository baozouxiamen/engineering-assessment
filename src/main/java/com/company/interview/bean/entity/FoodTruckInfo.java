package com.company.interview.bean.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author liangong.ge
 * @Created 2024/10/18 12:03
 */
public class FoodTruckInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String locationId;
    private String applicant;
    private String facilityType;
    private String cnn;
    private String locationDescription;
    private String address;
    private String blockLot;
    private String block;
    private String lot;
    private String permit;
    private String status;
    private String foodItems;
    private String X;
    private String Y;
    private String latitude;
    private String longitude;
    private String schedule;
    private String dayshours;
    private String NOISent;
    private String approved;
    private String received;
    private String priorPermit;
    private String expirationDate;
    private String location;
    private String firePreventionDistricts;
    private String policeDistricts;
    private String supervisorDistricts;
    private String zipCodes;
    private String neighborhoodsOld;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getCnn() {
        return cnn;
    }

    public void setCnn(String cnn) {
        this.cnn = cnn;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBlockLot() {
        return blockLot;
    }

    public void setBlockLot(String blockLot) {
        this.blockLot = blockLot;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    public String getX() {
        return X;
    }

    public void setX(String x) {
        X = x;
    }

    public String getY() {
        return Y;
    }

    public void setY(String y) {
        Y = y;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDayshours() {
        return dayshours;
    }

    public void setDayshours(String dayshours) {
        this.dayshours = dayshours;
    }

    public String getNOISent() {
        return NOISent;
    }

    public void setNOISent(String NOISent) {
        this.NOISent = NOISent;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getPriorPermit() {
        return priorPermit;
    }

    public void setPriorPermit(String priorPermit) {
        this.priorPermit = priorPermit;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFirePreventionDistricts() {
        return firePreventionDistricts;
    }

    public void setFirePreventionDistricts(String firePreventionDistricts) {
        this.firePreventionDistricts = firePreventionDistricts;
    }

    public String getPoliceDistricts() {
        return policeDistricts;
    }

    public void setPoliceDistricts(String policeDistricts) {
        this.policeDistricts = policeDistricts;
    }

    public String getSupervisorDistricts() {
        return supervisorDistricts;
    }

    public void setSupervisorDistricts(String supervisorDistricts) {
        this.supervisorDistricts = supervisorDistricts;
    }

    public String getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(String zipCodes) {
        this.zipCodes = zipCodes;
    }

    public String getNeighborhoodsOld() {
        return neighborhoodsOld;
    }

    public void setNeighborhoodsOld(String neighborhoodsOld) {
        this.neighborhoodsOld = neighborhoodsOld;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodTruckInfo foodTruck = (FoodTruckInfo) o;
        return Objects.equals(locationId, foodTruck.locationId) && Objects.equals(applicant, foodTruck.applicant) && Objects.equals(facilityType, foodTruck.facilityType) && Objects.equals(cnn, foodTruck.cnn) && Objects.equals(locationDescription, foodTruck.locationDescription) && Objects.equals(address, foodTruck.address) && Objects.equals(blockLot, foodTruck.blockLot) && Objects.equals(block, foodTruck.block) && Objects.equals(lot, foodTruck.lot) && Objects.equals(permit, foodTruck.permit) && Objects.equals(status, foodTruck.status) && Objects.equals(foodItems, foodTruck.foodItems) && Objects.equals(X, foodTruck.X) && Objects.equals(Y, foodTruck.Y) && Objects.equals(latitude, foodTruck.latitude) && Objects.equals(longitude, foodTruck.longitude) && Objects.equals(schedule, foodTruck.schedule) && Objects.equals(dayshours, foodTruck.dayshours) && Objects.equals(NOISent, foodTruck.NOISent) && Objects.equals(approved, foodTruck.approved) && Objects.equals(received, foodTruck.received) && Objects.equals(priorPermit, foodTruck.priorPermit) && Objects.equals(expirationDate, foodTruck.expirationDate) && Objects.equals(location, foodTruck.location) && Objects.equals(firePreventionDistricts, foodTruck.firePreventionDistricts) && Objects.equals(policeDistricts, foodTruck.policeDistricts) && Objects.equals(supervisorDistricts, foodTruck.supervisorDistricts) && Objects.equals(zipCodes, foodTruck.zipCodes) && Objects.equals(neighborhoodsOld, foodTruck.neighborhoodsOld);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, applicant, facilityType, cnn, locationDescription, address, blockLot, block, lot, permit, status, foodItems, X, Y, latitude, longitude, schedule, dayshours, NOISent, approved, received, priorPermit, expirationDate, location, firePreventionDistricts, policeDistricts, supervisorDistricts, zipCodes, neighborhoodsOld);
    }
}
