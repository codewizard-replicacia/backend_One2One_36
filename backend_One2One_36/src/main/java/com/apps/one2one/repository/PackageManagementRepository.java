package com.apps.one2one.repository;


import com.apps.one2one.model.PackageManagement;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PackageManagementRepository extends SimpleJpaRepository<PackageManagement, String> {
    private final EntityManager em;
    public PackageManagementRepository(EntityManager em) {
        super(PackageManagement.class, em);
        this.em = em;
    }
    @Override
    public List<PackageManagement> findAll() {
        return em.createNativeQuery("Select * from \"one2one\".\"PackageManagement\"", PackageManagement.class).getResultList();
    }
}