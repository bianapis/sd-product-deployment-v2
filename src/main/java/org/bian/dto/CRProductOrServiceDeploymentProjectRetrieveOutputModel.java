package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceAnalysis;
import org.bian.dto.CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectRetrieveOutputModel
 */
public class CRProductOrServiceDeploymentProjectRetrieveOutputModel   {
  private CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectRetrieveActionTaskReference = null;

  private Object productOrServiceDeploymentProjectRetrieveActionTaskRecord = null;

  private String productOrServiceDeploymentProjectRetrieveActionResponse = null;

  private CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceReportRecord productOrServiceDeploymentProjectInstanceReportRecord = null;

  private CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceAnalysis productOrServiceDeploymentProjectInstanceAnalysis = null;


  /**
   * Get productServiceDeploymentProjectInstanceRecord
   * @return productServiceDeploymentProjectInstanceRecord
  **/

  public CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord getProductServiceDeploymentProjectInstanceRecord() {
    return productServiceDeploymentProjectInstanceRecord;
  }

  public void setProductServiceDeploymentProjectInstanceRecord(CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord) {
    this.productServiceDeploymentProjectInstanceRecord = productServiceDeploymentProjectInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Or Service Deployment Project instance retrieve service call 
   * @return productOrServiceDeploymentProjectRetrieveActionTaskReference
  **/

  public String getProductOrServiceDeploymentProjectRetrieveActionTaskReference() {
    return productOrServiceDeploymentProjectRetrieveActionTaskReference;
  }

  public void setProductOrServiceDeploymentProjectRetrieveActionTaskReference(String productOrServiceDeploymentProjectRetrieveActionTaskReference) {
    this.productOrServiceDeploymentProjectRetrieveActionTaskReference = productOrServiceDeploymentProjectRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productOrServiceDeploymentProjectRetrieveActionTaskRecord
  **/

  public Object getProductOrServiceDeploymentProjectRetrieveActionTaskRecord() {
    return productOrServiceDeploymentProjectRetrieveActionTaskRecord;
  }

  public void setProductOrServiceDeploymentProjectRetrieveActionTaskRecord(Object productOrServiceDeploymentProjectRetrieveActionTaskRecord) {
    this.productOrServiceDeploymentProjectRetrieveActionTaskRecord = productOrServiceDeploymentProjectRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productOrServiceDeploymentProjectRetrieveActionResponse
  **/

  public String getProductOrServiceDeploymentProjectRetrieveActionResponse() {
    return productOrServiceDeploymentProjectRetrieveActionResponse;
  }

  public void setProductOrServiceDeploymentProjectRetrieveActionResponse(String productOrServiceDeploymentProjectRetrieveActionResponse) {
    this.productOrServiceDeploymentProjectRetrieveActionResponse = productOrServiceDeploymentProjectRetrieveActionResponse;
  }


  /**
   * Get productOrServiceDeploymentProjectInstanceReportRecord
   * @return productOrServiceDeploymentProjectInstanceReportRecord
  **/

  public CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceReportRecord getProductOrServiceDeploymentProjectInstanceReportRecord() {
    return productOrServiceDeploymentProjectInstanceReportRecord;
  }

  public void setProductOrServiceDeploymentProjectInstanceReportRecord(CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceReportRecord productOrServiceDeploymentProjectInstanceReportRecord) {
    this.productOrServiceDeploymentProjectInstanceReportRecord = productOrServiceDeploymentProjectInstanceReportRecord;
  }


  /**
   * Get productOrServiceDeploymentProjectInstanceAnalysis
   * @return productOrServiceDeploymentProjectInstanceAnalysis
  **/

  public CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceAnalysis getProductOrServiceDeploymentProjectInstanceAnalysis() {
    return productOrServiceDeploymentProjectInstanceAnalysis;
  }

  public void setProductOrServiceDeploymentProjectInstanceAnalysis(CRProductOrServiceDeploymentProjectRetrieveOutputModelProductOrServiceDeploymentProjectInstanceAnalysis productOrServiceDeploymentProjectInstanceAnalysis) {
    this.productOrServiceDeploymentProjectInstanceAnalysis = productOrServiceDeploymentProjectInstanceAnalysis;
  }


}

