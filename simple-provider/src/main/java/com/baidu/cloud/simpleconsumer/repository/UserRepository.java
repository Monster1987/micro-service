package com.baidu.cloud.simpleconsumer.repository;

import com.baidu.cloud.simpleconsumer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
