package cn.thc.infrastructure.persistent.dao;

import cn.thc.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Ninetee Tang
 * @description
 * @create 2024/11/28 14:47
 */
@Mapper
public interface IStrategyDao {

    List<Strategy> queryStrategyList();

}
