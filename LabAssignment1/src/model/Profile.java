/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author ronak
 */
public class Profile {
    
    private String name;
    private String Dob;
    private String geodata;
    private Long teleNum;
    private Long fax;
    private String email;
    private Long ssn;
    private Long medRecordNum;
    private Long healtBenfNum;
    private Long bankAccount;
    private String licensePlate;
    private Long deviceIdentifier;
    private String linkedin;
    private String ipAddress;
    private String CertificateNum;
    private ImageIcon image;

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String getCertificateNum() {
        return CertificateNum;
    }

    public void setCertificateNum(String CertificateNum) {
        this.CertificateNum = CertificateNum;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getGeodata() {
        return geodata;
    }

    public void setGeodata(String geodata) {
        this.geodata = geodata;
    }

    public Long getTeleNum() {
        return teleNum;
    }

    public void setTeleNum(Long teleNum) {
        this.teleNum = teleNum;
    }

    public Long getFax() {
        return fax;
    }

    public void setFax(Long fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public Long getMedRecordNum() {
        return medRecordNum;
    }

    public void setMedRecordNum(Long medRecordNum) {
        this.medRecordNum = medRecordNum;
    }

    public Long getHealtBenfNum() {
        return healtBenfNum;
    }

    public void setHealtBenfNum(Long healtBenfNum) {
        this.healtBenfNum = healtBenfNum;
    }

    public Long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Long getDeviceIdentifier() {
        return deviceIdentifier;
    }

    public void setDeviceIdentifier(Long deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    
    
    
}
