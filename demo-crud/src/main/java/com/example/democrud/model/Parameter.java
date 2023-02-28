package com.example.democrud.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Parameter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long parameter_id;
	
	@Column
	@NotBlank
	private String parameter;

	public Long getParameter_id() {
		return parameter_id;
	}

	public void setParameter_id(Long parameter_id) {
		this.parameter_id = parameter_id;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
}
