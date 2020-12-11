package cy.its.dispath.mybatis.client.Rescue;

import cy.its.dispath.domain.model.rescue.DispatchRescueResource;

public interface DispatchRescueResourceMapper {
    int deleteByPrimaryKey(String resourceId);

    int insert(DispatchRescueResource record);

    int insertSelective(DispatchRescueResource record);

    DispatchRescueResource selectByPrimaryKey(String resourceId);

    int updateByPrimaryKeySelective(DispatchRescueResource record);

    int updateByPrimaryKey(DispatchRescueResource record);
}