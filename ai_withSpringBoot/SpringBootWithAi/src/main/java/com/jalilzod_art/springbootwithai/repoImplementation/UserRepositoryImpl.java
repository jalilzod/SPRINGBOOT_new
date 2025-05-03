package com.jalilzod_art.springbootwithai.repoImplementation;

import com.jalilzod_art.springbootwithai.entites.UserEntity;
import com.jalilzod_art.springbootwithai.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<UserEntity> findALl() {
        return entityManager.createQuery("select u from UserEntity u", UserEntity.class).getResultList();
    }

    @Override
    public void save(UserEntity user) {
        if(user.getId() == null){
            entityManager.persist(user);
        }else
        {
            entityManager.merge(user);
        }
    }

    @Override
    public void deleteById(Long id) {
        UserEntity user = findById(id);
        if(user!=null){
            entityManager.remove(user);
        }
    }

    @Override
    public UserEntity findById(Long id) {
        return entityManager.find(UserEntity.class, id);
    }

    @Override
    public void update(UserEntity user,Long id) {
        UserEntity current = findById(id);
        if(user!=null){
            current.setName(user.getName());
            current.setEmail(user.getEmail());
            entityManager.merge(current);
        }
    }
}
