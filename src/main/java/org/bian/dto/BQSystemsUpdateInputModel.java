package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSystemsUpdateInputModelSystemsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSystemsUpdateInputModel
 */
public class BQSystemsUpdateInputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String systemsInstanceReference = null;

  private BQSystemsUpdateInputModelSystemsInstanceRecord systemsInstanceRecord = null;

  private Object systemsUpdateActionTaskRecord = null;

  private String systemsUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Systems instance 
   * @return systemsInstanceReference
  **/

  public String getSystemsInstanceReference() {
    return systemsInstanceReference;
  }

  public void setSystemsInstanceReference(String systemsInstanceReference) {
    this.systemsInstanceReference = systemsInstanceReference;
  }


  /**
   * Get systemsInstanceRecord
   * @return systemsInstanceRecord
  **/

  public BQSystemsUpdateInputModelSystemsInstanceRecord getSystemsInstanceRecord() {
    return systemsInstanceRecord;
  }

  public void setSystemsInstanceRecord(BQSystemsUpdateInputModelSystemsInstanceRecord systemsInstanceRecord) {
    this.systemsInstanceRecord = systemsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return systemsUpdateActionTaskRecord
  **/

  public Object getSystemsUpdateActionTaskRecord() {
    return systemsUpdateActionTaskRecord;
  }

  public void setSystemsUpdateActionTaskRecord(Object systemsUpdateActionTaskRecord) {
    this.systemsUpdateActionTaskRecord = systemsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return systemsUpdateActionRequest
  **/

  public String getSystemsUpdateActionRequest() {
    return systemsUpdateActionRequest;
  }

  public void setSystemsUpdateActionRequest(String systemsUpdateActionRequest) {
    this.systemsUpdateActionRequest = systemsUpdateActionRequest;
  }


}

