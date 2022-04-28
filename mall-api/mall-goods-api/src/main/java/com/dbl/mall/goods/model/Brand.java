package com.dbl.mall.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 品牌信息
 *
 * @author LiuLin
 * @date Created on 2022/4/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "brand")
public class Brand {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 品牌名字
     */
    private String name;
    /**
     * 品牌图片
     */
    private String image;
    /**
     * 品牌首字母
     */
    private String initial;
    /**
     * 排序
     */
    private Integer sort;
}
