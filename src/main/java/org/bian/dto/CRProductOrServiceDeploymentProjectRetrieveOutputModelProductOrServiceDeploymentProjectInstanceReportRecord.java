package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceReportRecord
 */
public class CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceReportRecord   {
  private String productOrServiceDeploymentProjectInstanceReportData = null;

  private String productOrServiceDeploymentProjectInstanceReportType = null;

  private Object productOrServiceDeploymentProjectInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productOrServiceDeploymentProjectInstanceReportData
  **/

  public String getProductOrServiceDeploymentProjectInstanceReportData() {
    return productOrServiceDeploymentProjectInstanceReportData;
  }

  public void setProductOrServiceDeploymentProjectInstanceReportData(String productOrServiceDeploymentProjectInstanceReportData) {
    this.productOrServiceDeploymentProjectInstanceReportData = productOrServiceDeploymentProjectInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productOrServiceDeploymentProjectInstanceReportType
  **/

  public String getProductOrServiceDeploymentProjectInstanceReportType() {
    return productOrServiceDeploymentProjectInstanceReportType;
  }

  public void setProductOrServiceDeploymentProjectInstanceReportType(String productOrServiceDeploymentProjectInstanceReportType) {
    this.productOrServiceDeploymentProjectInstanceReportType = productOrServiceDeploymentProjectInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productOrServiceDeploymentProjectInstanceReport
  **/

  public Object getProductOrServiceDeploymentProjectInstanceReport() {
    return productOrServiceDeploymentProjectInstanceReport;
  }

  public void setProductOrServiceDeploymentProjectInstanceReport(Object productOrServiceDeploymentProjectInstanceReport) {
    this.productOrServiceDeploymentProjectInstanceReport = productOrServiceDeploymentProjectInstanceReport;
  }


}

