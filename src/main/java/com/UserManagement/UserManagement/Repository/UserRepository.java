package com.UserManagement.UserManagement.Repository;

import com.UserManagement.UserManagement.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}

