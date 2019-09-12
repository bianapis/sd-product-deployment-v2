package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionSupportExchangeOutputModel
 */
public class BQProductionSupportExchangeOutputModel   {
  private String productionSupportExchangeActionTaskReference = null;

  private Object productionSupportExchangeActionTaskRecord = null;

  private String productionSupportExchangeActionResponse = null;

  private String productionSupportInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production Support instance exchange service call 
   * @return productionSupportExchangeActionTaskReference
  **/

  public String getProductionSupportExchangeActionTaskReference() {
    return productionSupportExchangeActionTaskReference;
  }

  public void setProductionSupportExchangeActionTaskReference(String productionSupportExchangeActionTaskReference) {
    this.productionSupportExchangeActionTaskReference = productionSupportExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return productionSupportExchangeActionResponse
  **/

  public String getProductionSupportExchangeActionResponse() {
    return productionSupportExchangeActionResponse;
  }

  public void setProductionSupportExchangeActionResponse(String productionSupportExchangeActionResponse) {
    this.productionSupportExchangeActionResponse = productionSupportExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Production Support instance (e.g. accepted, rejected, verified) 
   * @return productionSupportInstanceStatus
  **/

  public String getProductionSupportInstanceStatus() {
    return productionSupportInstanceStatus;
  }

  public void setProductionSupportInstanceStatus(String productionSupportInstanceStatus) {
    this.productionSupportInstanceStatus = productionSupportInstanceStatus;
  }


}

