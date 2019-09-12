package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQITOperationsUpdateInputModelITOperationsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQITOperationsUpdateInputModel
 */
public class BQITOperationsUpdateInputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String iTOperationsInstanceReference = null;

  private BQITOperationsUpdateInputModelITOperationsInstanceRecord iTOperationsInstanceRecord = null;

  private Object iTOperationsUpdateActionTaskRecord = null;

  private String iTOperationsUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the IT Operations instance 
   * @return iTOperationsInstanceReference
  **/

  public String getITOperationsInstanceReference() {
    return iTOperationsInstanceReference;
  }

  public void setITOperationsInstanceReference(String iTOperationsInstanceReference) {
    this.iTOperationsInstanceReference = iTOperationsInstanceReference;
  }


  /**
   * Get iTOperationsInstanceRecord
   * @return iTOperationsInstanceRecord
  **/

  public BQITOperationsUpdateInputModelITOperationsInstanceRecord getITOperationsInstanceRecord() {
    return iTOperationsInstanceRecord;
  }

  public void setITOperationsInstanceRecord(BQITOperationsUpdateInputModelITOperationsInstanceRecord iTOperationsInstanceRecord) {
    this.iTOperationsInstanceRecord = iTOperationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return iTOperationsUpdateActionTaskRecord
  **/

  public Object getITOperationsUpdateActionTaskRecord() {
    return iTOperationsUpdateActionTaskRecord;
  }

  public void setITOperationsUpdateActionTaskRecord(Object iTOperationsUpdateActionTaskRecord) {
    this.iTOperationsUpdateActionTaskRecord = iTOperationsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return iTOperationsUpdateActionRequest
  **/

  public String getITOperationsUpdateActionRequest() {
    return iTOperationsUpdateActionRequest;
  }

  public void setITOperationsUpdateActionRequest(String iTOperationsUpdateActionRequest) {
    this.iTOperationsUpdateActionRequest = iTOperationsUpdateActionRequest;
  }


}

