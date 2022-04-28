package com.dbl.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/28
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.dbl.mall.goods.mapper"})
@ConfigurationPropertiesScan
public class MallGoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallGoodsApplication.class, args);
    }
}
