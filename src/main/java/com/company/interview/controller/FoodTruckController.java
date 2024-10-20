package com.company.interview.controller;

import com.company.interview.bean.request.RequestBean;
import com.company.interview.bean.view.FoodTruckView;
import com.company.interview.service.FoodTruckService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author liangong.ge
 * @Created 2024/10/18 12:03
 */
@RestController
@RequestMapping("foodTruck")
public class FoodTruckController {

    @Autowired
    private FoodTruckService foodTruckService;

    @RequestMapping("/locationId/{locationId}")
    public FoodTruckView getOneByLocationId(@PathVariable Long locationId){
        return foodTruckService.getOneByLocationId(locationId);
    }

    @PostMapping("getAll")
    public List<FoodTruckView> getAllByDistance(@RequestBody RequestBean requestBean){
        return foodTruckService.getAllByDistance(requestBean.getLatitude(), requestBean.getLongitude(), requestBean.getLimit());
    }
}
