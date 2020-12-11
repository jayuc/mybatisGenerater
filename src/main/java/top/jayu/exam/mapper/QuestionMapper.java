package top.jayu.exam.mapper;

import top.jayu.exam.entry.QuestionWithBLOBs;

public interface QuestionMapper {
    int insert(QuestionWithBLOBs record);

    int insertSelective(QuestionWithBLOBs record);
}