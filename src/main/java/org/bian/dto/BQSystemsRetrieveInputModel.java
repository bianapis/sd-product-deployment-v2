package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSystemsRetrieveInputModelSystemsInstanceAnalysis;
import org.bian.dto.BQSystemsRetrieveInputModelSystemsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSystemsRetrieveInputModel
 */
public class BQSystemsRetrieveInputModel   {
  private Object systemsRetrieveActionTaskRecord = null;

  private String systemsRetrieveActionRequest = null;

  private BQSystemsRetrieveInputModelSystemsInstanceReport systemsInstanceReport = null;

  private BQSystemsRetrieveInputModelSystemsInstanceAnalysis systemsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return systemsRetrieveActionTaskRecord
  **/

  public Object getSystemsRetrieveActionTaskRecord() {
    return systemsRetrieveActionTaskRecord;
  }

  public void setSystemsRetrieveActionTaskRecord(Object systemsRetrieveActionTaskRecord) {
    this.systemsRetrieveActionTaskRecord = systemsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return systemsRetrieveActionRequest
  **/

  public String getSystemsRetrieveActionRequest() {
    return systemsRetrieveActionRequest;
  }

  public void setSystemsRetrieveActionRequest(String systemsRetrieveActionRequest) {
    this.systemsRetrieveActionRequest = systemsRetrieveActionRequest;
  }


  /**
   * Get systemsInstanceReport
   * @return systemsInstanceReport
  **/

  public BQSystemsRetrieveInputModelSystemsInstanceReport getSystemsInstanceReport() {
    return systemsInstanceReport;
  }

  public void setSystemsInstanceReport(BQSystemsRetrieveInputModelSystemsInstanceReport systemsInstanceReport) {
    this.systemsInstanceReport = systemsInstanceReport;
  }


  /**
   * Get systemsInstanceAnalysis
   * @return systemsInstanceAnalysis
  **/

  public BQSystemsRetrieveInputModelSystemsInstanceAnalysis getSystemsInstanceAnalysis() {
    return systemsInstanceAnalysis;
  }

  public void setSystemsInstanceAnalysis(BQSystemsRetrieveInputModelSystemsInstanceAnalysis systemsInstanceAnalysis) {
    this.systemsInstanceAnalysis = systemsInstanceAnalysis;
  }


}

