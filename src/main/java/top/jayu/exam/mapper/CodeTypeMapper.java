package top.jayu.exam.mapper;

import top.jayu.exam.entry.CodeType;

public interface CodeTypeMapper {
    int insert(CodeType record);

    int insertSelective(CodeType record);
}