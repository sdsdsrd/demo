package com.example.demo.service;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAll() {
        List<Address> addresses = addressRepository.findAll();
        return addresses;
    }
}
