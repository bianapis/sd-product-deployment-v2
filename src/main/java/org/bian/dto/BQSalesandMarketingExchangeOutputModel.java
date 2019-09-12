package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingExchangeOutputModel
 */
public class BQSalesandMarketingExchangeOutputModel   {
  private String salesandMarketingExchangeActionTaskReference = null;

  private Object salesandMarketingExchangeActionTaskRecord = null;

  private String salesandMarketingExchangeActionResponse = null;

  private String salesandMarketingInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales and Marketing instance exchange service call 
   * @return salesandMarketingExchangeActionTaskReference
  **/

  public String getSalesandMarketingExchangeActionTaskReference() {
    return salesandMarketingExchangeActionTaskReference;
  }

  public void setSalesandMarketingExchangeActionTaskReference(String salesandMarketingExchangeActionTaskReference) {
    this.salesandMarketingExchangeActionTaskReference = salesandMarketingExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return salesandMarketingExchangeActionTaskRecord
  **/

  public Object getSalesandMarketingExchangeActionTaskRecord() {
    return salesandMarketingExchangeActionTaskRecord;
  }

  public void setSalesandMarketingExchangeActionTaskRecord(Object salesandMarketingExchangeActionTaskRecord) {
    this.salesandMarketingExchangeActionTaskRecord = salesandMarketingExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return salesandMarketingExchangeActionResponse
  **/

  public String getSalesandMarketingExchangeActionResponse() {
    return salesandMarketingExchangeActionResponse;
  }

  public void setSalesandMarketingExchangeActionResponse(String salesandMarketingExchangeActionResponse) {
    this.salesandMarketingExchangeActionResponse = salesandMarketingExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Sales and Marketing instance (e.g. accepted, rejected, verified) 
   * @return salesandMarketingInstanceStatus
  **/

  public String getSalesandMarketingInstanceStatus() {
    return salesandMarketingInstanceStatus;
  }

  public void setSalesandMarketingInstanceStatus(String salesandMarketingInstanceStatus) {
    this.salesandMarketingInstanceStatus = salesandMarketingInstanceStatus;
  }


}

