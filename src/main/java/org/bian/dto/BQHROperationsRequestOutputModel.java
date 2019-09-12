package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHROperationsRequestInputModelHROperationsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQHROperationsRequestOutputModel
 */
public class BQHROperationsRequestOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQHROperationsRequestInputModelHROperationsInstanceRecord hROperationsInstanceRecord = null;

  private String hROperationsRequestActionTaskReference = null;

  private Object hROperationsRequestActionTaskRecord = null;

  private String hROperationsRequestRecordReference = null;

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
   * Get hROperationsInstanceRecord
   * @return hROperationsInstanceRecord
  **/

  public BQHROperationsRequestInputModelHROperationsInstanceRecord getHROperationsInstanceRecord() {
    return hROperationsInstanceRecord;
  }
  
  @JsonProperty("hROperationsInstanceRecord")
  public void setHROperationsInstanceRecord(BQHROperationsRequestInputModelHROperationsInstanceRecord hROperationsInstanceRecord) {
    this.hROperationsInstanceRecord = hROperationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a HR Operations instance request service call 
   * @return hROperationsRequestActionTaskReference
  **/

  public String getHROperationsRequestActionTaskReference() {
    return hROperationsRequestActionTaskReference;
  }
  
  @JsonProperty("hROperationsRequestActionTaskReference")
  public void setHROperationsRequestActionTaskReference(String hROperationsRequestActionTaskReference) {
    this.hROperationsRequestActionTaskReference = hROperationsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return hROperationsRequestActionTaskRecord
  **/

  public Object getHROperationsRequestActionTaskRecord() {
    return hROperationsRequestActionTaskRecord;
  }
  
  @JsonProperty("hROperationsRequestActionTaskRecord")
  public void setHROperationsRequestActionTaskRecord(Object hROperationsRequestActionTaskRecord) {
    this.hROperationsRequestActionTaskRecord = hROperationsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the HR Operations service request record 
   * @return hROperationsRequestRecordReference
  **/

  public String getHROperationsRequestRecordReference() {
    return hROperationsRequestRecordReference;
  }
   @JsonProperty("hROperationsRequestRecordReference")
  public void setHROperationsRequestRecordReference(String hROperationsRequestRecordReference) {
    this.hROperationsRequestRecordReference = hROperationsRequestRecordReference;
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

