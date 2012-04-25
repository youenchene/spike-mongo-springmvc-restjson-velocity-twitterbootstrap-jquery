package ys276.core.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ys276.core.domain.Object1;
import ys276.core.domain.Object2;
import ys276.core.service.ObjectService;
import ys276.core.service.ObjectServiceMongo;

@Controller
@RequestMapping("/api/")
public class ObjectWebService {
	
	@Autowired
	private ObjectService objectService;
	
	@Autowired
	private ObjectServiceMongo objectServiceMongo;
	
	

	@RequestMapping(method=RequestMethod.PUT, value={"/object1","/object1/"},  headers="Accept=application/json",produces = "application/json")
	@Transactional
	public @ResponseBody() Object1 createObject1(@RequestBody Object1 object1) throws Exception
	{
		return objectService.createObject(object1);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/object1/{id}",  headers="Accept=application/json")	
	public @ResponseBody Object1 getObject1(@PathVariable String id) throws Exception
	{
		return objectService.getObject(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value={"/object1","/object1/"},  headers="Accept=application/json",produces = "application/json")
	public @ResponseBody List<Object1> getObject1() throws Exception
	{
		return objectService.getObjects();
	}	
	
	
	@RequestMapping(method=RequestMethod.PUT, value={"/object2","/object2/"},  headers="Accept=application/json",produces = "application/json")
	@Transactional
	public @ResponseBody() Object2 createObject2(@RequestBody Object2 object2) throws Exception
	{
		return objectServiceMongo.createObject(object2);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/object2/{id}",  headers="Accept=application/json",produces = "application/json")	
	public @ResponseBody Object2 getObject2(@PathVariable String id) throws Exception
	{
		return objectServiceMongo.getObject(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value={"/object2","/object2/"},  headers="Accept=application/json",produces = "application/json")
	public @ResponseBody List<Object2> getObject2() throws Exception
	{
		return objectServiceMongo.getObjects();
	}	
	
	
}
