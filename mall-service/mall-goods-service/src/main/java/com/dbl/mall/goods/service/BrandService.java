package com.dbl.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dbl.mall.goods.model.Brand;

import java.util.List;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/28
 */
public interface BrandService extends IService<Brand> {
    /**
     * 条件查询
     * @param brand
     * @return
     */
    List<Brand> queryList(Brand brand);

    /**
     * 条件分页查询
     * @param brand 查询条件
     * @param currentPage 当前页码
     * @param size 每页数据大小
     * @return
     */
    Page<Brand> queryPageList(Brand brand, Long currentPage, Long size);
}
