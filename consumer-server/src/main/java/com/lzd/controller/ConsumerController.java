package com.lzd.controller;

import com.lzd.surface.product.ProductSurface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lzd--liangzili@maxrocky.com
 * @date 16:40  2017/11/3 0003
 * @desc
 */
@RestController
@RequestMapping(value = "/consumer")
@Slf4j
public class ConsumerController {

    @Resource
    ProductSurface productSurface;

    /**
     * get all
     * @return
     */
    @GetMapping(value = "/")
    public String getAll() {
        log.info("hello");
        return  productSurface.getAll();
    }
}
