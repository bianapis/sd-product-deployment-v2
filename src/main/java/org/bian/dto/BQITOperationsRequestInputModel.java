package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQITOperationsRequestInputModelITOperationsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQITOperationsRequestInputModel
 */
public class BQITOperationsRequestInputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String iTOperationsInstanceReference = null;

  private BQITOperationsRequestInputModelITOperationsInstanceRecord iTOperationsInstanceRecord = null;

  private Object iTOperationsRequestActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQITOperationsRequestInputModelITOperationsInstanceRecord getITOperationsInstanceRecord() {
    return iTOperationsInstanceRecord;
  }

  public void setITOperationsInstanceRecord(BQITOperationsRequestInputModelITOperationsInstanceRecord iTOperationsInstanceRecord) {
    this.iTOperationsInstanceRecord = iTOperationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return iTOperationsRequestActionTaskRecord
  **/

  public Object getITOperationsRequestActionTaskRecord() {
    return iTOperationsRequestActionTaskRecord;
  }

  public void setITOperationsRequestActionTaskRecord(Object iTOperationsRequestActionTaskRecord) {
    this.iTOperationsRequestActionTaskRecord = iTOperationsRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

