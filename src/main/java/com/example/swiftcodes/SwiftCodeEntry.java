package com.example.swiftcodes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SwiftCodeEntry {

    @Id
    private String swiftCode;
    private String bankName;
    private String address;
    private String countryIso2;
    private String countryName;
    private boolean isHeadquarter;

    public SwiftCodeEntry() {
    }

    public SwiftCodeEntry(String swiftCode, String bankName, String address, String countryIso2, String countryName, boolean isHeadquarter) {
        this.swiftCode = swiftCode;
        this.bankName = bankName;
        this.address = address;
        this.countryIso2 = countryIso2;
        this.countryName = countryName;
        this.isHeadquarter = isHeadquarter;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAddress() {
        return address;
    }

    public String getCountryIso2() {
        return countryIso2;
    }

    public String getCountryName() {
        return countryName;
    }

    public boolean isHeadquarter() {
        return isHeadquarter;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountryIso2(String countryIso2) {
        this.countryIso2 = countryIso2;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setHeadquarter(boolean headquarter) {
        isHeadquarter = headquarter;
    }
}
