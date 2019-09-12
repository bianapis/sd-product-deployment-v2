package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceReportRecord
 */
public class CRProductOrServiceDeploymentProjectRetrieveInputModelProductOrServiceDeploymentProjectInstanceReportRecord   {
  private String productOrServiceDeploymentProjectInstanceReportReference = null;

  private String productOrServiceDeploymentProjectInstanceReportType = null;

  private String productOrServiceDeploymentProjectInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productOrServiceDeploymentProjectInstanceReportReference
  **/

  public String getProductOrServiceDeploymentProjectInstanceReportReference() {
    return productOrServiceDeploymentProjectInstanceReportReference;
  }

  public void setProductOrServiceDeploymentProjectInstanceReportReference(String productOrServiceDeploymentProjectInstanceReportReference) {
    this.productOrServiceDeploymentProjectInstanceReportReference = productOrServiceDeploymentProjectInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productOrServiceDeploymentProjectInstanceReportParameters
  **/

  public String getProductOrServiceDeploymentProjectInstanceReportParameters() {
    return productOrServiceDeploymentProjectInstanceReportParameters;
  }

  public void setProductOrServiceDeploymentProjectInstanceReportParameters(String productOrServiceDeploymentProjectInstanceReportParameters) {
    this.productOrServiceDeploymentProjectInstanceReportParameters = productOrServiceDeploymentProjectInstanceReportParameters;
  }


}

