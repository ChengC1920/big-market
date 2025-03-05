package cn.thc.domain.task.model.entity;

import lombok.Data;

/**
 * @author Ninetee Tang
 * @description 任务实体对象
 * @create 2025/3/6 2:08
 */
@Data
public class TaskEntity {

    /** 活动ID */
    private String userId;
    /** 消息主题 */
    private String topic;
    /** 消息编号 */
    private String messageId;
    /** 消息主体 */
    private String message;

}

