package com.hcl.mapi.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.hcl.mapi.entity.User;

public interface UserRepository extends CassandraRepository<User> {

	@Query("select * from user")
    Iterable<User> findAll();
}
