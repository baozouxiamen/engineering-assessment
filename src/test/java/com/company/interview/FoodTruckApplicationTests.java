package com.company.interview;

import com.company.interview.bean.view.FoodTruckView;
import com.company.interview.controller.FoodTruckController;
import com.company.interview.service.FoodTruckService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class FoodTruckApplicationTests {

	private MockMvc mockMvc;

    @Mock
    private FoodTruckService foodTruckService;

    @InjectMocks
    private FoodTruckController foodTruckController;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(foodTruckController).build();
    }

    @Test
    public void getOneByLocationId() throws Exception {
        Long locationId = 1L;
        FoodTruckView view = new FoodTruckView();
        view.setX("6008186.3545");
        view.setY("2121568.8178");
        view.setApplicant("test1");
        view.setLatitude("37.8058");
        view.setLongitude("-122.4159");
        view.setLocationId("1");

        when(foodTruckService.getOneByLocationId(0l)).thenReturn(view);

        mockMvc.perform(get("/foodTruck/locationId/{locationId}", locationId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.x").value("6008186.3545"))
                .andExpect(jsonPath("$.y").value("2121568.8178"))
                .andExpect(jsonPath("$.applicant").value("test1"))
                .andExpect(jsonPath("$.latitude").value("37.8058"))
                .andExpect(jsonPath("$.longitude").value("-122.4159"))
                .andExpect(jsonPath("$.locationId").value("1"));
    }
}
