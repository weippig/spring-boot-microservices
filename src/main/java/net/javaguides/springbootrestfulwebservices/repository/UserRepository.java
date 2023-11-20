package net.javaguides.springbootrestfulwebservices.repository;

import net.javaguides.springbootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// <jpa entity, primary key>
public interface UserRepository extends JpaRepository<User, Long> {

}
