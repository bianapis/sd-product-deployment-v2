package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionSupportRetrieveOutputModelProductionSupportInstanceReport
 */
public class BQProductionSupportRetrieveOutputModelProductionSupportInstanceReport   {
  private Object productionSupportInstanceReportRecord = null;

  private String productionSupportInstanceReportType = null;

  private String productionSupportInstanceReportParameters = null;

  private Object productionSupportInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productionSupportInstanceReportRecord
  **/

  public Object getProductionSupportInstanceReportRecord() {
    return productionSupportInstanceReportRecord;
  }

  public void setProductionSupportInstanceReportRecord(Object productionSupportInstanceReportRecord) {
    this.productionSupportInstanceReportRecord = productionSupportInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productionSupportInstanceReportType
  **/

  public String getProductionSupportInstanceReportType() {
    return productionSupportInstanceReportType;
  }

  public void setProductionSupportInstanceReportType(String productionSupportInstanceReportType) {
    this.productionSupportInstanceReportType = productionSupportInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productionSupportInstanceReportParameters
  **/

  public String getProductionSupportInstanceReportParameters() {
    return productionSupportInstanceReportParameters;
  }

  public void setProductionSupportInstanceReportParameters(String productionSupportInstanceReportParameters) {
    this.productionSupportInstanceReportParameters = productionSupportInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productionSupportInstanceReport
  **/

  public Object getProductionSupportInstanceReport() {
    return productionSupportInstanceReport;
  }

  public void setProductionSupportInstanceReport(Object productionSupportInstanceReport) {
    this.productionSupportInstanceReport = productionSupportInstanceReport;
  }


}

