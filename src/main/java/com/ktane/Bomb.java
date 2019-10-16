package com.ktane;

import com.ktane.module.Mod;

import java.util.List;
import java.util.Map;

public class Bomb {
    private Integer battery;
    private Map<String, Boolean> labels;
    private Map<String, Boolean> ports;
    private String serial;
    private List<Mod> modules;

    public Bomb(Integer battery, Map<String, Boolean> labels, Map<String, Boolean> ports, String serial) {
        this.battery = battery;
        this.labels = labels;
        this.ports = ports;
        this.serial = serial;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Map<String, Boolean> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, Boolean> labels) {
        this.labels = labels;
    }

    public Map<String, Boolean> getPorts() {
        return ports;
    }

    public void setPorts(Map<String, Boolean> ports) {
        this.ports = ports;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
