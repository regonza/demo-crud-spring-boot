package com.example.democrud.dao.api;

import com.example.democrud.model.Content;
import org.springframework.data.repository.CrudRepository;

public interface ContentDaoAPI extends CrudRepository<Content, Long> {

}
