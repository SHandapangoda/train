package model;

import java.io.Serializable;

public class train implements Serializable {

    private static final long serial=1L;
    private String trainName;
    private int tID;
    private String destination;
    private String depature;

    public train(String destination, String depature,String trainName) {

    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int gettID() {
        return tID;
    }

    public void settID(int tID) {
        this.tID = tID;
    }

    public String getDestination() {

        return destination;
    }

    public void setArrival(String arrival) {
        this.destination = arrival;
    }

    public String getDepature()  {

        return depature;
    }

    public void setDepature(String depature) {
        this.depature=depature;
    }
}
