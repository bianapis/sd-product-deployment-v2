package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQHROperationsExchangeOutputModel
 */
public class BQHROperationsExchangeOutputModel   {
  private String hROperationsExchangeActionTaskReference = null;

  private Object hROperationsExchangeActionTaskRecord = null;

  private String hROperationsExchangeActionResponse = null;

  private String hROperationsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a HR Operations instance exchange service call 
   * @return hROperationsExchangeActionTaskReference
  **/

  public String getHROperationsExchangeActionTaskReference() {
    return hROperationsExchangeActionTaskReference;
  }
  
  @JsonProperty("hROperationsExchangeActionTaskReference")
  public void setHROperationsExchangeActionTaskReference(String hROperationsExchangeActionTaskReference) {
    this.hROperationsExchangeActionTaskReference = hROperationsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return hROperationsExchangeActionTaskRecord
  **/

  public Object getHROperationsExchangeActionTaskRecord() {
    return hROperationsExchangeActionTaskRecord;
  }
   
  @JsonProperty("hROperationsExchangeActionTaskRecord")
  public void setHROperationsExchangeActionTaskRecord(Object hROperationsExchangeActionTaskRecord) {
    this.hROperationsExchangeActionTaskRecord = hROperationsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return hROperationsExchangeActionResponse
  **/

  public String getHROperationsExchangeActionResponse() {
    return hROperationsExchangeActionResponse;
  }
   
  @JsonProperty("hROperationsExchangeActionResponse")
  public void setHROperationsExchangeActionResponse(String hROperationsExchangeActionResponse) {
    this.hROperationsExchangeActionResponse = hROperationsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the HR Operations instance (e.g. accepted, rejected, verified) 
   * @return hROperationsInstanceStatus
  **/

  public String getHROperationsInstanceStatus() {
    return hROperationsInstanceStatus;
  }
  
  @JsonProperty("hROperationsInstanceStatus")
  public void setHROperationsInstanceStatus(String hROperationsInstanceStatus) {
    this.hROperationsInstanceStatus = hROperationsInstanceStatus;
  }


}

