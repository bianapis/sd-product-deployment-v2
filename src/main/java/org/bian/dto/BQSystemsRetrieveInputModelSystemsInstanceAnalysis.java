package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSystemsRetrieveInputModelSystemsInstanceAnalysis
 */
public class BQSystemsRetrieveInputModelSystemsInstanceAnalysis   {
  private String systemsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return systemsInstanceAnalysisReference
  **/

  public String getSystemsInstanceAnalysisReference() {
    return systemsInstanceAnalysisReference;
  }

  public void setSystemsInstanceAnalysisReference(String systemsInstanceAnalysisReference) {
    this.systemsInstanceAnalysisReference = systemsInstanceAnalysisReference;
  }


}

