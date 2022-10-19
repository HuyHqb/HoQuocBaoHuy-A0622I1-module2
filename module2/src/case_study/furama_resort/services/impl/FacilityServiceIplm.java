package case_study.furama_resort.services.impl;

import case_study.furama_resort.facilities.Facility;
import case_study.furama_resort.services.FacilityService;

import java.util.*;

public class FacilityServiceIplm implements FacilityService {
    private static final LinkedHashMap<Integer, Facility> facilitiesList = new LinkedHashMap<Integer, Facility>();
    private static final Scanner scanner = new Scanner(System.in);

    static {

    }

    @Override
    public void display() {
        Set<Integer> keys = facilitiesList.keySet();
        for (Integer key : keys) {
            System.out.println("Key: " + key + " | Value: " + facilitiesList.get(key));
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
