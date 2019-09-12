package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecordProductServiceDeploymentImplementationPlan;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord
 */
public class CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord   {
  private String productServiceDeploymentProjectName = null;

  private String productServiceDeploymentProjectType = null;

  private String productServiceDeploymentProjectDescription = null;

  private CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecordProductServiceDeploymentImplementationPlan productServiceDeploymentImplementationPlan = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The reference to and descriptive name of the deployment project 
   * @return productServiceDeploymentProjectName
  **/

  public String getProductServiceDeploymentProjectName() {
    return productServiceDeploymentProjectName;
  }

  public void setProductServiceDeploymentProjectName(String productServiceDeploymentProjectName) {
    this.productServiceDeploymentProjectName = productServiceDeploymentProjectName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of deployment project (e.g. service update, new product release) 
   * @return productServiceDeploymentProjectType
  **/

  public String getProductServiceDeploymentProjectType() {
    return productServiceDeploymentProjectType;
  }

  public void setProductServiceDeploymentProjectType(String productServiceDeploymentProjectType) {
    this.productServiceDeploymentProjectType = productServiceDeploymentProjectType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the scope, goal and make-up of the product deployment project 
   * @return productServiceDeploymentProjectDescription
  **/

  public String getProductServiceDeploymentProjectDescription() {
    return productServiceDeploymentProjectDescription;
  }

  public void setProductServiceDeploymentProjectDescription(String productServiceDeploymentProjectDescription) {
    this.productServiceDeploymentProjectDescription = productServiceDeploymentProjectDescription;
  }


  /**
   * Get productServiceDeploymentImplementationPlan
   * @return productServiceDeploymentImplementationPlan
  **/

  public CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecordProductServiceDeploymentImplementationPlan getProductServiceDeploymentImplementationPlan() {
    return productServiceDeploymentImplementationPlan;
  }

  public void setProductServiceDeploymentImplementationPlan(CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecordProductServiceDeploymentImplementationPlan productServiceDeploymentImplementationPlan) {
    this.productServiceDeploymentImplementationPlan = productServiceDeploymentImplementationPlan;
  }


}

