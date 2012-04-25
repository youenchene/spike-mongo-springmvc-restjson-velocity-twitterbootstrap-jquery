package ys276.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ys276.core.dao.ObjectMapper;
import ys276.core.domain.Object1;

@Service
public class ObjectService {

	  @Autowired
	  private ObjectMapper objectMapper;
	  
	  public Object1 getObject(String id) throws Exception
	  {
		  return objectMapper.getObject(id);
	  }
	  
	  public List<Object1> getObjects() throws Exception
	  {
		  return objectMapper.getObjects();
	  }
	  
	  @Transactional
	  public Object1 createObject(Object1 object1) throws Exception
	  {
		 objectMapper.createObject(object1);
		 return object1;
	  }
	  
	  
	
}
