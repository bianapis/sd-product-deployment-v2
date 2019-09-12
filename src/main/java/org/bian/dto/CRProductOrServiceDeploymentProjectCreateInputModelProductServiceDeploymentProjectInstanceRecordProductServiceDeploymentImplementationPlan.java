package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecordProductServiceDeploymentImplementationPlanDateType;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecordProductServiceDeploymentImplementationPlan
 */
public class CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecordProductServiceDeploymentImplementationPlan   {
  private String productServiceDeploymentBudget = null;

  private String productServiceDeploymentOrganization = null;

  private String productServiceDeploymentSchedule = null;

  private CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecordProductServiceDeploymentImplementationPlanDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial considerations for the deployment (includes planning and execution) 
   * @return productServiceDeploymentBudget
  **/

  public String getProductServiceDeploymentBudget() {
    return productServiceDeploymentBudget;
  }

  public void setProductServiceDeploymentBudget(String productServiceDeploymentBudget) {
    this.productServiceDeploymentBudget = productServiceDeploymentBudget;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The organizational aspects of the deployment effort (includes planning and execution) 
   * @return productServiceDeploymentOrganization
  **/

  public String getProductServiceDeploymentOrganization() {
    return productServiceDeploymentOrganization;
  }

  public void setProductServiceDeploymentOrganization(String productServiceDeploymentOrganization) {
    this.productServiceDeploymentOrganization = productServiceDeploymentOrganization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The deployment schedule of events, planned and actual (includes planning and execution tasks) 
   * @return productServiceDeploymentSchedule
  **/

  public String getProductServiceDeploymentSchedule() {
    return productServiceDeploymentSchedule;
  }

  public void setProductServiceDeploymentSchedule(String productServiceDeploymentSchedule) {
    this.productServiceDeploymentSchedule = productServiceDeploymentSchedule;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecordProductServiceDeploymentImplementationPlanDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecordProductServiceDeploymentImplementationPlanDateType dateType) {
    this.dateType = dateType;
  }


}

