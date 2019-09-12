package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHROperationsRetrieveOutputModelHROperationsInstanceAnalysis;
import org.bian.dto.BQHROperationsRetrieveOutputModelHROperationsInstanceRecord;
import org.bian.dto.BQHROperationsRetrieveOutputModelHROperationsInstanceReport;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQHROperationsRetrieveOutputModel
 */
public class BQHROperationsRetrieveOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQHROperationsRetrieveOutputModelHROperationsInstanceRecord hROperationsInstanceRecord = null;

  private String hROperationsRetrieveActionTaskReference = null;

  private Object hROperationsRetrieveActionTaskRecord = null;

  private String hROperationsRetrieveActionResponse = null;

  private BQHROperationsRetrieveOutputModelHROperationsInstanceReport hROperationsInstanceReport = null;

  private BQHROperationsRetrieveOutputModelHROperationsInstanceAnalysis hROperationsInstanceAnalysis = null;


  /**
   * Get productServiceDeploymentProjectInstanceRecord
   * @return productServiceDeploymentProjectInstanceRecord
  **/

  public CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord getProductServiceDeploymentProjectInstanceRecord() {
    return productServiceDeploymentProjectInstanceRecord;
  }

  public void setProductServiceDeploymentProjectInstanceRecord(CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord) {
    this.productServiceDeploymentProjectInstanceRecord = productServiceDeploymentProjectInstanceRecord;
  }


  /**
   * Get hROperationsInstanceRecord
   * @return hROperationsInstanceRecord
  **/

  public BQHROperationsRetrieveOutputModelHROperationsInstanceRecord getHROperationsInstanceRecord() {
    return hROperationsInstanceRecord;
  }
   
  @JsonProperty("hROperationsInstanceRecord")
  public void setHROperationsInstanceRecord(BQHROperationsRetrieveOutputModelHROperationsInstanceRecord hROperationsInstanceRecord) {
    this.hROperationsInstanceRecord = hROperationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a HR Operations instance retrieve service call 
   * @return hROperationsRetrieveActionTaskReference
  **/

  public String getHROperationsRetrieveActionTaskReference() {
    return hROperationsRetrieveActionTaskReference;
  }
   
  @JsonProperty("hROperationsRetrieveActionTaskReference")
  public void setHROperationsRetrieveActionTaskReference(String hROperationsRetrieveActionTaskReference) {
    this.hROperationsRetrieveActionTaskReference = hROperationsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return hROperationsRetrieveActionTaskRecord
  **/

  public Object getHROperationsRetrieveActionTaskRecord() {
    return hROperationsRetrieveActionTaskRecord;
  }
  
  @JsonProperty("hROperationsRetrieveActionTaskRecord")
  public void setHROperationsRetrieveActionTaskRecord(Object hROperationsRetrieveActionTaskRecord) {
    this.hROperationsRetrieveActionTaskRecord = hROperationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return hROperationsRetrieveActionResponse
  **/

  public String getHROperationsRetrieveActionResponse() {
    return hROperationsRetrieveActionResponse;
  }
  
  @JsonProperty("hROperationsRetrieveActionResponse")
  public void setHROperationsRetrieveActionResponse(String hROperationsRetrieveActionResponse) {
    this.hROperationsRetrieveActionResponse = hROperationsRetrieveActionResponse;
  }


  /**
   * Get hROperationsInstanceReport
   * @return hROperationsInstanceReport
  **/

  public BQHROperationsRetrieveOutputModelHROperationsInstanceReport getHROperationsInstanceReport() {
    return hROperationsInstanceReport;
  }
  
  @JsonProperty("hROperationsInstanceReport")
  public void setHROperationsInstanceReport(BQHROperationsRetrieveOutputModelHROperationsInstanceReport hROperationsInstanceReport) {
    this.hROperationsInstanceReport = hROperationsInstanceReport;
  }


  /**
   * Get hROperationsInstanceAnalysis
   * @return hROperationsInstanceAnalysis
  **/

  public BQHROperationsRetrieveOutputModelHROperationsInstanceAnalysis getHROperationsInstanceAnalysis() {
    return hROperationsInstanceAnalysis;
  }
  
  @JsonProperty("hROperationsInstanceAnalysis")
  public void setHROperationsInstanceAnalysis(BQHROperationsRetrieveOutputModelHROperationsInstanceAnalysis hROperationsInstanceAnalysis) {
    this.hROperationsInstanceAnalysis = hROperationsInstanceAnalysis;
  }


}

