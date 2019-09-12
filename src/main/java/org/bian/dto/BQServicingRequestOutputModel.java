package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServicingRequestInputModelServicingInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServicingRequestOutputModel
 */
public class BQServicingRequestOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQServicingRequestInputModelServicingInstanceRecord servicingInstanceRecord = null;

  private String servicingRequestActionTaskReference = null;

  private Object servicingRequestActionTaskRecord = null;

  private String servicingRequestRecordReference = null;

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
   * Get servicingInstanceRecord
   * @return servicingInstanceRecord
  **/

  public BQServicingRequestInputModelServicingInstanceRecord getServicingInstanceRecord() {
    return servicingInstanceRecord;
  }

  public void setServicingInstanceRecord(BQServicingRequestInputModelServicingInstanceRecord servicingInstanceRecord) {
    this.servicingInstanceRecord = servicingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing instance request service call 
   * @return servicingRequestActionTaskReference
  **/

  public String getServicingRequestActionTaskReference() {
    return servicingRequestActionTaskReference;
  }

  public void setServicingRequestActionTaskReference(String servicingRequestActionTaskReference) {
    this.servicingRequestActionTaskReference = servicingRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return servicingRequestActionTaskRecord
  **/

  public Object getServicingRequestActionTaskRecord() {
    return servicingRequestActionTaskRecord;
  }

  public void setServicingRequestActionTaskRecord(Object servicingRequestActionTaskRecord) {
    this.servicingRequestActionTaskRecord = servicingRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Servicing service request record 
   * @return servicingRequestRecordReference
  **/

  public String getServicingRequestRecordReference() {
    return servicingRequestRecordReference;
  }

  public void setServicingRequestRecordReference(String servicingRequestRecordReference) {
    this.servicingRequestRecordReference = servicingRequestRecordReference;
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

