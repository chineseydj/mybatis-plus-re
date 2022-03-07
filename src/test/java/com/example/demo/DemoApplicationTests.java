package com.example.demo;

import com.example.demo.bean.Address;
import com.example.demo.bean.Admin;
import com.example.demo.mapper.AddressMapper;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
@Autowired
    AdminService adminService;
@Autowired
    AdminMapper adminMapper;
@Autowired
    AddressMapper addressMapper;
    @Test
    void contextLoads() {
//        List<Admin> list = adminService.list();
//        Admin admin = adminMapper.selectById(1);
        Address address = addressMapper.selectById(1L);
        System.out.println(address);
        System.out.println("hello");
    }

}
