package com.apps.one2one.repository;


import com.apps.one2one.model.FrontendScreen;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class FrontendScreenRepository extends SimpleJpaRepository<FrontendScreen, String> {
    private final EntityManager em;
    public FrontendScreenRepository(EntityManager em) {
        super(FrontendScreen.class, em);
        this.em = em;
    }
    @Override
    public List<FrontendScreen> findAll() {
        return em.createNativeQuery("Select * from \"one2one\".\"FrontendScreen\"", FrontendScreen.class).getResultList();
    }
}