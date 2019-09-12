package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionSupportRetrieveOutputModelProductionSupportInstanceAnalysis
 */
public class BQProductionSupportRetrieveOutputModelProductionSupportInstanceAnalysis   {
  private Object productionSupportInstanceAnalysisRecord = null;

  private String productionSupportInstanceAnalysisReportType = null;

  private String productionSupportInstanceAnalysisParameters = null;

  private Object productionSupportInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productionSupportInstanceAnalysisRecord
  **/

  public Object getProductionSupportInstanceAnalysisRecord() {
    return productionSupportInstanceAnalysisRecord;
  }

  public void setProductionSupportInstanceAnalysisRecord(Object productionSupportInstanceAnalysisRecord) {
    this.productionSupportInstanceAnalysisRecord = productionSupportInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productionSupportInstanceAnalysisReportType
  **/

  public String getProductionSupportInstanceAnalysisReportType() {
    return productionSupportInstanceAnalysisReportType;
  }

  public void setProductionSupportInstanceAnalysisReportType(String productionSupportInstanceAnalysisReportType) {
    this.productionSupportInstanceAnalysisReportType = productionSupportInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productionSupportInstanceAnalysisParameters
  **/

  public String getProductionSupportInstanceAnalysisParameters() {
    return productionSupportInstanceAnalysisParameters;
  }

  public void setProductionSupportInstanceAnalysisParameters(String productionSupportInstanceAnalysisParameters) {
    this.productionSupportInstanceAnalysisParameters = productionSupportInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return productionSupportInstanceAnalysisReport
  **/

  public Object getProductionSupportInstanceAnalysisReport() {
    return productionSupportInstanceAnalysisReport;
  }

  public void setProductionSupportInstanceAnalysisReport(Object productionSupportInstanceAnalysisReport) {
    this.productionSupportInstanceAnalysisReport = productionSupportInstanceAnalysisReport;
  }


}

