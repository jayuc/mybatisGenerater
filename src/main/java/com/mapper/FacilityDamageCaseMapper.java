package com.mapper;

import com.model.FacilityDamageCase;
import com.model.FacilityDamageCaseWithBLOBs;

public interface FacilityDamageCaseMapper {
    int deleteByPrimaryKey(String caseId);

    int insert(FacilityDamageCaseWithBLOBs record);

    int insertSelective(FacilityDamageCaseWithBLOBs record);

    FacilityDamageCaseWithBLOBs selectByPrimaryKey(String caseId);

    int updateByPrimaryKeySelective(FacilityDamageCaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FacilityDamageCaseWithBLOBs record);

    int updateByPrimaryKey(FacilityDamageCase record);
}