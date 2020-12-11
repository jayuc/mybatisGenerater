package top.jayu.oa.mapper;

import top.jayu.oa.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}