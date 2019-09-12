package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQHROperationsRetrieveOutputModelHROperationsInstanceAnalysis
 */
public class BQHROperationsRetrieveOutputModelHROperationsInstanceAnalysis   {
  private Object hROperationsInstanceAnalysisRecord = null;

  private String hROperationsInstanceAnalysisReportType = null;

  private String hROperationsInstanceAnalysisParameters = null;

  private Object hROperationsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return hROperationsInstanceAnalysisRecord
  **/

  public Object getHROperationsInstanceAnalysisRecord() {
    return hROperationsInstanceAnalysisRecord;
  }
   
  @JsonProperty("hROperationsInstanceAnalysisRecord")
  public void setHROperationsInstanceAnalysisRecord(Object hROperationsInstanceAnalysisRecord) {
    this.hROperationsInstanceAnalysisRecord = hROperationsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return hROperationsInstanceAnalysisReportType
  **/

  public String getHROperationsInstanceAnalysisReportType() {
    return hROperationsInstanceAnalysisReportType;
  }
 @JsonProperty("hROperationsInstanceAnalysisReportType")
  public void setHROperationsInstanceAnalysisReportType(String hROperationsInstanceAnalysisReportType) {
    this.hROperationsInstanceAnalysisReportType = hROperationsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return hROperationsInstanceAnalysisParameters
  **/

  public String getHROperationsInstanceAnalysisParameters() {
    return hROperationsInstanceAnalysisParameters;
  }
  
  @JsonProperty("hROperationsInstanceAnalysisParameters")
  public void setHROperationsInstanceAnalysisParameters(String hROperationsInstanceAnalysisParameters) {
    this.hROperationsInstanceAnalysisParameters = hROperationsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return hROperationsInstanceAnalysisReport
  **/

  public Object getHROperationsInstanceAnalysisReport() {
    return hROperationsInstanceAnalysisReport;
  }
   
  @JsonProperty("hROperationsInstanceAnalysisReport")
  public void setHROperationsInstanceAnalysisReport(Object hROperationsInstanceAnalysisReport) {
    this.hROperationsInstanceAnalysisReport = hROperationsInstanceAnalysisReport;
  }


}

