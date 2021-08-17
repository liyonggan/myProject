// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.admin.dto;

import lombok.Data;

import java.util.List;

/**
 * 更新商品SKU设置Dto
 */
@Data
public class UpdateSkuDto {

    /**
     * 商品ID
     */
    private Integer productId;

    /**
     * SKU列表
     */
    private List<ProductSkuListDto> skuList;

}