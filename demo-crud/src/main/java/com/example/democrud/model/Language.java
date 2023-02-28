package com.example.democrud.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long language_id;

	@Column
	@NotBlank
	private String language;

	@Column
	@NotBlank
	private String lang_abrev;

	public Long getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(Long language_id) {
		this.language_id = language_id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLang_abrev() {
		return lang_abrev;
	}

	public void setLang_abrev(String lang_abrev) {
		this.lang_abrev = lang_abrev;
	}
}
