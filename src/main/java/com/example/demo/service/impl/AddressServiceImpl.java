package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.Address;
import com.example.demo.service.AddressService;
import com.example.demo.mapper.AddressMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address>
    implements AddressService{

}




