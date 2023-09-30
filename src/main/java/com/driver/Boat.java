/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.driver;

/**
 *
 * @author anoop
 */
public class Boat implements WaterVehicle{
    String name;
    int capacity;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public Boat(){

    }

    public Boat(String name,int capacity){
        this.capacity = capacity;
        this.name = name;
    }

    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }
}
