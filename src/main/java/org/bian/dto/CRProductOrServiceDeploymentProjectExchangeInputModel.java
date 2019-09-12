package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectExchangeInputModel
 */
public class CRProductOrServiceDeploymentProjectExchangeInputModel   {
  private String productDeploymentServicingSessionReference = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private Object productOrServiceDeploymentProjectExchangeActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest productOrServiceDeploymentProjectExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productDeploymentServicingSessionReference
  **/

  public String getProductDeploymentServicingSessionReference() {
    return productDeploymentServicingSessionReference;
  }

  public void setProductDeploymentServicingSessionReference(String productDeploymentServicingSessionReference) {
    this.productDeploymentServicingSessionReference = productDeploymentServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Or Service Deployment Project instance 
   * @return productOrServiceDeploymentProjectInstanceReference
  **/

  public String getProductOrServiceDeploymentProjectInstanceReference() {
    return productOrServiceDeploymentProjectInstanceReference;
  }

  public void setProductOrServiceDeploymentProjectInstanceReference(String productOrServiceDeploymentProjectInstanceReference) {
    this.productOrServiceDeploymentProjectInstanceReference = productOrServiceDeploymentProjectInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return productOrServiceDeploymentProjectExchangeActionTaskRecord
  **/

  public Object getProductOrServiceDeploymentProjectExchangeActionTaskRecord() {
    return productOrServiceDeploymentProjectExchangeActionTaskRecord;
  }

  public void setProductOrServiceDeploymentProjectExchangeActionTaskRecord(Object productOrServiceDeploymentProjectExchangeActionTaskRecord) {
    this.productOrServiceDeploymentProjectExchangeActionTaskRecord = productOrServiceDeploymentProjectExchangeActionTaskRecord;
  }


  /**
   * Get productOrServiceDeploymentProjectExchangeActionRequest
   * @return productOrServiceDeploymentProjectExchangeActionRequest
  **/

  public CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest getProductOrServiceDeploymentProjectExchangeActionRequest() {
    return productOrServiceDeploymentProjectExchangeActionRequest;
  }

  public void setProductOrServiceDeploymentProjectExchangeActionRequest(CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest productOrServiceDeploymentProjectExchangeActionRequest) {
    this.productOrServiceDeploymentProjectExchangeActionRequest = productOrServiceDeploymentProjectExchangeActionRequest;
  }


}

