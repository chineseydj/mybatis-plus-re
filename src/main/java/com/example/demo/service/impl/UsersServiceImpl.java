package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.Users;
import com.example.demo.service.UsersService;
import com.example.demo.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




