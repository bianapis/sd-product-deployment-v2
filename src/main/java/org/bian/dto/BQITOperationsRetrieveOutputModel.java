package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQITOperationsRetrieveOutputModelITOperationsInstanceAnalysis;
import org.bian.dto.BQITOperationsRetrieveOutputModelITOperationsInstanceRecord;
import org.bian.dto.BQITOperationsRetrieveOutputModelITOperationsInstanceReport;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQITOperationsRetrieveOutputModel
 */
public class BQITOperationsRetrieveOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQITOperationsRetrieveOutputModelITOperationsInstanceRecord iTOperationsInstanceRecord = null;

  private String iTOperationsRetrieveActionTaskReference = null;

  private Object iTOperationsRetrieveActionTaskRecord = null;

  private String iTOperationsRetrieveActionResponse = null;

  private BQITOperationsRetrieveOutputModelITOperationsInstanceReport iTOperationsInstanceReport = null;

  private BQITOperationsRetrieveOutputModelITOperationsInstanceAnalysis iTOperationsInstanceAnalysis = null;


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
   * Get iTOperationsInstanceRecord
   * @return iTOperationsInstanceRecord
  **/

  public BQITOperationsRetrieveOutputModelITOperationsInstanceRecord getITOperationsInstanceRecord() {
    return iTOperationsInstanceRecord;
  }
  
  @JsonProperty("iTOperationsInstanceRecord")
  public void setITOperationsInstanceRecord(BQITOperationsRetrieveOutputModelITOperationsInstanceRecord iTOperationsInstanceRecord) {
    this.iTOperationsInstanceRecord = iTOperationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT Operations instance retrieve service call 
   * @return iTOperationsRetrieveActionTaskReference
  **/

  public String getITOperationsRetrieveActionTaskReference() {
    return iTOperationsRetrieveActionTaskReference;
  }
  
  @JsonProperty("iTOperationsRetrieveActionTaskReference")
  public void setITOperationsRetrieveActionTaskReference(String iTOperationsRetrieveActionTaskReference) {
    this.iTOperationsRetrieveActionTaskReference = iTOperationsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return iTOperationsRetrieveActionTaskRecord
  **/

  public Object getITOperationsRetrieveActionTaskRecord() {
    return iTOperationsRetrieveActionTaskRecord;
  }
  
  @JsonProperty("iTOperationsRetrieveActionTaskRecord")
  public void setITOperationsRetrieveActionTaskRecord(Object iTOperationsRetrieveActionTaskRecord) {
    this.iTOperationsRetrieveActionTaskRecord = iTOperationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return iTOperationsRetrieveActionResponse
  **/

  public String getITOperationsRetrieveActionResponse() {
    return iTOperationsRetrieveActionResponse;
  }
   
  @JsonProperty("iTOperationsRetrieveActionResponse")
  public void setITOperationsRetrieveActionResponse(String iTOperationsRetrieveActionResponse) {
    this.iTOperationsRetrieveActionResponse = iTOperationsRetrieveActionResponse;
  }


  /**
   * Get iTOperationsInstanceReport
   * @return iTOperationsInstanceReport
  **/

  public BQITOperationsRetrieveOutputModelITOperationsInstanceReport getITOperationsInstanceReport() {
    return iTOperationsInstanceReport;
  }
  
  @JsonProperty("iTOperationsInstanceReport")
  public void setITOperationsInstanceReport(BQITOperationsRetrieveOutputModelITOperationsInstanceReport iTOperationsInstanceReport) {
    this.iTOperationsInstanceReport = iTOperationsInstanceReport;
  }


  /**
   * Get iTOperationsInstanceAnalysis
   * @return iTOperationsInstanceAnalysis
  **/

  public BQITOperationsRetrieveOutputModelITOperationsInstanceAnalysis getITOperationsInstanceAnalysis() {
    return iTOperationsInstanceAnalysis;
  }
   
  @JsonProperty("")
  public void iTOperationsInstanceAnalysis(BQITOperationsRetrieveOutputModelITOperationsInstanceAnalysis iTOperationsInstanceAnalysis) {
    this.iTOperationsInstanceAnalysis = iTOperationsInstanceAnalysis;
  }

}

