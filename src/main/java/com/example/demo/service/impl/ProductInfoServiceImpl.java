package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.ProductInfo;
import com.example.demo.service.ProductInfoService;
import com.example.demo.mapper.ProductInfoMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoMapper, ProductInfo>
    implements ProductInfoService{

}




