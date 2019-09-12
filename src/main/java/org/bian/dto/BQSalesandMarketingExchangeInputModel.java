package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingExchangeInputModel
 */
public class BQSalesandMarketingExchangeInputModel   {
  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String salesandMarketingInstanceReference = null;

  private Object salesandMarketingExchangeActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest salesandMarketingExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Sales and Marketing instance 
   * @return salesandMarketingInstanceReference
  **/

  public String getSalesandMarketingInstanceReference() {
    return salesandMarketingInstanceReference;
  }

  public void setSalesandMarketingInstanceReference(String salesandMarketingInstanceReference) {
    this.salesandMarketingInstanceReference = salesandMarketingInstanceReference;
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
   * Get salesandMarketingExchangeActionRequest
   * @return salesandMarketingExchangeActionRequest
  **/

  public CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest getSalesandMarketingExchangeActionRequest() {
    return salesandMarketingExchangeActionRequest;
  }

  public void setSalesandMarketingExchangeActionRequest(CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest salesandMarketingExchangeActionRequest) {
    this.salesandMarketingExchangeActionRequest = salesandMarketingExchangeActionRequest;
  }


}

