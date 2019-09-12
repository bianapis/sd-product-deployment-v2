package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQProductionSupportRequestInputModel
 */
public class BQProductionSupportRequestInputModel   {
  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String productionSupportInstanceReference = null;

  private Object productionSupportRequestActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product Or Service Deployment Project instance 
   * @return productOrServiceDeploymentProjectInstanceReference
  **/

  public String getProductOrServiceDeploymentProjectInstanceReference() {
    return productOrServiceDeploymentProjectInstanceReference;
  }

  public void setProductOrServiceDeploymentProjectInstanceReference(String productOrServiceDeploymentProjectInstanceReference) {
    this.productOrServiceDeploymentProjectInstanceReference = productOrServiceDeploymentProjectInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production Support instance 
   * @return productionSupportInstanceReference
  **/

  public String getProductionSupportInstanceReference() {
    return productionSupportInstanceReference;
  }

  public void setProductionSupportInstanceReference(String productionSupportInstanceReference) {
    this.productionSupportInstanceReference = productionSupportInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productionSupportRequestActionTaskRecord
  **/

  public Object getProductionSupportRequestActionTaskRecord() {
    return productionSupportRequestActionTaskRecord;
  }

  public void setProductionSupportRequestActionTaskRecord(Object productionSupportRequestActionTaskRecord) {
    this.productionSupportRequestActionTaskRecord = productionSupportRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductOrServiceDeploymentProjectRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

