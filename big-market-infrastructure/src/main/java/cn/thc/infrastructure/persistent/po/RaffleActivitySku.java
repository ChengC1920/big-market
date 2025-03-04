package cn.thc.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @author Ninetee Tang
 * @description 抽奖活动sku持久化对象
 * @create 2025/3/4 14:46
 */
@Data
public class RaffleActivitySku {

    /**
     * id
     */
    private Long id;
    /**
     * 商品sku
     */
    private Long sku;
    /**
     * 活动ID
     */
    private Long activityId;
    /**
     * 活动个人参与次数ID
     */
    private Long activityCountId;
    /**
     * 库存总量
     */
    private Integer stockCount;
    /**
     * 剩余库存
     */
    private Integer stockCountSurplus;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}

