package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQITOperationsRetrieveOutputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements;

import javax.validation.Valid;
  
/**
 * BQITOperationsRetrieveOutputModelITOperationsInstanceRecord
 */
public class BQITOperationsRetrieveOutputModelITOperationsInstanceRecord   {
  private BQITOperationsRetrieveOutputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements productServiceDeploymentITOperationsRequirements = null;


  /**
   * Get productServiceDeploymentITOperationsRequirements
   * @return productServiceDeploymentITOperationsRequirements
  **/

  public BQITOperationsRetrieveOutputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements getProductServiceDeploymentITOperationsRequirements() {
    return productServiceDeploymentITOperationsRequirements;
  }

  public void setProductServiceDeploymentITOperationsRequirements(BQITOperationsRetrieveOutputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements productServiceDeploymentITOperationsRequirements) {
    this.productServiceDeploymentITOperationsRequirements = productServiceDeploymentITOperationsRequirements;
  }


}

