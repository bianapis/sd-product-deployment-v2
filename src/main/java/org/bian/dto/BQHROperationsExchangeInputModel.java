package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQHROperationsExchangeInputModel
 */
public class BQHROperationsExchangeInputModel   {
  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String hROperationsInstanceReference = null;

  private Object hROperationsExchangeActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest hROperationsExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return hROperationsExchangeActionTaskRecord
  **/

  public Object getHROperationsExchangeActionTaskRecord() {
    return hROperationsExchangeActionTaskRecord;
  }

  public void setHROperationsExchangeActionTaskRecord(Object hROperationsExchangeActionTaskRecord) {
    this.hROperationsExchangeActionTaskRecord = hROperationsExchangeActionTaskRecord;
  }


  /**
   * Get hROperationsExchangeActionRequest
   * @return hROperationsExchangeActionRequest
  **/

  public CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest getHROperationsExchangeActionRequest() {
    return hROperationsExchangeActionRequest;
  }

  public void setHROperationsExchangeActionRequest(CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest hROperationsExchangeActionRequest) {
    this.hROperationsExchangeActionRequest = hROperationsExchangeActionRequest;
  }


}

