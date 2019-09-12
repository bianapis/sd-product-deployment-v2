package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQProductionSupportExchangeInputModel
 */
public class BQProductionSupportExchangeInputModel   {
  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String productionSupportInstanceReference = null;

  private Object productionSupportExchangeActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest productionSupportExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production Support instance 
   * @return productionSupportInstanceReference
  **/

  public String getProductionSupportInstanceReference() {
    return productionSupportInstanceReference;
  }

  public void setProductionSupportInstanceReference(String productionSupportInstanceReference) {
    this.productionSupportInstanceReference = productionSupportInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return productionSupportExchangeActionTaskRecord
  **/

  public Object getProductionSupportExchangeActionTaskRecord() {
    return productionSupportExchangeActionTaskRecord;
  }

  public void setProductionSupportExchangeActionTaskRecord(Object productionSupportExchangeActionTaskRecord) {
    this.productionSupportExchangeActionTaskRecord = productionSupportExchangeActionTaskRecord;
  }


  /**
   * Get productionSupportExchangeActionRequest
   * @return productionSupportExchangeActionRequest
  **/

  public CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest getProductionSupportExchangeActionRequest() {
    return productionSupportExchangeActionRequest;
  }

  public void setProductionSupportExchangeActionRequest(CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest productionSupportExchangeActionRequest) {
    this.productionSupportExchangeActionRequest = productionSupportExchangeActionRequest;
  }


}

