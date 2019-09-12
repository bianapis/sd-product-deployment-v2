package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQServicingExchangeInputModel
 */
public class BQServicingExchangeInputModel   {
  private String productOrServiceDeploymentProjectInstanceReference = null;

  private String servicingInstanceReference = null;

  private Object servicingExchangeActionTaskRecord = null;

  private CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest servicingExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Servicing instance 
   * @return servicingInstanceReference
  **/

  public String getServicingInstanceReference() {
    return servicingInstanceReference;
  }

  public void setServicingInstanceReference(String servicingInstanceReference) {
    this.servicingInstanceReference = servicingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return servicingExchangeActionTaskRecord
  **/

  public Object getServicingExchangeActionTaskRecord() {
    return servicingExchangeActionTaskRecord;
  }

  public void setServicingExchangeActionTaskRecord(Object servicingExchangeActionTaskRecord) {
    this.servicingExchangeActionTaskRecord = servicingExchangeActionTaskRecord;
  }


  /**
   * Get servicingExchangeActionRequest
   * @return servicingExchangeActionRequest
  **/

  public CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest getServicingExchangeActionRequest() {
    return servicingExchangeActionRequest;
  }

  public void setServicingExchangeActionRequest(CRProductOrServiceDeploymentProjectExchangeInputModelProductOrServiceDeploymentProjectExchangeActionRequest servicingExchangeActionRequest) {
    this.servicingExchangeActionRequest = servicingExchangeActionRequest;
  }


}

