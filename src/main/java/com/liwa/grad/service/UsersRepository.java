package com.liwa.grad.service;

import com.liwa.grad.model.Users;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UsersRepository extends ElasticsearchRepository<Users, String> {

}
