package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionExchangeOutputModel
 */
public class BQProductionExchangeOutputModel   {
  private String productionExchangeActionTaskReference = null;

  private Object productionExchangeActionTaskRecord = null;

  private String productionExchangeActionResponse = null;

  private String productionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production instance exchange service call 
   * @return productionExchangeActionTaskReference
  **/

  public String getProductionExchangeActionTaskReference() {
    return productionExchangeActionTaskReference;
  }

  public void setProductionExchangeActionTaskReference(String productionExchangeActionTaskReference) {
    this.productionExchangeActionTaskReference = productionExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return productionExchangeActionTaskRecord
  **/

  public Object getProductionExchangeActionTaskRecord() {
    return productionExchangeActionTaskRecord;
  }

  public void setProductionExchangeActionTaskRecord(Object productionExchangeActionTaskRecord) {
    this.productionExchangeActionTaskRecord = productionExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return productionExchangeActionResponse
  **/

  public String getProductionExchangeActionResponse() {
    return productionExchangeActionResponse;
  }

  public void setProductionExchangeActionResponse(String productionExchangeActionResponse) {
    this.productionExchangeActionResponse = productionExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Production instance (e.g. accepted, rejected, verified) 
   * @return productionInstanceStatus
  **/

  public String getProductionInstanceStatus() {
    return productionInstanceStatus;
  }

  public void setProductionInstanceStatus(String productionInstanceStatus) {
    this.productionInstanceStatus = productionInstanceStatus;
  }


}

