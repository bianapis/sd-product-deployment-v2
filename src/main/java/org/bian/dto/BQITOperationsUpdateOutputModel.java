package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQITOperationsUpdateInputModelITOperationsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQITOperationsUpdateOutputModel
 */
public class BQITOperationsUpdateOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQITOperationsUpdateInputModelITOperationsInstanceRecord iTOperationsInstanceRecord = null;

  private String iTOperationsUpdateActionTaskReference = null;

  private Object iTOperationsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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

  public BQITOperationsUpdateInputModelITOperationsInstanceRecord getITOperationsInstanceRecord() {
    return iTOperationsInstanceRecord;
  }
   @JsonProperty("iTOperationsInstanceRecord")
  public void setITOperationsInstanceRecord(BQITOperationsUpdateInputModelITOperationsInstanceRecord iTOperationsInstanceRecord) {
    this.iTOperationsInstanceRecord = iTOperationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return iTOperationsUpdateActionTaskReference
  **/

  public String getITOperationsUpdateActionTaskReference() {
    return iTOperationsUpdateActionTaskReference;
  }
   @JsonProperty("iTOperationsUpdateActionTaskReference")
  public void setITOperationsUpdateActionTaskReference(String iTOperationsUpdateActionTaskReference) {
    this.iTOperationsUpdateActionTaskReference = iTOperationsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return iTOperationsUpdateActionTaskRecord
  **/

  public Object getITOperationsUpdateActionTaskRecord() {
    return iTOperationsUpdateActionTaskRecord;
  }
   
  @JsonProperty("iTOperationsUpdateActionTaskRecord")
  public void setITOperationsUpdateActionTaskRecord(Object iTOperationsUpdateActionTaskRecord) {
    this.iTOperationsUpdateActionTaskRecord = iTOperationsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

