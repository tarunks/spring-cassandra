package com.tarun.myapp.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.tarun.myapp.entity.User;



public interface UserRepository extends CassandraRepository<User> {

	@Query("select * from user")
    Iterable<User> findAll();
}
