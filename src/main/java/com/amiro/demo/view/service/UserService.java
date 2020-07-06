package com.amiro.demo.view.service;

import com.amiro.demo.view.domain.User;
import com.amiro.demo.view.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by DinKim on 20. 07. 05
 */
@Service
@Transactional
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<User> listAllUsers(){
        logger.debug(new Date() + "call listAllUsers method");
        return userRepository.findAll();
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    public void save(User user){
        userRepository.save(user);
    }

    public void updateById(Long id, User user){
        Optional<User> U = userRepository.findById(id);

        if(U.isPresent()){
            User e = U.get();
            e.setProceeding(user.isProceeding());
            userRepository.save(e);
        }
    }

}
