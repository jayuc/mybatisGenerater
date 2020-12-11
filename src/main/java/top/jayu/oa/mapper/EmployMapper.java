package top.jayu.oa.mapper;

import top.jayu.oa.entity.Employ;

public interface EmployMapper {
    int insert(Employ record);

    int insertSelective(Employ record);
}