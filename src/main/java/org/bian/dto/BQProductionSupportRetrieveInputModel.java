package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionSupportRetrieveInputModelProductionSupportInstanceAnalysis;
import org.bian.dto.BQProductionSupportRetrieveInputModelProductionSupportInstanceRecord;
import org.bian.dto.BQProductionSupportRetrieveInputModelProductionSupportInstanceReport;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductionSupportRetrieveInputModel
 */
public class BQProductionSupportRetrieveInputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQProductionSupportRetrieveInputModelProductionSupportInstanceRecord productionSupportInstanceRecord = null;

  private Object productionSupportRetrieveActionTaskRecord = null;

  private String productionSupportRetrieveActionRequest = null;

  private BQProductionSupportRetrieveInputModelProductionSupportInstanceReport productionSupportInstanceReport = null;

  private BQProductionSupportRetrieveInputModelProductionSupportInstanceAnalysis productionSupportInstanceAnalysis = null;


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
   * Get productionSupportInstanceRecord
   * @return productionSupportInstanceRecord
  **/

  public BQProductionSupportRetrieveInputModelProductionSupportInstanceRecord getProductionSupportInstanceRecord() {
    return productionSupportInstanceRecord;
  }

  public void setProductionSupportInstanceRecord(BQProductionSupportRetrieveInputModelProductionSupportInstanceRecord productionSupportInstanceRecord) {
    this.productionSupportInstanceRecord = productionSupportInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productionSupportRetrieveActionTaskRecord
  **/

  public Object getProductionSupportRetrieveActionTaskRecord() {
    return productionSupportRetrieveActionTaskRecord;
  }

  public void setProductionSupportRetrieveActionTaskRecord(Object productionSupportRetrieveActionTaskRecord) {
    this.productionSupportRetrieveActionTaskRecord = productionSupportRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productionSupportRetrieveActionRequest
  **/

  public String getProductionSupportRetrieveActionRequest() {
    return productionSupportRetrieveActionRequest;
  }

  public void setProductionSupportRetrieveActionRequest(String productionSupportRetrieveActionRequest) {
    this.productionSupportRetrieveActionRequest = productionSupportRetrieveActionRequest;
  }


  /**
   * Get productionSupportInstanceReport
   * @return productionSupportInstanceReport
  **/

  public BQProductionSupportRetrieveInputModelProductionSupportInstanceReport getProductionSupportInstanceReport() {
    return productionSupportInstanceReport;
  }

  public void setProductionSupportInstanceReport(BQProductionSupportRetrieveInputModelProductionSupportInstanceReport productionSupportInstanceReport) {
    this.productionSupportInstanceReport = productionSupportInstanceReport;
  }


  /**
   * Get productionSupportInstanceAnalysis
   * @return productionSupportInstanceAnalysis
  **/

  public BQProductionSupportRetrieveInputModelProductionSupportInstanceAnalysis getProductionSupportInstanceAnalysis() {
    return productionSupportInstanceAnalysis;
  }

  public void setProductionSupportInstanceAnalysis(BQProductionSupportRetrieveInputModelProductionSupportInstanceAnalysis productionSupportInstanceAnalysis) {
    this.productionSupportInstanceAnalysis = productionSupportInstanceAnalysis;
  }


}

