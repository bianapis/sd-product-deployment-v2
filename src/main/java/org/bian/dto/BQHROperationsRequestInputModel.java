package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHROperationsRequestInputModelHROperationsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQHROperationsRequestInputModel
 */
public class BQHROperationsRequestInputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String hROperationsInstanceReference = null;

  private BQHROperationsRequestInputModelHROperationsInstanceRecord hROperationsInstanceRecord = null;

  private Object hROperationsRequestActionTaskRecord = null;

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

  public BQHROperationsRequestInputModelHROperationsInstanceRecord getHROperationsInstanceRecord() {
    return hROperationsInstanceRecord;
  }

  public void setHROperationsInstanceRecord(BQHROperationsRequestInputModelHROperationsInstanceRecord hROperationsInstanceRecord) {
    this.hROperationsInstanceRecord = hROperationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return hROperationsRequestActionTaskRecord
  **/

  public Object getHROperationsRequestActionTaskRecord() {
    return hROperationsRequestActionTaskRecord;
  }

  public void setHROperationsRequestActionTaskRecord(Object hROperationsRequestActionTaskRecord) {
    this.hROperationsRequestActionTaskRecord = hROperationsRequestActionTaskRecord;
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

