package ys276.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ys276.core.dao.ObjectMongo;
import ys276.core.domain.Object2;

@Service
public class ObjectServiceMongo {

	  @Autowired
	  private ObjectMongo objectMapper;
	 
	  public Object2 getObject(String id) throws Exception
	  {
		  return objectMapper.findOne(id);
	  }
	  
	  public List<Object2> getObjects() throws Exception
	  {
		  return objectMapper.findAll();
	  }
	  
	  @Transactional
	  public Object2 createObject(Object2 object2) throws Exception
	  {
		 return objectMapper.save(object2);
	  }
	  
	  
	
}
