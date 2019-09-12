package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHROperationsRetrieveInputModelHROperationsInstanceAnalysis;
import org.bian.dto.BQHROperationsRetrieveInputModelHROperationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQHROperationsRetrieveInputModel
 */
public class BQHROperationsRetrieveInputModel   {
  private Object hROperationsRetrieveActionTaskRecord = null;

  private String hROperationsRetrieveActionRequest = null;

  private BQHROperationsRetrieveInputModelHROperationsInstanceReport hROperationsInstanceReport = null;

  private BQHROperationsRetrieveInputModelHROperationsInstanceAnalysis hROperationsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return hROperationsRetrieveActionTaskRecord
  **/

  public Object getHROperationsRetrieveActionTaskRecord() {
    return hROperationsRetrieveActionTaskRecord;
  }

  public void setHROperationsRetrieveActionTaskRecord(Object hROperationsRetrieveActionTaskRecord) {
    this.hROperationsRetrieveActionTaskRecord = hROperationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return hROperationsRetrieveActionRequest
  **/

  public String getHROperationsRetrieveActionRequest() {
    return hROperationsRetrieveActionRequest;
  }

  public void setHROperationsRetrieveActionRequest(String hROperationsRetrieveActionRequest) {
    this.hROperationsRetrieveActionRequest = hROperationsRetrieveActionRequest;
  }


  /**
   * Get hROperationsInstanceReport
   * @return hROperationsInstanceReport
  **/

  public BQHROperationsRetrieveInputModelHROperationsInstanceReport getHROperationsInstanceReport() {
    return hROperationsInstanceReport;
  }

  public void setHROperationsInstanceReport(BQHROperationsRetrieveInputModelHROperationsInstanceReport hROperationsInstanceReport) {
    this.hROperationsInstanceReport = hROperationsInstanceReport;
  }


  /**
   * Get hROperationsInstanceAnalysis
   * @return hROperationsInstanceAnalysis
  **/

  public BQHROperationsRetrieveInputModelHROperationsInstanceAnalysis getHROperationsInstanceAnalysis() {
    return hROperationsInstanceAnalysis;
  }

  public void setHROperationsInstanceAnalysis(BQHROperationsRetrieveInputModelHROperationsInstanceAnalysis hROperationsInstanceAnalysis) {
    this.hROperationsInstanceAnalysis = hROperationsInstanceAnalysis;
  }


}

