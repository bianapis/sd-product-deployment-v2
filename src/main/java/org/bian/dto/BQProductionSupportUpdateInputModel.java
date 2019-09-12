package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionSupportUpdateInputModelProductionSupportInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductionSupportUpdateInputModel
 */
public class BQProductionSupportUpdateInputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String productionSupportInstanceReference = null;

  private BQProductionSupportUpdateInputModelProductionSupportInstanceRecord productionSupportInstanceRecord = null;

  private Object productionSupportUpdateActionTaskRecord = null;

  private String productionSupportUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production Support instance 
   * @return productionSupportInstanceReference
  **/

  public String getProductionSupportInstanceReference() {
    return productionSupportInstanceReference;
  }

  public void setProductionSupportInstanceReference(String productionSupportInstanceReference) {
    this.productionSupportInstanceReference = productionSupportInstanceReference;
  }


  /**
   * Get productionSupportInstanceRecord
   * @return productionSupportInstanceRecord
  **/

  public BQProductionSupportUpdateInputModelProductionSupportInstanceRecord getProductionSupportInstanceRecord() {
    return productionSupportInstanceRecord;
  }

  public void setProductionSupportInstanceRecord(BQProductionSupportUpdateInputModelProductionSupportInstanceRecord productionSupportInstanceRecord) {
    this.productionSupportInstanceRecord = productionSupportInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productionSupportUpdateActionTaskRecord
  **/

  public Object getProductionSupportUpdateActionTaskRecord() {
    return productionSupportUpdateActionTaskRecord;
  }

  public void setProductionSupportUpdateActionTaskRecord(Object productionSupportUpdateActionTaskRecord) {
    this.productionSupportUpdateActionTaskRecord = productionSupportUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return productionSupportUpdateActionRequest
  **/

  public String getProductionSupportUpdateActionRequest() {
    return productionSupportUpdateActionRequest;
  }

  public void setProductionSupportUpdateActionRequest(String productionSupportUpdateActionRequest) {
    this.productionSupportUpdateActionRequest = productionSupportUpdateActionRequest;
  }


}

