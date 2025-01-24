package cn.thc.infrastructure.persistent.dao;

import cn.thc.infrastructure.persistent.po.RuleTreeNodeLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Ninetee Tang
 * @description 规则树节点连线表DAO
 * @create 2025/1/23 2:38
 */
@Mapper
public interface IRuleTreeNodeLineDao {

    List<RuleTreeNodeLine> queryRuleTreeNodeLineListByTreeId(String treeId);

}

