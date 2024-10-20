package com.company.interview.service;

import com.company.interview.bean.view.FoodTruckView;
import com.company.interview.dao.FoodTruckRepository;
import com.company.interview.bean.entity.FoodTruckInfo;
import com.company.interview.utils.BeanCopyUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author liangong.ge
 * @Created 2024/10/18 12:03
 */
@Service
public class FoodTruckService {

    @Autowired
    private FoodTruckRepository foodTruckRepository;

    public List<FoodTruckView> getAllByDistance(double latitude, double longitude, int limit) {
        return BeanCopyUtil.batchCopy(sortByDistance(foodTruckRepository.getAll(), latitude, longitude, limit),FoodTruckView.class);
    }

    public FoodTruckView getOneByLocationId(Long LocationId){
    	return BeanCopyUtil.singleCopy(foodTruckRepository.getOneByLocationId(LocationId), FoodTruckView.class);
    }

    private double getMinDistance(double lat1, double lon1, double lat2, double lon2) {
        return Math.sqrt((lat2 - lat1) * (lat2 - lat1) + (lon2 - lon1) * (lon2 - lon1));
    }

    private List<FoodTruckInfo> sortByDistance(List<FoodTruckInfo> rawDataList, double latitude, double longitude, int limit) {
    	rawDataList.sort((m1, m2) -> {
            double distance1 = getMinDistance(latitude, longitude, Double.parseDouble(m1.getLatitude()), Double.parseDouble(m1.getLongitude()));
            double distance2 = getMinDistance(latitude, longitude, Double.parseDouble(m2.getLatitude()), Double.parseDouble(m2.getLongitude()));
            return Double.compare(distance1, distance2);
        });

        return rawDataList.subList(0, Math.min(limit, rawDataList.size()));
    }
}
