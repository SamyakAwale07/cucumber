package com.aiotests.samples.deforestation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TemperatureTrackerModule {
    private Map<Date, Integer> dayWiseTemperatureMap = new HashMap<>();
    private static TemperatureTrackerModule temperatureTrackerModule;
    public static TemperatureTrackerModule getTempTracker() {
        if(temperatureTrackerModule == null) {
            temperatureTrackerModule = new TemperatureTrackerModule();
        }
        return temperatureTrackerModule;
    }
    public void setTemperature(Integer temperature){
        dayWiseTemperatureMap.put(new Date(), temperature);
    }

    public void clearTemperature(){
        dayWiseTemperatureMap.put(new Date(), null);
    }

}
