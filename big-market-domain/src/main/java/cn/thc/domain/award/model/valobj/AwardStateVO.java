package cn.thc.domain.award.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Ninetee Tang
 * @description 奖品状态枚举值对象 【值对象，用于描述对象属性的值，一个对象中，一个属性，有多个状态值。】
 * @create 2025/3/6 1:44
 */
@Getter
@AllArgsConstructor
public enum AwardStateVO {

    create("create", "创建"),
    complete("complete", "发奖完成"),
    fail("fail", "发奖失败"),
    ;

    private final String code;
    private final String desc;

}

