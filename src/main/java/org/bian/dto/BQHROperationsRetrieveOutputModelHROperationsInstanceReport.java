package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQHROperationsRetrieveOutputModelHROperationsInstanceReport
 */
public class BQHROperationsRetrieveOutputModelHROperationsInstanceReport   {
  private Object hROperationsInstanceReportRecord = null;

  private String hROperationsInstanceReportType = null;

  private String hROperationsInstanceReportParameters = null;

  private Object hROperationsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return hROperationsInstanceReportRecord
  **/

  public Object getHROperationsInstanceReportRecord() {
    return hROperationsInstanceReportRecord;
  }
   
  @JsonProperty("hROperationsInstanceReportRecord")
  public void setHROperationsInstanceReportRecord(Object hROperationsInstanceReportRecord) {
    this.hROperationsInstanceReportRecord = hROperationsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return hROperationsInstanceReportType
  **/

  public String getHROperationsInstanceReportType() {
    return hROperationsInstanceReportType;
  }
  
  @JsonProperty("hROperationsInstanceReportType")
  public void setHROperationsInstanceReportType(String hROperationsInstanceReportType) {
    this.hROperationsInstanceReportType = hROperationsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return hROperationsInstanceReportParameters
  **/

  public String getHROperationsInstanceReportParameters() {
    return hROperationsInstanceReportParameters;
  }
   @JsonProperty("hROperationsInstanceReportParameters")
  public void setHROperationsInstanceReportParameters(String hROperationsInstanceReportParameters) {
    this.hROperationsInstanceReportParameters = hROperationsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return hROperationsInstanceReport
  **/

  public Object getHROperationsInstanceReport() {
    return hROperationsInstanceReport;
  }
   
  @JsonProperty("hROperationsInstanceReport")
  public void setHROperationsInstanceReport(Object hROperationsInstanceReport) {
    this.hROperationsInstanceReport = hROperationsInstanceReport;
  }


}

