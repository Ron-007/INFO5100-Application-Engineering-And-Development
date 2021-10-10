/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ronak
 */
public class Car {
    
    private Integer id;
    private String carSerialNo;
    private String manufactureBy;
    private String manufactureYear;
    private String modelNo;
    private String location;
    private Integer noOfSeats;
    private Boolean carAvail;
    private Boolean mainCerti;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarSerialNo() {
        return carSerialNo;
    }

    public void setCarSerialNo(String carSerialNo) {
        this.carSerialNo = carSerialNo;
    }

    public String getManufactureBy() {
        return manufactureBy;
    }

    public void setManufactureBy(String manufactureBy) {
        this.manufactureBy = manufactureBy;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Boolean getCarAvail() {
        return carAvail;
    }

    public void setCarAvail(Boolean carAvail) {
        this.carAvail = carAvail;
    }

    public Boolean getMainCerti() {
        return mainCerti;
    }

    public void setMainCerti(Boolean mainCerti) {
        this.mainCerti = mainCerti;
    }

    
    
    
    
}
