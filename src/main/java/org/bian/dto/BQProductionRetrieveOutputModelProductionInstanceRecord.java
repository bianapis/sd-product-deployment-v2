package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRetrieveOutputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements;

import javax.validation.Valid;
  
/**
 * BQProductionRetrieveOutputModelProductionInstanceRecord
 */
public class BQProductionRetrieveOutputModelProductionInstanceRecord   {
  private BQProductionRetrieveOutputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements productServiceDeploymentProductionRequirements = null;


  /**
   * Get productServiceDeploymentProductionRequirements
   * @return productServiceDeploymentProductionRequirements
  **/

  public BQProductionRetrieveOutputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements getProductServiceDeploymentProductionRequirements() {
    return productServiceDeploymentProductionRequirements;
  }

  public void setProductServiceDeploymentProductionRequirements(BQProductionRetrieveOutputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements productServiceDeploymentProductionRequirements) {
    this.productServiceDeploymentProductionRequirements = productServiceDeploymentProductionRequirements;
  }


}

