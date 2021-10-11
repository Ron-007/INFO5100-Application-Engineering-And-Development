/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import ui.MainJFrame;

/**
 *
 * @author ronak
 */
public class Config {
    
    public Config() {

    }

public void uploadData() {
        Car carObj = new Car();
        carObj.setId(MainJFrame.carObjList.size() + 1);
        carObj.setCarSerialNo("1234");
        carObj.setManufactureBy("BMW");
        carObj.setManufactureYear("2001");
        carObj.setModelNo("X6");
        carObj.setLocation("Cambridge");
        carObj.setNoOfSeats(4);
        carObj.setCarAvail(Boolean.TRUE);
        carObj.setMainCerti(Boolean.TRUE);
        MainJFrame.carObjList.add(carObj);
        
        carObj = new Car();
        carObj.setId(MainJFrame.carObjList.size() + 1);
        carObj.setCarSerialNo("2346");
        carObj.setManufactureBy("Hyundai");
        carObj.setManufactureYear("2020");
        carObj.setModelNo("Zeta");
        carObj.setLocation("Quincy");
        carObj.setNoOfSeats(5);
        carObj.setCarAvail(Boolean.FALSE);
        carObj.setMainCerti(Boolean.TRUE);
        MainJFrame.carObjList.add(carObj);
        
        carObj = new Car();
        carObj.setId(MainJFrame.carObjList.size() + 1);
        carObj.setCarSerialNo("6785");
        carObj.setManufactureBy("BMW");
        carObj.setManufactureYear("2009");
        carObj.setModelNo("X1");
        carObj.setLocation("Waltham");
        carObj.setNoOfSeats(6);
        carObj.setCarAvail(Boolean.TRUE);
        carObj.setMainCerti(Boolean.FALSE);
        MainJFrame.carObjList.add(carObj);
        
        carObj = new Car();
        carObj.setId(MainJFrame.carObjList.size() + 1);
        carObj.setCarSerialNo("7645");
        carObj.setManufactureBy("Audi");
        carObj.setManufactureYear("2014");
        carObj.setModelNo("A6");
        carObj.setLocation("Plymouth");
        carObj.setNoOfSeats(7);
        carObj.setCarAvail(Boolean.TRUE);
        carObj.setMainCerti(Boolean.TRUE);
        MainJFrame.carObjList.add(carObj);
        
        carObj = new Car();
        carObj.setId(MainJFrame.carObjList.size() + 1);
        carObj.setCarSerialNo("8743");
        carObj.setManufactureBy("Toyota");
        carObj.setManufactureYear("2021");
        carObj.setModelNo("Octa");
        carObj.setLocation("Cambridge");
        carObj.setNoOfSeats(9);
        carObj.setCarAvail(Boolean.TRUE);
        carObj.setMainCerti(Boolean.TRUE);
        MainJFrame.carObjList.add(carObj);
        
        carObj = new Car();
        carObj.setId(MainJFrame.carObjList.size() + 1);
        carObj.setCarSerialNo("5634");
        carObj.setManufactureBy("Toyota");
        carObj.setManufactureYear("1999");
        carObj.setModelNo("Camry");
        carObj.setLocation("Quincy");
        carObj.setNoOfSeats(6);
        carObj.setCarAvail(Boolean.FALSE);
        carObj.setMainCerti(Boolean.FALSE);
        MainJFrame.carObjList.add(carObj);
        
        carObj = new Car();
        carObj.setId(MainJFrame.carObjList.size() + 1);
        carObj.setCarSerialNo("4872");
        carObj.setManufactureBy("Audi");
        carObj.setManufactureYear("2000");
        carObj.setModelNo("A1");
        carObj.setLocation("Waltham");
        carObj.setNoOfSeats(8);
        carObj.setCarAvail(Boolean.FALSE);
        carObj.setMainCerti(Boolean.TRUE);
        MainJFrame.carObjList.add(carObj);
        
        carObj = new Car();
        carObj.setId(MainJFrame.carObjList.size() + 1);
        carObj.setCarSerialNo("3854");
        carObj.setManufactureBy("Hyundai");
        carObj.setManufactureYear("2002");
        carObj.setModelNo("Verna");
        carObj.setLocation("Plymouth");
        carObj.setNoOfSeats(6);
        carObj.setCarAvail(Boolean.TRUE);
        carObj.setMainCerti(Boolean.TRUE);
        MainJFrame.carObjList.add(carObj);
        
        carObj = new Car();
        carObj.setId(MainJFrame.carObjList.size() + 1);
        carObj.setCarSerialNo("4875");
        carObj.setManufactureBy("Toyota");
        carObj.setManufactureYear("2006");
        carObj.setModelNo("V7");
        carObj.setLocation("Cambridge");
        carObj.setNoOfSeats(7);
        carObj.setCarAvail(Boolean.FALSE);
        carObj.setMainCerti(Boolean.FALSE);
        MainJFrame.carObjList.add(carObj);
        
        carObj = new Car();
        carObj.setId(MainJFrame.carObjList.size() + 1);
        carObj.setCarSerialNo("3478");
        carObj.setManufactureBy("AUDI");
        carObj.setManufactureYear("2006");
        carObj.setModelNo("A4");
        carObj.setLocation("Quincy");
        carObj.setNoOfSeats(8);
        carObj.setCarAvail(Boolean.TRUE);
        carObj.setMainCerti(Boolean.TRUE);
        MainJFrame.carObjList.add(carObj);
    }

}
