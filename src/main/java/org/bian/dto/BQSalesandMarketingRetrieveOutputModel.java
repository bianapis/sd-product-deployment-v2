package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceAnalysis;
import org.bian.dto.BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceRecord;
import org.bian.dto.BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceReport;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingRetrieveOutputModel
 */
public class BQSalesandMarketingRetrieveOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord = null;

  private String salesandMarketingRetrieveActionTaskReference = null;

  private Object salesandMarketingRetrieveActionTaskRecord = null;

  private String salesandMarketingRetrieveActionResponse = null;

  private BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceReport salesandMarketingInstanceReport = null;

  private BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceAnalysis salesandMarketingInstanceAnalysis = null;


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
   * Get salesandMarketingInstanceRecord
   * @return salesandMarketingInstanceRecord
  **/

  public BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceRecord getSalesandMarketingInstanceRecord() {
    return salesandMarketingInstanceRecord;
  }

  public void setSalesandMarketingInstanceRecord(BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceRecord salesandMarketingInstanceRecord) {
    this.salesandMarketingInstanceRecord = salesandMarketingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales and Marketing instance retrieve service call 
   * @return salesandMarketingRetrieveActionTaskReference
  **/

  public String getSalesandMarketingRetrieveActionTaskReference() {
    return salesandMarketingRetrieveActionTaskReference;
  }

  public void setSalesandMarketingRetrieveActionTaskReference(String salesandMarketingRetrieveActionTaskReference) {
    this.salesandMarketingRetrieveActionTaskReference = salesandMarketingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return salesandMarketingRetrieveActionTaskRecord
  **/

  public Object getSalesandMarketingRetrieveActionTaskRecord() {
    return salesandMarketingRetrieveActionTaskRecord;
  }

  public void setSalesandMarketingRetrieveActionTaskRecord(Object salesandMarketingRetrieveActionTaskRecord) {
    this.salesandMarketingRetrieveActionTaskRecord = salesandMarketingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return salesandMarketingRetrieveActionResponse
  **/

  public String getSalesandMarketingRetrieveActionResponse() {
    return salesandMarketingRetrieveActionResponse;
  }

  public void setSalesandMarketingRetrieveActionResponse(String salesandMarketingRetrieveActionResponse) {
    this.salesandMarketingRetrieveActionResponse = salesandMarketingRetrieveActionResponse;
  }


  /**
   * Get salesandMarketingInstanceReport
   * @return salesandMarketingInstanceReport
  **/

  public BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceReport getSalesandMarketingInstanceReport() {
    return salesandMarketingInstanceReport;
  }

  public void setSalesandMarketingInstanceReport(BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceReport salesandMarketingInstanceReport) {
    this.salesandMarketingInstanceReport = salesandMarketingInstanceReport;
  }


  /**
   * Get salesandMarketingInstanceAnalysis
   * @return salesandMarketingInstanceAnalysis
  **/

  public BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceAnalysis getSalesandMarketingInstanceAnalysis() {
    return salesandMarketingInstanceAnalysis;
  }

  public void setSalesandMarketingInstanceAnalysis(BQSalesandMarketingRetrieveOutputModelSalesandMarketingInstanceAnalysis salesandMarketingInstanceAnalysis) {
    this.salesandMarketingInstanceAnalysis = salesandMarketingInstanceAnalysis;
  }


}

