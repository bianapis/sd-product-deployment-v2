package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectUpdateOutputModel
 */
public class CRProductOrServiceDeploymentProjectUpdateOutputModel   {
  private CRProductOrServiceDeploymentProjectCreateInputModelProductServiceDeploymentProjectInstanceRecord productServiceDeploymentProjectInstanceRecord = null;

  private String productOrServiceDeploymentProjectUpdateActionTaskReference = null;

  private Object productOrServiceDeploymentProjectUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productOrServiceDeploymentProjectUpdateActionTaskReference
  **/

  public String getProductOrServiceDeploymentProjectUpdateActionTaskReference() {
    return productOrServiceDeploymentProjectUpdateActionTaskReference;
  }

  public void setProductOrServiceDeploymentProjectUpdateActionTaskReference(String productOrServiceDeploymentProjectUpdateActionTaskReference) {
    this.productOrServiceDeploymentProjectUpdateActionTaskReference = productOrServiceDeploymentProjectUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productOrServiceDeploymentProjectUpdateActionTaskRecord
  **/

  public Object getProductOrServiceDeploymentProjectUpdateActionTaskRecord() {
    return productOrServiceDeploymentProjectUpdateActionTaskRecord;
  }

  public void setProductOrServiceDeploymentProjectUpdateActionTaskRecord(Object productOrServiceDeploymentProjectUpdateActionTaskRecord) {
    this.productOrServiceDeploymentProjectUpdateActionTaskRecord = productOrServiceDeploymentProjectUpdateActionTaskRecord;
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

