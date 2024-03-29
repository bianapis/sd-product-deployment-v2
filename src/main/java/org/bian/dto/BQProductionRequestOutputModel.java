package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRequestInputModelProductionInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductionRequestOutputModel
 */
public class BQProductionRequestOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQProductionRequestInputModelProductionInstanceRecord productionInstanceRecord = null;

  private String productionRequestActionTaskReference = null;

  private Object productionRequestActionTaskRecord = null;

  private String productionRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * Get productionInstanceRecord
   * @return productionInstanceRecord
  **/

  public BQProductionRequestInputModelProductionInstanceRecord getProductionInstanceRecord() {
    return productionInstanceRecord;
  }

  public void setProductionInstanceRecord(BQProductionRequestInputModelProductionInstanceRecord productionInstanceRecord) {
    this.productionInstanceRecord = productionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production instance request service call 
   * @return productionRequestActionTaskReference
  **/

  public String getProductionRequestActionTaskReference() {
    return productionRequestActionTaskReference;
  }

  public void setProductionRequestActionTaskReference(String productionRequestActionTaskReference) {
    this.productionRequestActionTaskReference = productionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productionRequestActionTaskRecord
  **/

  public Object getProductionRequestActionTaskRecord() {
    return productionRequestActionTaskRecord;
  }

  public void setProductionRequestActionTaskRecord(Object productionRequestActionTaskRecord) {
    this.productionRequestActionTaskRecord = productionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production service request record 
   * @return productionRequestRecordReference
  **/

  public String getProductionRequestRecordReference() {
    return productionRequestRecordReference;
  }

  public void setProductionRequestRecordReference(String productionRequestRecordReference) {
    this.productionRequestRecordReference = productionRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

