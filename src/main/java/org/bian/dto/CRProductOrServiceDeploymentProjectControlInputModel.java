package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectControlInputModelProductOrServiceDeploymentProjectControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectControlInputModel
 */
public class CRProductOrServiceDeploymentProjectControlInputModel   {
  private String productDeploymentServicingSessionReference = null;

  private String productOrServiceDeploymentProjectInstanceReference = null;

  private Object productOrServiceDeploymentProjectControlActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectControlInputModelProductOrServiceDeploymentProjectControlActionRequest productOrServiceDeploymentProjectControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productDeploymentServicingSessionReference
  **/

  public String getProductDeploymentServicingSessionReference() {
    return productDeploymentServicingSessionReference;
  }

  public void setProductDeploymentServicingSessionReference(String productDeploymentServicingSessionReference) {
    this.productDeploymentServicingSessionReference = productDeploymentServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Or Service Deployment Project instance 
   * @return productOrServiceDeploymentProjectInstanceReference
  **/

  public String getProductOrServiceDeploymentProjectInstanceReference() {
    return productOrServiceDeploymentProjectInstanceReference;
  }

  public void setProductOrServiceDeploymentProjectInstanceReference(String productOrServiceDeploymentProjectInstanceReference) {
    this.productOrServiceDeploymentProjectInstanceReference = productOrServiceDeploymentProjectInstanceReference;
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
   * Get productOrServiceDeploymentProjectControlActionRequest
   * @return productOrServiceDeploymentProjectControlActionRequest
  **/

  public CRProductOrServiceDeploymentProjectControlInputModelProductOrServiceDeploymentProjectControlActionRequest getProductOrServiceDeploymentProjectControlActionRequest() {
    return productOrServiceDeploymentProjectControlActionRequest;
  }

  public void setProductOrServiceDeploymentProjectControlActionRequest(CRProductOrServiceDeploymentProjectControlInputModelProductOrServiceDeploymentProjectControlActionRequest productOrServiceDeploymentProjectControlActionRequest) {
    this.productOrServiceDeploymentProjectControlActionRequest = productOrServiceDeploymentProjectControlActionRequest;
  }


}

