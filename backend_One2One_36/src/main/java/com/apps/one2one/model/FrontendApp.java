package com.apps.one2one.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.one2one.model.BuildTool;
import com.apps.one2one.model.FrontendApp;
import com.apps.one2one.model.Architecture;
import com.apps.one2one.model.Server;
import com.apps.one2one.model.PackageManagement;
import com.apps.one2one.model.FrontendScreen;
import com.apps.one2one.model.Project;
import com.apps.one2one.model.complex.BasicDetails;
import com.apps.one2one.model.complex.AdvancedDetails;
import com.apps.one2one.converter.DurationConverter;
import com.apps.one2one.converter.UUIDToByteConverter;
import com.apps.one2one.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "FrontendApp")
@Table(name = "\"FrontendApp\"", schema =  "\"one2one\"")
@Data
                        
public class FrontendApp {
	public FrontendApp () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"AppId\"", nullable = true )
  private Long appId;
	  
  @Embedded
  @Column(name = "\"ProjectDetails\"")
  @AttributeOverrides({
            	@AttributeOverride(name = "appName", column = @Column(name = "\"ProjectDetails_AppName\"")) ,
            	@AttributeOverride(name = "appDescription", column = @Column(name = "\"ProjectDetails_AppDescription\"")) ,
            	@AttributeOverride(name = "namespace", column = @Column(name = "\"ProjectDetails_Namespace\"")) ,
            	@AttributeOverride(name = "packageManagement", column = @Column(name = "\"ProjectDetails_PackageManagement\"")) ,
            	@AttributeOverride(name = "buildTool", column = @Column(name = "\"ProjectDetails_BuildTool\"")) ,
            	@AttributeOverride(name = "server", column = @Column(name = "\"ProjectDetails_Server\"")) ,
            	@AttributeOverride(name = "architecture", column = @Column(name = "\"ProjectDetails_Architecture\""))  }) 
  private BasicDetails projectDetails;
  
	  
	
@Column(name = "\"MetaTags\"")
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(schema = "\"one2one\"", name = "\"FrontendAppMetaTags\"",joinColumns = @JoinColumn(name = "\"AppId\""))
    private List<String> metaTags = new ArrayList<>();
	  
  @Column(name = "\"Documentation\"", nullable = true )
  private String documentation;
  
	  
	
@Column(name = "\"SelectedScreenIds\"")
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(schema = "\"one2one\"", name = "\"FrontendAppSelectedScreenIds\"",joinColumns = @JoinColumn(name = "\"AppId\""))
    private List<Integer> selectedScreenIds = new ArrayList<>();
	  
  @Column(name = "\"Company_name\"", nullable = true )
  private String company_name;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"FrontendAppSelectedScreens\"",
            joinColumns = @JoinColumn( name="\"AppId\""),
            inverseJoinColumns = @JoinColumn( name="\"FeScreenId\""), schema = "\"one2one\"")
private List<FrontendScreen> selectedScreens = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "FrontendApp [" 
  + "AppId= " + appId  + ", " 
  + "ProjectDetails= " + projectDetails  + ", " 
  + "MetaTags= " + metaTags  + ", " 
  + "Documentation= " + documentation  + ", " 
  + "SelectedScreenIds= " + selectedScreenIds  + ", " 
  + "Company_name= " + company_name 
 + "]";
	}
	
}