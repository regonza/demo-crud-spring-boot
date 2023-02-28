package com.example.democrud.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Action {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long action_id;
	
	@Column
	@NotBlank
	private String action;

	public Long getAction_id() {
		return action_id;
	}

	public void setAction_id(Long action_id) {
		this.action_id = action_id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
