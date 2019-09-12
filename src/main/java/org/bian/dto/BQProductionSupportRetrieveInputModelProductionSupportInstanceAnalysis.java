package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionSupportRetrieveInputModelProductionSupportInstanceAnalysis
 */
public class BQProductionSupportRetrieveInputModelProductionSupportInstanceAnalysis   {
  private String productionSupportInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productionSupportInstanceAnalysisReference
  **/

  public String getProductionSupportInstanceAnalysisReference() {
    return productionSupportInstanceAnalysisReference;
  }

  public void setProductionSupportInstanceAnalysisReference(String productionSupportInstanceAnalysisReference) {
    this.productionSupportInstanceAnalysisReference = productionSupportInstanceAnalysisReference;
  }


}

