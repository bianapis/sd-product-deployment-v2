package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectCreateOutputModel
 */
public class CRProductOrServiceDeploymentProjectCreateOutputModel   {
  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String productOrServiceDeploymentProjectCreateActionReference = null;

  private Object productOrServiceDeploymentProjectCreateActionRecord = null;

  private String productOrServiceDeploymentProjectInstanceStatus = null;

  private CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Or Service Deployment Project instance 
   * @return productOrServiceDeploymentProjectInstanceReference
  **/

  public String getProductOrServiceDeploymentProjectInstanceReference() {
    return productOrServiceDeploymentProjectInstanceReference;
  }

  public void setProductOrServiceDeploymentProjectInstanceReference(String productOrServiceDeploymentProjectInstanceReference) {
    this.productOrServiceDeploymentProjectInstanceReference = productOrServiceDeploymentProjectInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return productOrServiceDeploymentProjectCreateActionReference
  **/

  public String getProductOrServiceDeploymentProjectCreateActionReference() {
    return productOrServiceDeploymentProjectCreateActionReference;
  }

  public void setProductOrServiceDeploymentProjectCreateActionReference(String productOrServiceDeploymentProjectCreateActionReference) {
    this.productOrServiceDeploymentProjectCreateActionReference = productOrServiceDeploymentProjectCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return productOrServiceDeploymentProjectCreateActionRecord
  **/

  public Object getProductOrServiceDeploymentProjectCreateActionRecord() {
    return productOrServiceDeploymentProjectCreateActionRecord;
  }

  public void setProductOrServiceDeploymentProjectCreateActionRecord(Object productOrServiceDeploymentProjectCreateActionRecord) {
    this.productOrServiceDeploymentProjectCreateActionRecord = productOrServiceDeploymentProjectCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product Or Service Deployment Project instance (e.g. initialised, pending, active) 
   * @return productOrServiceDeploymentProjectInstanceStatus
  **/

  public String getProductOrServiceDeploymentProjectInstanceStatus() {
    return productOrServiceDeploymentProjectInstanceStatus;
  }

  public void setProductOrServiceDeploymentProjectInstanceStatus(String productOrServiceDeploymentProjectInstanceStatus) {
    this.productOrServiceDeploymentProjectInstanceStatus = productOrServiceDeploymentProjectInstanceStatus;
  }


  /**
   * Get productServiceDeploymentProjectInstanceRecord
   * @return productServiceDeploymentProjectInstanceRecord
  **/

  public CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord getProductServiceDeploymentProjectInstanceRecord() {
    return productServiceDeploymentProjectInstanceRecord;
  }

  public void setProductServiceDeploymentProjectInstanceRecord(CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord) {
    this.productServiceDeploymentProjectInstanceRecord = productServiceDeploymentProjectInstanceRecord;
  }


}

