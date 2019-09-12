package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSystemsExchangeOutputModel
 */
public class BQSystemsExchangeOutputModel   {
  private String systemsExchangeActionTaskReference = null;

  private Object systemsExchangeActionTaskRecord = null;

  private String systemsExchangeActionResponse = null;

  private String systemsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Systems instance exchange service call 
   * @return systemsExchangeActionTaskReference
  **/

  public String getSystemsExchangeActionTaskReference() {
    return systemsExchangeActionTaskReference;
  }

  public void setSystemsExchangeActionTaskReference(String systemsExchangeActionTaskReference) {
    this.systemsExchangeActionTaskReference = systemsExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return systemsExchangeActionResponse
  **/

  public String getSystemsExchangeActionResponse() {
    return systemsExchangeActionResponse;
  }

  public void setSystemsExchangeActionResponse(String systemsExchangeActionResponse) {
    this.systemsExchangeActionResponse = systemsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Systems instance (e.g. accepted, rejected, verified) 
   * @return systemsInstanceStatus
  **/

  public String getSystemsInstanceStatus() {
    return systemsInstanceStatus;
  }

  public void setSystemsInstanceStatus(String systemsInstanceStatus) {
    this.systemsInstanceStatus = systemsInstanceStatus;
  }


}

