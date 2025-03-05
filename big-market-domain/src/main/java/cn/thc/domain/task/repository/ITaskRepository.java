package cn.thc.domain.task.repository;


import cn.thc.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * @author Ninetee Tang
 * @description 任务服务仓储接口
 * @create 2025/3/6 2:08
 */
public interface ITaskRepository {

    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}

