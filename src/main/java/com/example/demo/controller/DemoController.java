package com.example.demo.controller;

import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class DemoController {

    @Autowired
    private AddressService addressService;

    @GetMapping("")
    public ResponseEntity getAll() {
        return new ResponseEntity(addressService.getAll(), HttpStatus.OK);
    }
}
