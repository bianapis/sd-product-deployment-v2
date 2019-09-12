package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQITOperationsRequestInputModelITOperationsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQITOperationsRequestOutputModel
 */
public class BQITOperationsRequestOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQITOperationsRequestInputModelITOperationsInstanceRecord iTOperationsInstanceRecord = null;

  private String iTOperationsRequestActionTaskReference = null;

  private Object iTOperationsRequestActionTaskRecord = null;

  private String iTOperationsRequestRecordReference = null;

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
   * Get iTOperationsInstanceRecord
   * @return iTOperationsInstanceRecord
  **/

  public BQITOperationsRequestInputModelITOperationsInstanceRecord getITOperationsInstanceRecord() {
    return iTOperationsInstanceRecord;
  }
   
  @JsonProperty("iTOperationsInstanceRecord")
  public void setITOperationsInstanceRecord(BQITOperationsRequestInputModelITOperationsInstanceRecord iTOperationsInstanceRecord) {
    this.iTOperationsInstanceRecord = iTOperationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT Operations instance request service call 
   * @return iTOperationsRequestActionTaskReference
  **/

  public String getITOperationsRequestActionTaskReference() {
    return iTOperationsRequestActionTaskReference;
  }
  
  @JsonProperty("iTOperationsRequestActionTaskReference")
  public void setITOperationsRequestActionTaskReference(String iTOperationsRequestActionTaskReference) {
    this.iTOperationsRequestActionTaskReference = iTOperationsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return iTOperationsRequestActionTaskRecord
  **/

  public Object getITOperationsRequestActionTaskRecord() {
    return iTOperationsRequestActionTaskRecord;
  }
   
  @JsonProperty("iTOperationsRequestActionTaskRecord")
  public void setITOperationsRequestActionTaskRecord(Object iTOperationsRequestActionTaskRecord) {
    this.iTOperationsRequestActionTaskRecord = iTOperationsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the IT Operations service request record 
   * @return iTOperationsRequestRecordReference
  **/

  public String getITOperationsRequestRecordReference() {
    return iTOperationsRequestRecordReference;
  }
   
  @JsonProperty("iTOperationsRequestRecordReference")
  public void setITOperationsRequestRecordReference(String iTOperationsRequestRecordReference) {
    this.iTOperationsRequestRecordReference = iTOperationsRequestRecordReference;
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

