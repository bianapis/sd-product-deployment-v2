package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceAnalysis
 */
public class CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceAnalysis   {
  private String productOrServiceDeploymentProjectInstanceAnalysisData = null;

  private String productOrServiceDeploymentProjectInstanceAnalysisReportType = null;

  private Object productOrServiceDeploymentProjectInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productOrServiceDeploymentProjectInstanceAnalysisData
  **/

  public String getProductOrServiceDeploymentProjectInstanceAnalysisData() {
    return productOrServiceDeploymentProjectInstanceAnalysisData;
  }

  public void setProductOrServiceDeploymentProjectInstanceAnalysisData(String productOrServiceDeploymentProjectInstanceAnalysisData) {
    this.productOrServiceDeploymentProjectInstanceAnalysisData = productOrServiceDeploymentProjectInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productOrServiceDeploymentProjectInstanceAnalysisReportType
  **/

  public String getProductOrServiceDeploymentProjectInstanceAnalysisReportType() {
    return productOrServiceDeploymentProjectInstanceAnalysisReportType;
  }

  public void setProductOrServiceDeploymentProjectInstanceAnalysisReportType(String productOrServiceDeploymentProjectInstanceAnalysisReportType) {
    this.productOrServiceDeploymentProjectInstanceAnalysisReportType = productOrServiceDeploymentProjectInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productOrServiceDeploymentProjectInstanceAnalysisReport
  **/

  public Object getProductOrServiceDeploymentProjectInstanceAnalysisReport() {
    return productOrServiceDeploymentProjectInstanceAnalysisReport;
  }

  public void setProductOrServiceDeploymentProjectInstanceAnalysisReport(Object productOrServiceDeploymentProjectInstanceAnalysisReport) {
    this.productOrServiceDeploymentProjectInstanceAnalysisReport = productOrServiceDeploymentProjectInstanceAnalysisReport;
  }


}

