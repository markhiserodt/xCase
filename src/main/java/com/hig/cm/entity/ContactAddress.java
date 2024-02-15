package com.hig.cm.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ContactAddress {

    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String id;
    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String caseId;
    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String caseContactId;
    @NotNull
    @Size(max=40)
    private String addressLine1;
    @Size(max=40)
    private String addressLine2;
    @NotEmpty
    @Size(max=30)
    private String city;
    @NotEmpty
    @Size(min=2, max=2)
    @Pattern(regexp = "^[A-Z]{2}$")
    private String stateCode;
    @NotEmpty
    @Size(min=10, max=10)
    @Pattern(regexp = "^[0-9]{2}$")
    private String zipCode;

    @NotEmpty
    @Size(min=2, max=2)
    @Pattern(regexp = "^[A-Z]{2}$")
    private String countryCode;

    @Size(max=60)
    private String companyName;
    public ContactAddress() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseContactId() {
        return caseContactId;
    }

    public void setCaseContactId(String caseContactId) {
        this.caseContactId = caseContactId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
