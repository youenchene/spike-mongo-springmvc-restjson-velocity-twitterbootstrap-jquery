package ys276.core.domain;

import java.io.Serializable;
import java.util.Date;



public class Object1 implements Serializable {
	
	private static final long serialVersionUID = -303279955964765983L;
	
	private String id;
	private String field1;
	private Integer field2;
	private Date field3;
		
	public Object1() {
		super();
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public Integer getField2() {
		return field2;
	}
	public void setField2(Integer field2) {
		this.field2 = field2;
	}
	public Date getField3() {
		return field3;
	}
	public void setField3(Date field3) {
		this.field3 = field3;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Object1 [id = "+ id +", field1=" + field1 + ", field2=" + field2 + ", field3="
				+ field3 + "]";
	}


}
