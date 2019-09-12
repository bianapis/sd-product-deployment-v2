package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionUpdateInputModelProductionInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductionUpdateOutputModel
 */
public class BQProductionUpdateOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQProductionUpdateInputModelProductionInstanceRecord productionInstanceRecord = null;

  private String productionUpdateActionTaskReference = null;

  private Object productionUpdateActionTaskRecord = null;

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
   * Get productionInstanceRecord
   * @return productionInstanceRecord
  **/

  public BQProductionUpdateInputModelProductionInstanceRecord getProductionInstanceRecord() {
    return productionInstanceRecord;
  }

  public void setProductionInstanceRecord(BQProductionUpdateInputModelProductionInstanceRecord productionInstanceRecord) {
    this.productionInstanceRecord = productionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productionUpdateActionTaskReference
  **/

  public String getProductionUpdateActionTaskReference() {
    return productionUpdateActionTaskReference;
  }

  public void setProductionUpdateActionTaskReference(String productionUpdateActionTaskReference) {
    this.productionUpdateActionTaskReference = productionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productionUpdateActionTaskRecord
  **/

  public Object getProductionUpdateActionTaskRecord() {
    return productionUpdateActionTaskRecord;
  }

  public void setProductionUpdateActionTaskRecord(Object productionUpdateActionTaskRecord) {
    this.productionUpdateActionTaskRecord = productionUpdateActionTaskRecord;
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

