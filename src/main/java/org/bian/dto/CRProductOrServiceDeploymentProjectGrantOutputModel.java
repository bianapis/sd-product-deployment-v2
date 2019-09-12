package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductOrServiceDeploymentProjectGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRProductOrServiceDeploymentProjectGrantOutputModel
 */
public class CRProductOrServiceDeploymentProjectGrantOutputModel   {
  private String productOrServiceDeploymentProjectGrantActionTaskReference = null;

  private Object productOrServiceDeploymentProjectGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRProductOrServiceDeploymentProjectGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Or Service Deployment Project instance grant service call 
   * @return productOrServiceDeploymentProjectGrantActionTaskReference
  **/

  public String getProductOrServiceDeploymentProjectGrantActionTaskReference() {
    return productOrServiceDeploymentProjectGrantActionTaskReference;
  }

  public void setProductOrServiceDeploymentProjectGrantActionTaskReference(String productOrServiceDeploymentProjectGrantActionTaskReference) {
    this.productOrServiceDeploymentProjectGrantActionTaskReference = productOrServiceDeploymentProjectGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return productOrServiceDeploymentProjectGrantActionTaskRecord
  **/

  public Object getProductOrServiceDeploymentProjectGrantActionTaskRecord() {
    return productOrServiceDeploymentProjectGrantActionTaskRecord;
  }

  public void setProductOrServiceDeploymentProjectGrantActionTaskRecord(Object productOrServiceDeploymentProjectGrantActionTaskRecord) {
    this.productOrServiceDeploymentProjectGrantActionTaskRecord = productOrServiceDeploymentProjectGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRProductOrServiceDeploymentProjectGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRProductOrServiceDeploymentProjectGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

