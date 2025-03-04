package cn.thc.infrastructure.persistent.dao;

import cn.thc.infrastructure.persistent.po.RaffleActivitySku;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Ninetee Tang
 * @description 商品sku dao
 * @create 2024/11/28 14:46
 */
@Mapper
public interface IRaffleActivitySkuDao {

    RaffleActivitySku queryActivitySku(Long sku);

    void updateActivitySkuStock(Long sku);

    void clearActivitySkuStock(Long sku);

}

