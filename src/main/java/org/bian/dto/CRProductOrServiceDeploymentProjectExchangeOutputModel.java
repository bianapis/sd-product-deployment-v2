package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectExchangeOutputModel
 */
public class CRProductOrServiceDeploymentProjectExchangeOutputModel   {
  private String productOrServiceDeploymentProjectExchangeActionTaskReference = null;

  private Object productOrServiceDeploymentProjectExchangeActionTaskRecord = null;

  private String productOrServiceDeploymentProjectExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Or Service Deployment Project instance exchange service call 
   * @return productOrServiceDeploymentProjectExchangeActionTaskReference
  **/

  public String getProductOrServiceDeploymentProjectExchangeActionTaskReference() {
    return productOrServiceDeploymentProjectExchangeActionTaskReference;
  }

  public void setProductOrServiceDeploymentProjectExchangeActionTaskReference(String productOrServiceDeploymentProjectExchangeActionTaskReference) {
    this.productOrServiceDeploymentProjectExchangeActionTaskReference = productOrServiceDeploymentProjectExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return productOrServiceDeploymentProjectExchangeActionResponse
  **/

  public String getProductOrServiceDeploymentProjectExchangeActionResponse() {
    return productOrServiceDeploymentProjectExchangeActionResponse;
  }

  public void setProductOrServiceDeploymentProjectExchangeActionResponse(String productOrServiceDeploymentProjectExchangeActionResponse) {
    this.productOrServiceDeploymentProjectExchangeActionResponse = productOrServiceDeploymentProjectExchangeActionResponse;
  }


}

