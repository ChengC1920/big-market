package cn.thc.infrastructure.persistent.dao;

import cn.thc.infrastructure.persistent.po.RuleTree;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Ninetee Tang
 * @description 规则树表DAO
 * @create 2025/1/23 2:36
 */
@Mapper
public interface IRuleTreeDao {

    RuleTree queryRuleTreeByTreeId(String treeId);

}

