package cn.thc.trigger.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ninetee Tang
 * @description 抽奖应答结果
 * @create 2025/2/6 22:49
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaffleResponseDTO {

    // 奖品ID
    private Integer awardId;
    // 排序编号【策略奖品配置的奖品顺序编号】
    private Integer awardIndex;

}

