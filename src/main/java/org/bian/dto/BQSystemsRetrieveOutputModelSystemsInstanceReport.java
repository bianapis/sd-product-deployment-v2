package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSystemsRetrieveOutputModelSystemsInstanceReport
 */
public class BQSystemsRetrieveOutputModelSystemsInstanceReport   {
  private Object systemsInstanceReportRecord = null;

  private String systemsInstanceReportType = null;

  private String systemsInstanceReportParameters = null;

  private Object systemsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return systemsInstanceReportRecord
  **/

  public Object getSystemsInstanceReportRecord() {
    return systemsInstanceReportRecord;
  }

  public void setSystemsInstanceReportRecord(Object systemsInstanceReportRecord) {
    this.systemsInstanceReportRecord = systemsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return systemsInstanceReportType
  **/

  public String getSystemsInstanceReportType() {
    return systemsInstanceReportType;
  }

  public void setSystemsInstanceReportType(String systemsInstanceReportType) {
    this.systemsInstanceReportType = systemsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return systemsInstanceReportParameters
  **/

  public String getSystemsInstanceReportParameters() {
    return systemsInstanceReportParameters;
  }

  public void setSystemsInstanceReportParameters(String systemsInstanceReportParameters) {
    this.systemsInstanceReportParameters = systemsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return systemsInstanceReport
  **/

  public Object getSystemsInstanceReport() {
    return systemsInstanceReport;
  }

  public void setSystemsInstanceReport(Object systemsInstanceReport) {
    this.systemsInstanceReport = systemsInstanceReport;
  }


}

