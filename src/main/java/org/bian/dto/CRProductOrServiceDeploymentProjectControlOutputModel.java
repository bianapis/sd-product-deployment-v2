package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectControlOutputModel
 */
public class CRProductOrServiceDeploymentProjectControlOutputModel   {
  private String productOrServiceDeploymentProjectControlActionTaskReference = null;

  private Object productOrServiceDeploymentProjectControlActionTaskRecord = null;

  private String productOrServiceDeploymentProjectControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Or Service Deployment Project instance control processing service call 
   * @return productOrServiceDeploymentProjectControlActionTaskReference
  **/

  public String getProductOrServiceDeploymentProjectControlActionTaskReference() {
    return productOrServiceDeploymentProjectControlActionTaskReference;
  }

  public void setProductOrServiceDeploymentProjectControlActionTaskReference(String productOrServiceDeploymentProjectControlActionTaskReference) {
    this.productOrServiceDeploymentProjectControlActionTaskReference = productOrServiceDeploymentProjectControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return productOrServiceDeploymentProjectControlActionTaskRecord
  **/

  public Object getProductOrServiceDeploymentProjectControlActionTaskRecord() {
    return productOrServiceDeploymentProjectControlActionTaskRecord;
  }

  public void setProductOrServiceDeploymentProjectControlActionTaskRecord(Object productOrServiceDeploymentProjectControlActionTaskRecord) {
    this.productOrServiceDeploymentProjectControlActionTaskRecord = productOrServiceDeploymentProjectControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return productOrServiceDeploymentProjectControlActionResponse
  **/

  public String getProductOrServiceDeploymentProjectControlActionResponse() {
    return productOrServiceDeploymentProjectControlActionResponse;
  }

  public void setProductOrServiceDeploymentProjectControlActionResponse(String productOrServiceDeploymentProjectControlActionResponse) {
    this.productOrServiceDeploymentProjectControlActionResponse = productOrServiceDeploymentProjectControlActionResponse;
  }


}

