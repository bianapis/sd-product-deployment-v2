package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectCaptureOutputModel
 */
public class CRProductOrServiceDeploymentProjectCaptureOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectCaptureActionTaskReference = null;

  private Object productOrServiceDeploymentProjectCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Or Service Deployment Project instance capture service call 
   * @return productOrServiceDeploymentProjectCaptureActionTaskReference
  **/

  public String getProductOrServiceDeploymentProjectCaptureActionTaskReference() {
    return productOrServiceDeploymentProjectCaptureActionTaskReference;
  }

  public void setProductOrServiceDeploymentProjectCaptureActionTaskReference(String productOrServiceDeploymentProjectCaptureActionTaskReference) {
    this.productOrServiceDeploymentProjectCaptureActionTaskReference = productOrServiceDeploymentProjectCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return productOrServiceDeploymentProjectCaptureActionTaskRecord
  **/

  public Object getProductOrServiceDeploymentProjectCaptureActionTaskRecord() {
    return productOrServiceDeploymentProjectCaptureActionTaskRecord;
  }

  public void setProductOrServiceDeploymentProjectCaptureActionTaskRecord(Object productOrServiceDeploymentProjectCaptureActionTaskRecord) {
    this.productOrServiceDeploymentProjectCaptureActionTaskRecord = productOrServiceDeploymentProjectCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

