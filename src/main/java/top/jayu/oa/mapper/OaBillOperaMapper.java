package top.jayu.oa.mapper;

import top.jayu.oa.entity.OaBillOpera;

public interface OaBillOperaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OaBillOpera record);

    int insertSelective(OaBillOpera record);

    OaBillOpera selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OaBillOpera record);

    int updateByPrimaryKey(OaBillOpera record);
}