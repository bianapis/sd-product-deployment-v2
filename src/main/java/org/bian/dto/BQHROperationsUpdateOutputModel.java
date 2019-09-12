package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHROperationsUpdateInputModelHROperationsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQHROperationsUpdateOutputModel
 */
public class BQHROperationsUpdateOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQHROperationsUpdateInputModelHROperationsInstanceRecord hROperationsInstanceRecord = null;

  private String hROperationsUpdateActionTaskReference = null;

  private Object hROperationsUpdateActionTaskRecord = null;

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
   * Get hROperationsInstanceRecord
   * @return hROperationsInstanceRecord
  **/

  public BQHROperationsUpdateInputModelHROperationsInstanceRecord getHROperationsInstanceRecord() {
    return hROperationsInstanceRecord;
  }
 
  @JsonProperty("hROperationsInstanceRecord")
  public void setHROperationsInstanceRecord(BQHROperationsUpdateInputModelHROperationsInstanceRecord hROperationsInstanceRecord) {
    this.hROperationsInstanceRecord = hROperationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return hROperationsUpdateActionTaskReference
  **/

  public String getHROperationsUpdateActionTaskReference() {
    return hROperationsUpdateActionTaskReference;
  }
  
  @JsonProperty("hROperationsUpdateActionTaskReference")
  public void setHROperationsUpdateActionTaskReference(String hROperationsUpdateActionTaskReference) {
    this.hROperationsUpdateActionTaskReference = hROperationsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return hROperationsUpdateActionTaskRecord
  **/

  public Object getHROperationsUpdateActionTaskRecord() {
    return hROperationsUpdateActionTaskRecord;
  }
   
  @JsonProperty("hROperationsUpdateActionTaskRecord")
  public void setHROperationsUpdateActionTaskRecord(Object hROperationsUpdateActionTaskRecord) {
    this.hROperationsUpdateActionTaskRecord = hROperationsUpdateActionTaskRecord;
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

