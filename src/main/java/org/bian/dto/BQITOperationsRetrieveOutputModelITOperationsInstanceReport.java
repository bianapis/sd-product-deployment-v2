package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITOperationsRetrieveOutputModelITOperationsInstanceReport
 */
public class BQITOperationsRetrieveOutputModelITOperationsInstanceReport   {
  private Object iTOperationsInstanceReportRecord = null;

  private String iTOperationsInstanceReportType = null;

  private String iTOperationsInstanceReportParameters = null;

  private Object iTOperationsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return iTOperationsInstanceReportRecord
  **/

  public Object getITOperationsInstanceReportRecord() {
    return iTOperationsInstanceReportRecord;
  }
  
  @JsonProperty("iTOperationsInstanceReportRecord")
  public void setITOperationsInstanceReportRecord(Object iTOperationsInstanceReportRecord) {
    this.iTOperationsInstanceReportRecord = iTOperationsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return iTOperationsInstanceReportType
  **/

  public String getITOperationsInstanceReportType() {
    return iTOperationsInstanceReportType;
  } 
  
  @JsonProperty("iTOperationsInstanceReportType")
  public void setITOperationsInstanceReportType(String iTOperationsInstanceReportType) {
    this.iTOperationsInstanceReportType = iTOperationsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return iTOperationsInstanceReportParameters
  **/

  public String getITOperationsInstanceReportParameters() {
    return iTOperationsInstanceReportParameters;
  }
  
  @JsonProperty("iTOperationsInstanceReportParameters")
  public void setITOperationsInstanceReportParameters(String iTOperationsInstanceReportParameters) {
    this.iTOperationsInstanceReportParameters = iTOperationsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return iTOperationsInstanceReport
  **/

  public Object getITOperationsInstanceReport() {
    return iTOperationsInstanceReport;
  }
  
  @JsonProperty("iTOperationsInstanceReport")
  public void setITOperationsInstanceReport(Object iTOperationsInstanceReport) {
    this.iTOperationsInstanceReport = iTOperationsInstanceReport;
  }


}

