package com.bl.addressbookapp.dto;

import com.bl.addressbookapp.domain.AddressBook;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AddressBookDto {

    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public AddressBookDto() {
    }

    public AddressBookDto(AddressBook addressBook) {
        this.id = addressBook.getId();
        this.name = addressBook.getName();
        this.address = addressBook.getAddress();
        this.city = addressBook.getCity();
        this.state = addressBook.getState();
        this.zip = addressBook.getZip();
        this.phone = addressBook.getPhone();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
