package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITOperationsRetrieveOutputModelITOperationsInstanceAnalysis
 */
public class BQITOperationsRetrieveOutputModelITOperationsInstanceAnalysis   {
  private Object iTOperationsInstanceAnalysisRecord = null;

  private String iTOperationsInstanceAnalysisReportType = null;

  private String iTOperationsInstanceAnalysisParameters = null;

  private Object iTOperationsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return iTOperationsInstanceAnalysisRecord
  **/

  public Object getITOperationsInstanceAnalysisRecord() {
    return iTOperationsInstanceAnalysisRecord;
  }
     
  @JsonProperty("iTOperationsInstanceAnalysisRecord")
  public void setITOperationsInstanceAnalysisRecord(Object iTOperationsInstanceAnalysisRecord) {
    this.iTOperationsInstanceAnalysisRecord = iTOperationsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return iTOperationsInstanceAnalysisReportType
  **/

  public String getITOperationsInstanceAnalysisReportType() {
    return iTOperationsInstanceAnalysisReportType;
  }
  
  @JsonProperty("iTOperationsInstanceAnalysisReportType")
  public void setITOperationsInstanceAnalysisReportType(String iTOperationsInstanceAnalysisReportType) {
    this.iTOperationsInstanceAnalysisReportType = iTOperationsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return iTOperationsInstanceAnalysisParameters
  **/

  public String getITOperationsInstanceAnalysisParameters() {
    return iTOperationsInstanceAnalysisParameters;
  }
 
  @JsonProperty("iTOperationsInstanceAnalysisParameters")
  public void setITOperationsInstanceAnalysisParameters(String iTOperationsInstanceAnalysisParameters) {
    this.iTOperationsInstanceAnalysisParameters = iTOperationsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return iTOperationsInstanceAnalysisReport
  **/

  public Object getITOperationsInstanceAnalysisReport() {
    return iTOperationsInstanceAnalysisReport;
  }
  
  @JsonProperty("iTOperationsInstanceAnalysisReport")
  public void setITOperationsInstanceAnalysisReport(Object iTOperationsInstanceAnalysisReport) {
    this.iTOperationsInstanceAnalysisReport = iTOperationsInstanceAnalysisReport;
  }


}

