package com.aiotests.samples.deforestation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TreeTrackerModule {
    private static TreeTrackerModule treeTrackerModule;
    private Map<Date, Integer> numberOfTreesByDay = new HashMap<>();
    public static TreeTrackerModule getTreeTracker() {
        if(treeTrackerModule == null) {
            treeTrackerModule = new TreeTrackerModule();
        }
        return treeTrackerModule;
    }
    public void setNumberOfTrees(int numberOfTrees){
        numberOfTreesByDay.put(new Date(), numberOfTrees);
    }

    public void plantTrees(int numberOfTrees){
        numberOfTreesByDay.put(new Date(), numberOfTrees);
    }
}
