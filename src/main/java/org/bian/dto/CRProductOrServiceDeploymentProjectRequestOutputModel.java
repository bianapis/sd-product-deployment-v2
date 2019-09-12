package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectRequestOutputModel
 */
public class CRProductOrServiceDeploymentProjectRequestOutputModel   {
  private CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectRequestActionTaskReference = null;

  private Object productOrServiceDeploymentProjectRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get productServiceDeploymentProjectInstanceRecord
   * @return productServiceDeploymentProjectInstanceRecord
  **/

  public CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord getProductServiceDeploymentProjectInstanceRecord() {
    return productServiceDeploymentProjectInstanceRecord;
  }

  public void setProductServiceDeploymentProjectInstanceRecord(CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord) {
    this.productServiceDeploymentProjectInstanceRecord = productServiceDeploymentProjectInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Or Service Deployment Project instance request service call 
   * @return productOrServiceDeploymentProjectRequestActionTaskReference
  **/

  public String getProductOrServiceDeploymentProjectRequestActionTaskReference() {
    return productOrServiceDeploymentProjectRequestActionTaskReference;
  }

  public void setProductOrServiceDeploymentProjectRequestActionTaskReference(String productOrServiceDeploymentProjectRequestActionTaskReference) {
    this.productOrServiceDeploymentProjectRequestActionTaskReference = productOrServiceDeploymentProjectRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productOrServiceDeploymentProjectRequestActionTaskRecord
  **/

  public Object getProductOrServiceDeploymentProjectRequestActionTaskRecord() {
    return productOrServiceDeploymentProjectRequestActionTaskRecord;
  }

  public void setProductOrServiceDeploymentProjectRequestActionTaskRecord(Object productOrServiceDeploymentProjectRequestActionTaskRecord) {
    this.productOrServiceDeploymentProjectRequestActionTaskRecord = productOrServiceDeploymentProjectRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
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

