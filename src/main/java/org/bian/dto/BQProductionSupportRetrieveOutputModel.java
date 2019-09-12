package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionSupportRetrieveInputModelProductionSupportInstanceRecord;
import org.bian.dto.BQProductionSupportRetrieveOutputModelProductionSupportInstanceAnalysis;
import org.bian.dto.BQProductionSupportRetrieveOutputModelProductionSupportInstanceReport;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductionSupportRetrieveOutputModel
 */
public class BQProductionSupportRetrieveOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQProductionSupportRetrieveInputModelProductionSupportInstanceRecord productionSupportInstanceRecord = null;

  private String productionSupportRetrieveActionTaskReference = null;

  private Object productionSupportRetrieveActionTaskRecord = null;

  private String productionSupportRetrieveActionResponse = null;

  private BQProductionSupportRetrieveOutputModelProductionSupportInstanceReport productionSupportInstanceReport = null;

  private BQProductionSupportRetrieveOutputModelProductionSupportInstanceAnalysis productionSupportInstanceAnalysis = null;


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
   * Get productionSupportInstanceRecord
   * @return productionSupportInstanceRecord
  **/

  public BQProductionSupportRetrieveInputModelProductionSupportInstanceRecord getProductionSupportInstanceRecord() {
    return productionSupportInstanceRecord;
  }

  public void setProductionSupportInstanceRecord(BQProductionSupportRetrieveInputModelProductionSupportInstanceRecord productionSupportInstanceRecord) {
    this.productionSupportInstanceRecord = productionSupportInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production Support instance retrieve service call 
   * @return productionSupportRetrieveActionTaskReference
  **/

  public String getProductionSupportRetrieveActionTaskReference() {
    return productionSupportRetrieveActionTaskReference;
  }

  public void setProductionSupportRetrieveActionTaskReference(String productionSupportRetrieveActionTaskReference) {
    this.productionSupportRetrieveActionTaskReference = productionSupportRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productionSupportRetrieveActionTaskRecord
  **/

  public Object getProductionSupportRetrieveActionTaskRecord() {
    return productionSupportRetrieveActionTaskRecord;
  }

  public void setProductionSupportRetrieveActionTaskRecord(Object productionSupportRetrieveActionTaskRecord) {
    this.productionSupportRetrieveActionTaskRecord = productionSupportRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productionSupportRetrieveActionResponse
  **/

  public String getProductionSupportRetrieveActionResponse() {
    return productionSupportRetrieveActionResponse;
  }

  public void setProductionSupportRetrieveActionResponse(String productionSupportRetrieveActionResponse) {
    this.productionSupportRetrieveActionResponse = productionSupportRetrieveActionResponse;
  }


  /**
   * Get productionSupportInstanceReport
   * @return productionSupportInstanceReport
  **/

  public BQProductionSupportRetrieveOutputModelProductionSupportInstanceReport getProductionSupportInstanceReport() {
    return productionSupportInstanceReport;
  }

  public void setProductionSupportInstanceReport(BQProductionSupportRetrieveOutputModelProductionSupportInstanceReport productionSupportInstanceReport) {
    this.productionSupportInstanceReport = productionSupportInstanceReport;
  }


  /**
   * Get productionSupportInstanceAnalysis
   * @return productionSupportInstanceAnalysis
  **/

  public BQProductionSupportRetrieveOutputModelProductionSupportInstanceAnalysis getProductionSupportInstanceAnalysis() {
    return productionSupportInstanceAnalysis;
  }

  public void setProductionSupportInstanceAnalysis(BQProductionSupportRetrieveOutputModelProductionSupportInstanceAnalysis productionSupportInstanceAnalysis) {
    this.productionSupportInstanceAnalysis = productionSupportInstanceAnalysis;
  }


}

