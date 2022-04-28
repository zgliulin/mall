package com.dbl.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbl.mall.goods.mapper.BrandMapper;
import com.dbl.mall.goods.model.Brand;
import com.dbl.mall.goods.service.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 品牌
 *
 * @author LiuLin
 * @date Created on 2022/4/28
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {
    @Override
    public List<Brand> queryList(Brand brand) {
        QueryWrapper<Brand> query = new QueryWrapper<>();
        query.like(StringUtils.isNotBlank(brand.getName()), "name", brand.getName())
                .eq(StringUtils.isNotBlank(brand.getInitial()), "initial", brand.getInitial());
        return baseMapper.selectList(query);
    }

    @Override
    public Page<Brand> queryPageList(Brand brand, Long currentPage, Long size) {
        QueryWrapper<Brand> query = new QueryWrapper<>();
        query.like(StringUtils.isNotBlank(brand.getName()), "name", brand.getName())
                .eq(StringUtils.isNotBlank(brand.getInitial()), "initial", brand.getInitial());
        return baseMapper.selectPage(new Page<Brand>(currentPage, size), query);
    }
}
