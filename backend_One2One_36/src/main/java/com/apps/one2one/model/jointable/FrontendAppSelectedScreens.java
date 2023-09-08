package com.apps.one2one.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.one2one.model.BuildTool;
import com.apps.one2one.model.FrontendApp;
import com.apps.one2one.model.Architecture;
import com.apps.one2one.model.Server;
import com.apps.one2one.model.PackageManagement;
import com.apps.one2one.model.FrontendScreen;
import com.apps.one2one.model.Project;
import com.apps.one2one.model.complex.BasicDetails;
import com.apps.one2one.model.complex.AdvancedDetails;

@Entity(name = "FrontendAppSelectedScreens")
@Table(schema = "\"one2one\"", name = "\"FrontendAppSelectedScreens\"")
@Data
public class FrontendAppSelectedScreens{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"AppId\"")
	private Long appId;

    
    @Column(name = "\"FeScreenId\"")
    private Integer feScreenId;
 
}