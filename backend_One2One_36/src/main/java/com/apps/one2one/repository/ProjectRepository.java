package com.apps.one2one.repository;


import com.apps.one2one.model.Project;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ProjectRepository extends SimpleJpaRepository<Project, String> {
    private final EntityManager em;
    public ProjectRepository(EntityManager em) {
        super(Project.class, em);
        this.em = em;
    }
    @Override
    public List<Project> findAll() {
        return em.createNativeQuery("Select * from \"one2one\".\"Project\"", Project.class).getResultList();
    }
}