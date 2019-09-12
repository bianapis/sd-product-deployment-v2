package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQITOperationsRetrieveInputModelITOperationsInstanceAnalysis;
import org.bian.dto.BQITOperationsRetrieveInputModelITOperationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQITOperationsRetrieveInputModel
 */
public class BQITOperationsRetrieveInputModel   {
  private Object iTOperationsRetrieveActionTaskRecord = null;

  private String iTOperationsRetrieveActionRequest = null;

  private BQITOperationsRetrieveInputModelITOperationsInstanceReport iTOperationsInstanceReport = null;

  private BQITOperationsRetrieveInputModelITOperationsInstanceAnalysis iTOperationsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return iTOperationsRetrieveActionTaskRecord
  **/

  public Object getITOperationsRetrieveActionTaskRecord() {
    return iTOperationsRetrieveActionTaskRecord;
  }

  public void setITOperationsRetrieveActionTaskRecord(Object iTOperationsRetrieveActionTaskRecord) {
    this.iTOperationsRetrieveActionTaskRecord = iTOperationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return iTOperationsRetrieveActionRequest
  **/

  public String getITOperationsRetrieveActionRequest() {
    return iTOperationsRetrieveActionRequest;
  }

  public void setITOperationsRetrieveActionRequest(String iTOperationsRetrieveActionRequest) {
    this.iTOperationsRetrieveActionRequest = iTOperationsRetrieveActionRequest;
  }


  /**
   * Get iTOperationsInstanceReport
   * @return iTOperationsInstanceReport
  **/

  public BQITOperationsRetrieveInputModelITOperationsInstanceReport getITOperationsInstanceReport() {
    return iTOperationsInstanceReport;
  }

  public void setITOperationsInstanceReport(BQITOperationsRetrieveInputModelITOperationsInstanceReport iTOperationsInstanceReport) {
    this.iTOperationsInstanceReport = iTOperationsInstanceReport;
  }


  /**
   * Get iTOperationsInstanceAnalysis
   * @return iTOperationsInstanceAnalysis
  **/

  public BQITOperationsRetrieveInputModelITOperationsInstanceAnalysis getITOperationsInstanceAnalysis() {
    return iTOperationsInstanceAnalysis;
  }

  public void setITOperationsInstanceAnalysis(BQITOperationsRetrieveInputModelITOperationsInstanceAnalysis iTOperationsInstanceAnalysis) {
    this.iTOperationsInstanceAnalysis = iTOperationsInstanceAnalysis;
  }


}

