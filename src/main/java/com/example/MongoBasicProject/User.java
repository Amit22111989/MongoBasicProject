package com.example.MongoBasicProject;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

	private ObjectId _id;
	private Integer isactive;
	@NotNull(message = "Name is compulsory")
	private String name;

	@NotNull(message = "Age is mandatory and numeric value")
	private Integer age;
	private String password;

	public String get_id() {
		if (_id != null) {
			return _id.toString();
		} else {
			return null;
		}
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Integer getIsactive() {
		return isactive;
	}

	public void setIsactive(Integer isactive) {
		this.isactive = isactive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
