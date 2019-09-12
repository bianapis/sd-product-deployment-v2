package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQHROperationsRetrieveInputModelHROperationsInstanceReport
 */
public class BQHROperationsRetrieveInputModelHROperationsInstanceReport   {
  private String hROperationsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return hROperationsInstanceReportReference
  **/

  public String getHROperationsInstanceReportReference() {
    return hROperationsInstanceReportReference;
  }

  public void setHROperationsInstanceReportReference(String hROperationsInstanceReportReference) {
    this.hROperationsInstanceReportReference = hROperationsInstanceReportReference;
  }


}

