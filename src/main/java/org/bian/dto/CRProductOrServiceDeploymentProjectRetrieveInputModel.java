package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceAnalysis;
import org.bian.dto.CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectRetrieveInputModel
 */
public class CRProductOrServiceDeploymentProjectRetrieveInputModel   {
  private Object productOrServiceDeploymentProjectRetrieveActionTaskRecord = null;

  private String productOrServiceDeploymentProjectRetrieveActionRequest = null;

  private CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceReportRecord productOrServiceDeploymentProjectInstanceReportRecord = null;

  private CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceAnalysis productOrServiceDeploymentProjectInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productOrServiceDeploymentProjectRetrieveActionTaskRecord
  **/

  public Object getProductOrServiceDeploymentProjectRetrieveActionTaskRecord() {
    return productOrServiceDeploymentProjectRetrieveActionTaskRecord;
  }

  public void setProductOrServiceDeploymentProjectRetrieveActionTaskRecord(Object productOrServiceDeploymentProjectRetrieveActionTaskRecord) {
    this.productOrServiceDeploymentProjectRetrieveActionTaskRecord = productOrServiceDeploymentProjectRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productOrServiceDeploymentProjectRetrieveActionRequest
  **/

  public String getProductOrServiceDeploymentProjectRetrieveActionRequest() {
    return productOrServiceDeploymentProjectRetrieveActionRequest;
  }

  public void setProductOrServiceDeploymentProjectRetrieveActionRequest(String productOrServiceDeploymentProjectRetrieveActionRequest) {
    this.productOrServiceDeploymentProjectRetrieveActionRequest = productOrServiceDeploymentProjectRetrieveActionRequest;
  }


  /**
   * Get productOrServiceDeploymentProjectInstanceReportRecord
   * @return productOrServiceDeploymentProjectInstanceReportRecord
  **/

  public CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceReportRecord getProductOrServiceDeploymentProjectInstanceReportRecord() {
    return productOrServiceDeploymentProjectInstanceReportRecord;
  }

  public void setProductOrServiceDeploymentProjectInstanceReportRecord(CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceReportRecord productOrServiceDeploymentProjectInstanceReportRecord) {
    this.productOrServiceDeploymentProjectInstanceReportRecord = productOrServiceDeploymentProjectInstanceReportRecord;
  }


  /**
   * Get productOrServiceDeploymentProjectInstanceAnalysis
   * @return productOrServiceDeploymentProjectInstanceAnalysis
  **/

  public CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceAnalysis getProductOrServiceDeploymentProjectInstanceAnalysis() {
    return productOrServiceDeploymentProjectInstanceAnalysis;
  }

  public void setProductOrServiceDeploymentProjectInstanceAnalysis(CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceAnalysis productOrServiceDeploymentProjectInstanceAnalysis) {
    this.productOrServiceDeploymentProjectInstanceAnalysis = productOrServiceDeploymentProjectInstanceAnalysis;
  }


}

