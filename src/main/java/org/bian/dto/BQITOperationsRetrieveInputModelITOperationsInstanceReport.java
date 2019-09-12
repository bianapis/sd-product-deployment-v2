package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITOperationsRetrieveInputModelITOperationsInstanceReport
 */
public class BQITOperationsRetrieveInputModelITOperationsInstanceReport   {
  private String iTOperationsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return iTOperationsInstanceReportReference
  **/

  public String getITOperationsInstanceReportReference() {
    return iTOperationsInstanceReportReference;
  }

  public void setITOperationsInstanceReportReference(String iTOperationsInstanceReportReference) {
    this.iTOperationsInstanceReportReference = iTOperationsInstanceReportReference;
  }


}

