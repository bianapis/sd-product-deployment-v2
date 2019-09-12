package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesandMarketingRequestInputModelSalesandMarketingInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingRequestInputModel
 */
public class BQSalesandMarketingRequestInputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String salesandMarketingInstanceReference = null;

  private BQSalesandMarketingRequestInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord = null;

  private Object salesandMarketingRequestActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQSalesandMarketingRequestInputModelSalesandMarketingInstanceRecord getSalesandMarketingInstanceRecord() {
    return salesandMarketingInstanceRecord;
  }

  public void setSalesandMarketingInstanceRecord(BQSalesandMarketingRequestInputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord) {
    this.salesandMarketingInstanceRecord = salesandMarketingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return salesandMarketingRequestActionTaskRecord
  **/

  public Object getSalesandMarketingRequestActionTaskRecord() {
    return salesandMarketingRequestActionTaskRecord;
  }

  public void setSalesandMarketingRequestActionTaskRecord(Object salesandMarketingRequestActionTaskRecord) {
    this.salesandMarketingRequestActionTaskRecord = salesandMarketingRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

