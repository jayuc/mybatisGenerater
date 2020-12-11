package com.mapper;

import com.model.Facility;

public interface FacilityMapper {
    int deleteByPrimaryKey(String facilityId);

    int insert(Facility record);

    int insertSelective(Facility record);

    Facility selectByPrimaryKey(String facilityId);

    int updateByPrimaryKeySelective(Facility record);

    int updateByPrimaryKeyWithBLOBs(Facility record);

    int updateByPrimaryKey(Facility record);
}