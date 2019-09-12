package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSystemsRequestInputModelSystemsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSystemsRequestOutputModel
 */
public class BQSystemsRequestOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQSystemsRequestInputModelSystemsInstanceRecord systemsInstanceRecord = null;

  private String systemsRequestActionTaskReference = null;

  private Object systemsRequestActionTaskRecord = null;

  private String systemsRequestRecordReference = null;

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
   * Get systemsInstanceRecord
   * @return systemsInstanceRecord
  **/

  public BQSystemsRequestInputModelSystemsInstanceRecord getSystemsInstanceRecord() {
    return systemsInstanceRecord;
  }

  public void setSystemsInstanceRecord(BQSystemsRequestInputModelSystemsInstanceRecord systemsInstanceRecord) {
    this.systemsInstanceRecord = systemsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Systems instance request service call 
   * @return systemsRequestActionTaskReference
  **/

  public String getSystemsRequestActionTaskReference() {
    return systemsRequestActionTaskReference;
  }

  public void setSystemsRequestActionTaskReference(String systemsRequestActionTaskReference) {
    this.systemsRequestActionTaskReference = systemsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return systemsRequestActionTaskRecord
  **/

  public Object getSystemsRequestActionTaskRecord() {
    return systemsRequestActionTaskRecord;
  }

  public void setSystemsRequestActionTaskRecord(Object systemsRequestActionTaskRecord) {
    this.systemsRequestActionTaskRecord = systemsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Systems service request record 
   * @return systemsRequestRecordReference
  **/

  public String getSystemsRequestRecordReference() {
    return systemsRequestRecordReference;
  }

  public void setSystemsRequestRecordReference(String systemsRequestRecordReference) {
    this.systemsRequestRecordReference = systemsRequestRecordReference;
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

