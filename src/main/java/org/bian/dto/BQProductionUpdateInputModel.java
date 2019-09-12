package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionUpdateInputModelProductionInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductionUpdateInputModel
 */
public class BQProductionUpdateInputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String productionInstanceReference = null;

  private BQProductionUpdateInputModelProductionInstanceRecord productionInstanceRecord = null;

  private Object productionUpdateActionTaskRecord = null;

  private String productionUpdateActionRequest = null;


  /**
   * Get productServiceDeploymentProjectInstanceRecord
   * @return productServiceDeploymentProjectInstanceRecord
  **/

  public CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord getProductServiceDeploymentProjectInstanceRecord() {
    return productServiceDeploymentProjectInstanceRecord;
  }

  public void setProductServiceDeploymentProjectInstanceRecord(CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord) {
    this.productServiceDeploymentProjectInstanceRecord = productServiceDeploymentProjectInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product Or Service Deployment Project instance 
   * @return productOrServiceDeploymentProjectInstanceReference
  **/

  public String getProductOrServiceDeploymentProjectInstanceReference() {
    return productOrServiceDeploymentProjectInstanceReference;
  }

  public void setProductOrServiceDeploymentProjectInstanceReference(String productOrServiceDeploymentProjectInstanceReference) {
    this.productOrServiceDeploymentProjectInstanceReference = productOrServiceDeploymentProjectInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production instance 
   * @return productionInstanceReference
  **/

  public String getProductionInstanceReference() {
    return productionInstanceReference;
  }

  public void setProductionInstanceReference(String productionInstanceReference) {
    this.productionInstanceReference = productionInstanceReference;
  }


  /**
   * Get productionInstanceRecord
   * @return productionInstanceRecord
  **/

  public BQProductionUpdateInputModelProductionInstanceRecord getProductionInstanceRecord() {
    return productionInstanceRecord;
  }

  public void setProductionInstanceRecord(BQProductionUpdateInputModelProductionInstanceRecord productionInstanceRecord) {
    this.productionInstanceRecord = productionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productionUpdateActionTaskRecord
  **/

  public Object getProductionUpdateActionTaskRecord() {
    return productionUpdateActionTaskRecord;
  }

  public void setProductionUpdateActionTaskRecord(Object productionUpdateActionTaskRecord) {
    this.productionUpdateActionTaskRecord = productionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return productionUpdateActionRequest
  **/

  public String getProductionUpdateActionRequest() {
    return productionUpdateActionRequest;
  }

  public void setProductionUpdateActionRequest(String productionUpdateActionRequest) {
    this.productionUpdateActionRequest = productionUpdateActionRequest;
  }


}

