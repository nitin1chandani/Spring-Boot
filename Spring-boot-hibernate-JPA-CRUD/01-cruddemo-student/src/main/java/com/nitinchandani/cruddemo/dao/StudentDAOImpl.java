package com.nitinchandani.cruddemo.dao;

import com.nitinchandani.cruddemo.entity.Student;
import jakarta.persistence.EntityManager; // Correct import for EntityManager
import jakarta.persistence.PersistenceContext; // Correct import for PersistenceContext
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
