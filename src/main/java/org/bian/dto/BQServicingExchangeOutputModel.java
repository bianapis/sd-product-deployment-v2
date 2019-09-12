package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServicingExchangeOutputModel
 */
public class BQServicingExchangeOutputModel   {
  private String servicingExchangeActionTaskReference = null;

  private Object servicingExchangeActionTaskRecord = null;

  private String servicingExchangeActionResponse = null;

  private String servicingInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing instance exchange service call 
   * @return servicingExchangeActionTaskReference
  **/

  public String getServicingExchangeActionTaskReference() {
    return servicingExchangeActionTaskReference;
  }

  public void setServicingExchangeActionTaskReference(String servicingExchangeActionTaskReference) {
    this.servicingExchangeActionTaskReference = servicingExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return servicingExchangeActionTaskRecord
  **/

  public Object getServicingExchangeActionTaskRecord() {
    return servicingExchangeActionTaskRecord;
  }

  public void setServicingExchangeActionTaskRecord(Object servicingExchangeActionTaskRecord) {
    this.servicingExchangeActionTaskRecord = servicingExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return servicingExchangeActionResponse
  **/

  public String getServicingExchangeActionResponse() {
    return servicingExchangeActionResponse;
  }

  public void setServicingExchangeActionResponse(String servicingExchangeActionResponse) {
    this.servicingExchangeActionResponse = servicingExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Servicing instance (e.g. accepted, rejected, verified) 
   * @return servicingInstanceStatus
  **/

  public String getServicingInstanceStatus() {
    return servicingInstanceStatus;
  }

  public void setServicingInstanceStatus(String servicingInstanceStatus) {
    this.servicingInstanceStatus = servicingInstanceStatus;
  }


}

