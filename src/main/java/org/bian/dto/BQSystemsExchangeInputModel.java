package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQSystemsExchangeInputModel
 */
public class BQSystemsExchangeInputModel   {
  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String systemsInstanceReference = null;

  private Object systemsExchangeActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest systemsExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return systemsExchangeActionTaskRecord
  **/

  public Object getSystemsExchangeActionTaskRecord() {
    return systemsExchangeActionTaskRecord;
  }

  public void setSystemsExchangeActionTaskRecord(Object systemsExchangeActionTaskRecord) {
    this.systemsExchangeActionTaskRecord = systemsExchangeActionTaskRecord;
  }


  /**
   * Get systemsExchangeActionRequest
   * @return systemsExchangeActionRequest
  **/

  public CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest getSystemsExchangeActionRequest() {
    return systemsExchangeActionRequest;
  }

  public void setSystemsExchangeActionRequest(CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest systemsExchangeActionRequest) {
    this.systemsExchangeActionRequest = systemsExchangeActionRequest;
  }


}

