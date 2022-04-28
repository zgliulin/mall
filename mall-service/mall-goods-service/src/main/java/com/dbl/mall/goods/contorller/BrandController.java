package com.dbl.mall.goods.contorller;

import com.dbl.mall.goods.model.Brand;
import com.dbl.mall.goods.service.BrandService;
import com.dbl.mall.util.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/28
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 增加方法
     */
    @PostMapping
    public RespResult add(@RequestBody Brand brand) {
        brandService.save(brand);
        return RespResult.ok();
    }

    /**
     * 修改方法
     */
    @PutMapping
    public RespResult update(@RequestBody Brand brand) {
        brandService.updateById(brand);
        return RespResult.ok();
    }

    /**
     * 修改方法
     */
    @DeleteMapping("/{id}")
    public RespResult delete(@PathVariable(value = "id") String id) {
        brandService.removeById(id);
        return RespResult.ok();
    }

    /**
     * 条件查询
     *
     * @return
     */
    @PostMapping("/search")
    public RespResult<List<Brand>> queryList(@RequestBody Brand brand) {
        return RespResult.ok(brandService.queryList(brand));
    }

    /**
     * 条件查询分页
     *
     * @return
     */
    @PostMapping("/search/{page}/{size}")
    public RespResult<Page<Brand>> queryPageList(@RequestBody Brand brand,
                                                 @PathVariable(value = "page") Long page,
                                                 @PathVariable(value = "size") Long size) {
        return RespResult.ok(brandService.queryPageList(brand, page, size));
    }
}
