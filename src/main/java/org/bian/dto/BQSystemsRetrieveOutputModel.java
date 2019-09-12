package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSystemsRetrieveOutputModelSystemsInstanceAnalysis;
import org.bian.dto.BQSystemsRetrieveOutputModelSystemsInstanceRecord;
import org.bian.dto.BQSystemsRetrieveOutputModelSystemsInstanceReport;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSystemsRetrieveOutputModel
 */
public class BQSystemsRetrieveOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQSystemsRetrieveOutputModelSystemsInstanceRecord systemsInstanceRecord = null;

  private String systemsRetrieveActionTaskReference = null;

  private Object systemsRetrieveActionTaskRecord = null;

  private String systemsRetrieveActionResponse = null;

  private BQSystemsRetrieveOutputModelSystemsInstanceReport systemsInstanceReport = null;

  private BQSystemsRetrieveOutputModelSystemsInstanceAnalysis systemsInstanceAnalysis = null;


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
   * Get systemsInstanceRecord
   * @return systemsInstanceRecord
  **/

  public BQSystemsRetrieveOutputModelSystemsInstanceRecord getSystemsInstanceRecord() {
    return systemsInstanceRecord;
  }

  public void setSystemsInstanceRecord(BQSystemsRetrieveOutputModelSystemsInstanceRecord systemsInstanceRecord) {
    this.systemsInstanceRecord = systemsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Systems instance retrieve service call 
   * @return systemsRetrieveActionTaskReference
  **/

  public String getSystemsRetrieveActionTaskReference() {
    return systemsRetrieveActionTaskReference;
  }

  public void setSystemsRetrieveActionTaskReference(String systemsRetrieveActionTaskReference) {
    this.systemsRetrieveActionTaskReference = systemsRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return systemsRetrieveActionResponse
  **/

  public String getSystemsRetrieveActionResponse() {
    return systemsRetrieveActionResponse;
  }

  public void setSystemsRetrieveActionResponse(String systemsRetrieveActionResponse) {
    this.systemsRetrieveActionResponse = systemsRetrieveActionResponse;
  }


  /**
   * Get systemsInstanceReport
   * @return systemsInstanceReport
  **/

  public BQSystemsRetrieveOutputModelSystemsInstanceReport getSystemsInstanceReport() {
    return systemsInstanceReport;
  }

  public void setSystemsInstanceReport(BQSystemsRetrieveOutputModelSystemsInstanceReport systemsInstanceReport) {
    this.systemsInstanceReport = systemsInstanceReport;
  }


  /**
   * Get systemsInstanceAnalysis
   * @return systemsInstanceAnalysis
  **/

  public BQSystemsRetrieveOutputModelSystemsInstanceAnalysis getSystemsInstanceAnalysis() {
    return systemsInstanceAnalysis;
  }

  public void setSystemsInstanceAnalysis(BQSystemsRetrieveOutputModelSystemsInstanceAnalysis systemsInstanceAnalysis) {
    this.systemsInstanceAnalysis = systemsInstanceAnalysis;
  }


}

