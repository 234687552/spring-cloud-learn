package com.lzd.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author lzd--liangzili@maxrocky.com
 * @date 16:09  2017/11/3 0003
 * @desc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String  id;
    private String  name;
    private Double  price;
    private String  desc;
    private LocalDateTime createTime;
}
