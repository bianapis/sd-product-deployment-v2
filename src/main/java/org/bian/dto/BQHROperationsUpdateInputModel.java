package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHROperationsUpdateInputModelHROperationsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQHROperationsUpdateInputModel
 */
public class BQHROperationsUpdateInputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String hROperationsInstanceReference = null;

  private BQHROperationsUpdateInputModelHROperationsInstanceRecord hROperationsInstanceRecord = null;

  private Object hROperationsUpdateActionTaskRecord = null;

  private String hROperationsUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the HR Operations instance 
   * @return hROperationsInstanceReference
  **/

  public String getHROperationsInstanceReference() {
    return hROperationsInstanceReference;
  }

  public void setHROperationsInstanceReference(String hROperationsInstanceReference) {
    this.hROperationsInstanceReference = hROperationsInstanceReference;
  }


  /**
   * Get hROperationsInstanceRecord
   * @return hROperationsInstanceRecord
  **/

  public BQHROperationsUpdateInputModelHROperationsInstanceRecord getHROperationsInstanceRecord() {
    return hROperationsInstanceRecord;
  }

  public void setHROperationsInstanceRecord(BQHROperationsUpdateInputModelHROperationsInstanceRecord hROperationsInstanceRecord) {
    this.hROperationsInstanceRecord = hROperationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return hROperationsUpdateActionTaskRecord
  **/

  public Object getHROperationsUpdateActionTaskRecord() {
    return hROperationsUpdateActionTaskRecord;
  }

  public void setHROperationsUpdateActionTaskRecord(Object hROperationsUpdateActionTaskRecord) {
    this.hROperationsUpdateActionTaskRecord = hROperationsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return hROperationsUpdateActionRequest
  **/

  public String getHROperationsUpdateActionRequest() {
    return hROperationsUpdateActionRequest;
  }

  public void setHROperationsUpdateActionRequest(String hROperationsUpdateActionRequest) {
    this.hROperationsUpdateActionRequest = hROperationsUpdateActionRequest;
  }


}

