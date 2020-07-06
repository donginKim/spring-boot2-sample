package com.amiro.demo.view.repositories;

import com.amiro.demo.view.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by DinKim on 20. 07. 05
 */
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();

    Optional<User> findById(Long id);

}
