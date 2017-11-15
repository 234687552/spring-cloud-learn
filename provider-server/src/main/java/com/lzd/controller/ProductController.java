package com.lzd.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzd--liangzili@maxrocky.com
 * @date 16:03  2017/11/3 0003
 * @desc
 */
@RestController
@RequestMapping(value = "/product")
@Api(value = "商品模块")
public class ProductController {

    @ApiOperation(value = "获取所有商品",notes = "hello")
    @GetMapping(value = "/")
    public String getAll() {
        return "all";
    }
}
