package com.company.interview.dao;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Repository;

import com.company.interview.bean.entity.FoodTruckInfo;

import jakarta.annotation.PostConstruct;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

/**
 * @author liangong.ge
 * @Created 2024/10/18 12:03
 */
@Repository
public class FoodTruckRepository {

	private static String fileName = "Mobile_Food_Facility_Permit.csv";
    private List<FoodTruckInfo> allList = new ArrayList<>();
    
    @PostConstruct
    public List<FoodTruckInfo> initData() {
        try {
            allList = dataParse(FoodTruckRepository.class.getClassLoader().getResource(fileName).getPath());
            return allList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<FoodTruckInfo> dataParse(String filePath) throws IOException {
        List<FoodTruckInfo> rawDataList = new ArrayList<>();
        try (Reader reader = new FileReader(filePath)) {
            for (CSVRecord temp : CSVFormat.RFC4180.withFirstRecordAsHeader().parse(reader)) {
                FoodTruckInfo ft = new FoodTruckInfo();
                ft.setLocationId(temp.get("locationid"));
                ft.setApplicant(temp.get("Applicant"));
                ft.setFacilityType(temp.get("FacilityType"));
                ft.setCnn(temp.get("cnn"));
                ft.setLocationDescription(temp.get("LocationDescription"));
                ft.setAddress(temp.get("Address"));
                ft.setBlockLot(temp.get("blocklot"));
                ft.setBlock(temp.get("block"));
                ft.setLot(temp.get("lot"));
                ft.setPermit(temp.get("permit"));
                ft.setStatus(temp.get("Status"));
                ft.setFoodItems(temp.get("FoodItems"));
                ft.setX(temp.get("X"));
                ft.setY(temp.get("Y"));
                ft.setLatitude(temp.get("Latitude"));
                ft.setLongitude(temp.get("Longitude"));
                ft.setSchedule(temp.get("Schedule"));
                ft.setDayshours(temp.get("dayshours"));
                ft.setNOISent(temp.get("NOISent"));
                ft.setApproved(temp.get("Approved"));
                ft.setReceived(temp.get("Received"));
                ft.setPriorPermit(temp.get("PriorPermit"));
                ft.setExpirationDate(temp.get("ExpirationDate"));
                ft.setLocation(temp.get("Location"));
                ft.setFirePreventionDistricts(temp.get("Fire Prevention Districts"));
                ft.setPoliceDistricts(temp.get("Police Districts"));
                ft.setSupervisorDistricts(temp.get("Supervisor Districts"));
                ft.setZipCodes(temp.get("Zip Codes"));
                ft.setNeighborhoodsOld(temp.get("Neighborhoods (old)"));

                rawDataList.add(ft);
            }
        }
        return rawDataList;
    }

    public FoodTruckInfo getOneByLocationId(Long locationId) {
        return getAll().stream()
                .filter(foodTruck -> foodTruck.getLocationId().equals(locationId.toString()))
                .findFirst().get();
    }
    
    public List<FoodTruckInfo> getAll() {
        return allList;
    }
}
