package com.bl.addressbookapp.controller;

import com.bl.addressbookapp.dto.AddressBookDto;
import com.bl.addressbookapp.exceptions.RecordNotFound;
import com.bl.addressbookapp.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class UserController {

    @Autowired
    AddressBookService addressBookService;

    @PostMapping("/create")
    public ResponseEntity<AddressBookDto> createUser(@RequestBody AddressBookDto user){
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(addressBookService.CreateContact(user));
        } catch (RecordNotFound e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<AddressBookDto> updateUser(@RequestBody AddressBookDto user){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(addressBookService.UpdateContact(user));
        } catch (RecordNotFound e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<AddressBookDto> deleteUser(@PathVariable("id")Long id){
        try{
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(addressBookService.deleteContact(id));
        } catch (RecordNotFound e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/get")
    public ResponseEntity<List<AddressBookDto>> getAllUser(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(addressBookService.getAllContacts());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
