package top.jayu.oa.mapper;

import top.jayu.oa.entity.OaBill;

public interface OaBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OaBill record);

    int insertSelective(OaBill record);

    OaBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OaBill record);

    int updateByPrimaryKey(OaBill record);
}