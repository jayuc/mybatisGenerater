package top.jayu.mapper;

import top.jayu.entry.CodeType;

public interface CodeTypeMapper {
    int insert(CodeType record);

    int insertSelective(CodeType record);
}