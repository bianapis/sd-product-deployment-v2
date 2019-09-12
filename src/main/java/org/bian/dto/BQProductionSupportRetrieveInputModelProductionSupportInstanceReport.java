package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionSupportRetrieveInputModelProductionSupportInstanceReport
 */
public class BQProductionSupportRetrieveInputModelProductionSupportInstanceReport   {
  private String productionSupportInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productionSupportInstanceReportReference
  **/

  public String getProductionSupportInstanceReportReference() {
    return productionSupportInstanceReportReference;
  }

  public void setProductionSupportInstanceReportReference(String productionSupportInstanceReportReference) {
    this.productionSupportInstanceReportReference = productionSupportInstanceReportReference;
  }


}

