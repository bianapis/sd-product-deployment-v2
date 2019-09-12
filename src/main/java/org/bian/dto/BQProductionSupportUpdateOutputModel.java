package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionSupportUpdateInputModelProductionSupportInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductionSupportUpdateOutputModel
 */
public class BQProductionSupportUpdateOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQProductionSupportUpdateInputModelProductionSupportInstanceRecord productionSupportInstanceRecord = null;

  private String productionSupportUpdateActionTaskReference = null;

  private Object productionSupportUpdateActionTaskRecord = null;

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
   * Get productionSupportInstanceRecord
   * @return productionSupportInstanceRecord
  **/

  public BQProductionSupportUpdateInputModelProductionSupportInstanceRecord getProductionSupportInstanceRecord() {
    return productionSupportInstanceRecord;
  }

  public void setProductionSupportInstanceRecord(BQProductionSupportUpdateInputModelProductionSupportInstanceRecord productionSupportInstanceRecord) {
    this.productionSupportInstanceRecord = productionSupportInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productionSupportUpdateActionTaskReference
  **/

  public String getProductionSupportUpdateActionTaskReference() {
    return productionSupportUpdateActionTaskReference;
  }

  public void setProductionSupportUpdateActionTaskReference(String productionSupportUpdateActionTaskReference) {
    this.productionSupportUpdateActionTaskReference = productionSupportUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productionSupportUpdateActionTaskRecord
  **/

  public Object getProductionSupportUpdateActionTaskRecord() {
    return productionSupportUpdateActionTaskRecord;
  }

  public void setProductionSupportUpdateActionTaskRecord(Object productionSupportUpdateActionTaskRecord) {
    this.productionSupportUpdateActionTaskRecord = productionSupportUpdateActionTaskRecord;
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

