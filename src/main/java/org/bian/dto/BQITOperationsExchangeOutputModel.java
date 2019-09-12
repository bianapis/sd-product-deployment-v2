package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITOperationsExchangeOutputModel
 */
public class BQITOperationsExchangeOutputModel   {
  private String iTOperationsExchangeActionTaskReference = null;

  private Object iTOperationsExchangeActionTaskRecord = null;

  private String iTOperationsExchangeActionResponse = null;

  private String iTOperationsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT Operations instance exchange service call 
   * @return iTOperationsExchangeActionTaskReference
  **/

  public String getITOperationsExchangeActionTaskReference() {
    return iTOperationsExchangeActionTaskReference;
  }
   
  @JsonProperty("iTOperationsExchangeActionTaskReference")
  public void setITOperationsExchangeActionTaskReference(String iTOperationsExchangeActionTaskReference) {
    this.iTOperationsExchangeActionTaskReference = iTOperationsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return iTOperationsExchangeActionTaskRecord
  **/

  public Object getITOperationsExchangeActionTaskRecord() {
    return iTOperationsExchangeActionTaskRecord;
  }
  @JsonProperty("iTOperationsExchangeActionTaskRecord")
  public void setITOperationsExchangeActionTaskRecord(Object iTOperationsExchangeActionTaskRecord) {
    this.iTOperationsExchangeActionTaskRecord = iTOperationsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return iTOperationsExchangeActionResponse
  **/

  public String getITOperationsExchangeActionResponse() {
    return iTOperationsExchangeActionResponse;
  }
   
  @JsonProperty("iTOperationsExchangeActionResponse")
  public void setITOperationsExchangeActionResponse(String iTOperationsExchangeActionResponse) {
    this.iTOperationsExchangeActionResponse = iTOperationsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the IT Operations instance (e.g. accepted, rejected, verified) 
   * @return iTOperationsInstanceStatus
  **/

  public String getITOperationsInstanceStatus() {
    return iTOperationsInstanceStatus;
  }
  
  @JsonProperty("iTOperationsInstanceStatus")
  public void setITOperationsInstanceStatus(String iTOperationsInstanceStatus) {
    this.iTOperationsInstanceStatus = iTOperationsInstanceStatus;
  }


}

