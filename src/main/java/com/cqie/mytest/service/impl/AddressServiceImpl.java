package com.cqie.mytest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqie.mytest.bean.Address;
import com.cqie.mytest.service.AddressService;
import com.cqie.mytest.mapper.AddressMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address>
    implements AddressService{

}




