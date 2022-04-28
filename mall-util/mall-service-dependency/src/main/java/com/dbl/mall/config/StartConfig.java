package com.dbl.mall.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/28
 */
@Configuration
public class StartConfig {

    /**
     * MyBatisPlus分页
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置数据库类型
        paginationInterceptor.setDbType(DbType.MYSQL);
        return paginationInterceptor;
    }
}
