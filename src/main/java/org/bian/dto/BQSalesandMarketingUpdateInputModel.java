package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingUpdateInputModel
 */
public class BQSalesandMarketingUpdateInputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String salesandMarketingInstanceReference = null;

  private BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord = null;

  private Object salesandMarketingUpdateActionTaskRecord = null;

  private String salesandMarketingUpdateActionRequest = null;


  /**
   * Get productServiceDeploymentProjectInstanceRecord
   * @return productServiceDeploymentProjectInstanceRecord
  **/

  public CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord getProductServiceDeploymentProjectInstanceRecord() {
    return productServiceDeploymentProjectInstanceRecord;
  }

  public void setProductServiceDeploymentProjectInstanceRecord(CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord) {
    this.productServiceDeploymentProjectInstanceRecord = productServiceDeploymentProjectInstanceRecord;
  }


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
   * Get salesandMarketingInstanceRecord
   * @return salesandMarketingInstanceRecord
  **/

  public BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecord getSalesandMarketingInstanceRecord() {
    return salesandMarketingInstanceRecord;
  }

  public void setSalesandMarketingInstanceRecord(BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord) {
    this.salesandMarketingInstanceRecord = salesandMarketingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return salesandMarketingUpdateActionTaskRecord
  **/

  public Object getSalesandMarketingUpdateActionTaskRecord() {
    return salesandMarketingUpdateActionTaskRecord;
  }

  public void setSalesandMarketingUpdateActionTaskRecord(Object salesandMarketingUpdateActionTaskRecord) {
    this.salesandMarketingUpdateActionTaskRecord = salesandMarketingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return salesandMarketingUpdateActionRequest
  **/

  public String getSalesandMarketingUpdateActionRequest() {
    return salesandMarketingUpdateActionRequest;
  }

  public void setSalesandMarketingUpdateActionRequest(String salesandMarketingUpdateActionRequest) {
    this.salesandMarketingUpdateActionRequest = salesandMarketingUpdateActionRequest;
  }


}

