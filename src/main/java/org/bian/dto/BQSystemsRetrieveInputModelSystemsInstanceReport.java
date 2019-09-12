package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSystemsRetrieveInputModelSystemsInstanceReport
 */
public class BQSystemsRetrieveInputModelSystemsInstanceReport   {
  private String systemsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return systemsInstanceReportReference
  **/

  public String getSystemsInstanceReportReference() {
    return systemsInstanceReportReference;
  }

  public void setSystemsInstanceReportReference(String systemsInstanceReportReference) {
    this.systemsInstanceReportReference = systemsInstanceReportReference;
  }


}

