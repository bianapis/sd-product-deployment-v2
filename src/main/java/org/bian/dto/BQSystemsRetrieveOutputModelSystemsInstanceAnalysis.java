package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSystemsRetrieveOutputModelSystemsInstanceAnalysis
 */
public class BQSystemsRetrieveOutputModelSystemsInstanceAnalysis   {
  private Object systemsInstanceAnalysisRecord = null;

  private String systemsInstanceAnalysisReportType = null;

  private String systemsInstanceAnalysisParameters = null;

  private Object systemsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return systemsInstanceAnalysisRecord
  **/

  public Object getSystemsInstanceAnalysisRecord() {
    return systemsInstanceAnalysisRecord;
  }

  public void setSystemsInstanceAnalysisRecord(Object systemsInstanceAnalysisRecord) {
    this.systemsInstanceAnalysisRecord = systemsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return systemsInstanceAnalysisReportType
  **/

  public String getSystemsInstanceAnalysisReportType() {
    return systemsInstanceAnalysisReportType;
  }

  public void setSystemsInstanceAnalysisReportType(String systemsInstanceAnalysisReportType) {
    this.systemsInstanceAnalysisReportType = systemsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return systemsInstanceAnalysisParameters
  **/

  public String getSystemsInstanceAnalysisParameters() {
    return systemsInstanceAnalysisParameters;
  }

  public void setSystemsInstanceAnalysisParameters(String systemsInstanceAnalysisParameters) {
    this.systemsInstanceAnalysisParameters = systemsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return systemsInstanceAnalysisReport
  **/

  public Object getSystemsInstanceAnalysisReport() {
    return systemsInstanceAnalysisReport;
  }

  public void setSystemsInstanceAnalysisReport(Object systemsInstanceAnalysisReport) {
    this.systemsInstanceAnalysisReport = systemsInstanceAnalysisReport;
  }


}

