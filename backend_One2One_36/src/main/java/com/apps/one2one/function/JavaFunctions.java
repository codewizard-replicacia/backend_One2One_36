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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.one2one.repository.PackageManagementRepository;
import com.apps.one2one.repository.ProjectRepository;
import com.apps.one2one.repository.ArchitectureRepository;
import com.apps.one2one.repository.ServerRepository;
import com.apps.one2one.repository.FrontendScreenRepository;
import com.apps.one2one.repository.BuildToolRepository;
import com.apps.one2one.repository.FrontendAppRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
