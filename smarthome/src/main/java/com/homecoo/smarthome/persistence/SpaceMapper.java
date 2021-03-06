package com.homecoo.smarthome.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.homecoo.smarthome.domain.Space;

public interface SpaceMapper {
    
    int updateSapce(Space space);

    int addSpace(Space record);
    
    List<Space> getAllSpaceByPhoneNum(@Param("phoneNum")String phoneNum);

    Space getSpaceBySpaceNoPhoneNum(@Param("phoneNum")String phoneNum, @Param("spaceNo")String spaceNo);

	void deleteSpace(Space space);
	
	void deleteSpaceByPhonenum(@Param("phoneNum")String phoneNum);


}