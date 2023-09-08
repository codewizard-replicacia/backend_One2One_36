package com.apps.one2one.function;

import com.apps.one2one.model.BuildTool;
import com.apps.one2one.model.FrontendApp;
import com.apps.one2one.model.Architecture;
import com.apps.one2one.model.Server;
import com.apps.one2one.model.PackageManagement;
import com.apps.one2one.model.FrontendScreen;
import com.apps.one2one.model.Project;




import com.apps.one2one.model.complex.BasicDetails;
import com.apps.one2one.model.complex.AdvancedDetails;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  