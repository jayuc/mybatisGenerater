package top.jayu.oa.mapper;

import top.jayu.oa.entity.Org;

public interface OrgMapper {
    int insert(Org record);

    int insertSelective(Org record);
}