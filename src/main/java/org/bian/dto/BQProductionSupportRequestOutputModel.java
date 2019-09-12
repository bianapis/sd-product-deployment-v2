package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionSupportRequestOutputModel
 */
public class BQProductionSupportRequestOutputModel   {
  private String productionSupportRequestActionTaskReference = null;

  private Object productionSupportRequestActionTaskRecord = null;

  private String productionSupportRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production Support instance request service call 
   * @return productionSupportRequestActionTaskReference
  **/

  public String getProductionSupportRequestActionTaskReference() {
    return productionSupportRequestActionTaskReference;
  }

  public void setProductionSupportRequestActionTaskReference(String productionSupportRequestActionTaskReference) {
    this.productionSupportRequestActionTaskReference = productionSupportRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productionSupportRequestActionTaskRecord
  **/

  public Object getProductionSupportRequestActionTaskRecord() {
    return productionSupportRequestActionTaskRecord;
  }

  public void setProductionSupportRequestActionTaskRecord(Object productionSupportRequestActionTaskRecord) {
    this.productionSupportRequestActionTaskRecord = productionSupportRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production Support service request record 
   * @return productionSupportRequestRecordReference
  **/

  public String getProductionSupportRequestRecordReference() {
    return productionSupportRequestRecordReference;
  }

  public void setProductionSupportRequestRecordReference(String productionSupportRequestRecordReference) {
    this.productionSupportRequestRecordReference = productionSupportRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

