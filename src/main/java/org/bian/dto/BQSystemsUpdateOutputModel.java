package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSystemsUpdateInputModelSystemsInstanceRecord;
import org.bian.dto.CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSystemsUpdateOutputModel
 */
public class BQSystemsUpdateOutputModel   {
  private CRProductOrServiceDeploymentProjectCaptureInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private BQSystemsUpdateInputModelSystemsInstanceRecord systemsInstanceRecord = null;

  private String systemsUpdateActionTaskReference = null;

  private Object systemsUpdateActionTaskRecord = null;

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
   * Get systemsInstanceRecord
   * @return systemsInstanceRecord
  **/

  public BQSystemsUpdateInputModelSystemsInstanceRecord getSystemsInstanceRecord() {
    return systemsInstanceRecord;
  }

  public void setSystemsInstanceRecord(BQSystemsUpdateInputModelSystemsInstanceRecord systemsInstanceRecord) {
    this.systemsInstanceRecord = systemsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return systemsUpdateActionTaskReference
  **/

  public String getSystemsUpdateActionTaskReference() {
    return systemsUpdateActionTaskReference;
  }

  public void setSystemsUpdateActionTaskReference(String systemsUpdateActionTaskReference) {
    this.systemsUpdateActionTaskReference = systemsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return systemsUpdateActionTaskRecord
  **/

  public Object getSystemsUpdateActionTaskRecord() {
    return systemsUpdateActionTaskRecord;
  }

  public void setSystemsUpdateActionTaskRecord(Object systemsUpdateActionTaskRecord) {
    this.systemsUpdateActionTaskRecord = systemsUpdateActionTaskRecord;
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

