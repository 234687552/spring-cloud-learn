package com.lzd.surface.product;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lzd--liangzili@maxrocky.com
 * @date 16:36  2017/11/3 0003
 * @desc
 */
@FeignClient("provider-server")
@RequestMapping(value = "/product")
public interface ProductSurface {

    /**
     * get all
     * @return
     */
    @GetMapping(value = "/")
    String getAll();
}
