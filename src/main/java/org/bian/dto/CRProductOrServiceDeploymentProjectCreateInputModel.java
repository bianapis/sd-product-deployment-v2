package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectCreateInputModel
 */
public class CRProductOrServiceDeploymentProjectCreateInputModel   {
  private String productDeploymentServicingSessionReference = null;

  private Object productOrServiceDeploymentProjectCreateActionRecord = null;

  private String productOrServiceDeploymentProjectInstanceStatus = null;

  private CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productDeploymentServicingSessionReference
  **/

  public String getProductDeploymentServicingSessionReference() {
    return productDeploymentServicingSessionReference;
  }

  public void setProductDeploymentServicingSessionReference(String productDeploymentServicingSessionReference) {
    this.productDeploymentServicingSessionReference = productDeploymentServicingSessionReference;
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

