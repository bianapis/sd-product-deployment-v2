package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQITOperationsExchangeInputModel
 */
public class BQITOperationsExchangeInputModel   {
  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String iTOperationsInstanceReference = null;

  private Object iTOperationsExchangeActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest iTOperationsExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return iTOperationsExchangeActionTaskRecord
  **/

  public Object getITOperationsExchangeActionTaskRecord() {
    return iTOperationsExchangeActionTaskRecord;
  }

  public void setITOperationsExchangeActionTaskRecord(Object iTOperationsExchangeActionTaskRecord) {
    this.iTOperationsExchangeActionTaskRecord = iTOperationsExchangeActionTaskRecord;
  }


  /**
   * Get iTOperationsExchangeActionRequest
   * @return iTOperationsExchangeActionRequest
  **/

  public CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest getITOperationsExchangeActionRequest() {
    return iTOperationsExchangeActionRequest;
  }

  public void setITOperationsExchangeActionRequest(CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest iTOperationsExchangeActionRequest) {
    this.iTOperationsExchangeActionRequest = iTOperationsExchangeActionRequest;
  }


}

