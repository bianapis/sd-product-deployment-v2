package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceAnalysis
 */
public class CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceAnalysis   {
  private String productOrServiceDeploymentProjectInstanceAnalysisReference = null;

  private String productOrServiceDeploymentProjectInstanceAnalysisReportType = null;

  private String productOrServiceDeploymentProjectInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productOrServiceDeploymentProjectInstanceAnalysisReference
  **/

  public String getProductOrServiceDeploymentProjectInstanceAnalysisReference() {
    return productOrServiceDeploymentProjectInstanceAnalysisReference;
  }

  public void setProductOrServiceDeploymentProjectInstanceAnalysisReference(String productOrServiceDeploymentProjectInstanceAnalysisReference) {
    this.productOrServiceDeploymentProjectInstanceAnalysisReference = productOrServiceDeploymentProjectInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productOrServiceDeploymentProjectInstanceAnalysisParameters
  **/

  public String getProductOrServiceDeploymentProjectInstanceAnalysisParameters() {
    return productOrServiceDeploymentProjectInstanceAnalysisParameters;
  }

  public void setProductOrServiceDeploymentProjectInstanceAnalysisParameters(String productOrServiceDeploymentProjectInstanceAnalysisParameters) {
    this.productOrServiceDeploymentProjectInstanceAnalysisParameters = productOrServiceDeploymentProjectInstanceAnalysisParameters;
  }


}

