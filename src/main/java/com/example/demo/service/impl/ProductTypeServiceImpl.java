package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.ProductType;
import com.example.demo.service.ProductTypeService;
import com.example.demo.mapper.ProductTypeMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType>
    implements ProductTypeService{

}




