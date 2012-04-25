package ys276.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import ys276.core.domain.Object1;

public interface ObjectMapper {
		
	@Select("SELECT * FROM OBJECT1 WHERE id = #{id}")
	Object1 getObject(@Param("id") String id);
	
	@Select("SELECT * FROM OBJECT1")
	List<Object1> getObjects();
	
	void createObject(Object1 object1);

}
