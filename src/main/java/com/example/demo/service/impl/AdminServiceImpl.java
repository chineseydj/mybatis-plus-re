package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.Admin;
import com.example.demo.service.AdminService;
import com.example.demo.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




