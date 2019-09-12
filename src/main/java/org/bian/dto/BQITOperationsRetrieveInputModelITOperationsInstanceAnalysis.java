package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITOperationsRetrieveInputModelITOperationsInstanceAnalysis
 */
public class BQITOperationsRetrieveInputModelITOperationsInstanceAnalysis   {
  private String iTOperationsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return iTOperationsInstanceAnalysisReference
  **/

  public String getITOperationsInstanceAnalysisReference() {
    return iTOperationsInstanceAnalysisReference;
  }

  public void setITOperationsInstanceAnalysisReference(String iTOperationsInstanceAnalysisReference) {
    this.iTOperationsInstanceAnalysisReference = iTOperationsInstanceAnalysisReference;
  }


}

