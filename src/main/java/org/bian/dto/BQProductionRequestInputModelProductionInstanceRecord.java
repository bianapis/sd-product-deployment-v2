package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRequestInputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements;

import javax.validation.Valid;
  
/**
 * BQProductionRequestInputModelProductionInstanceRecord
 */
public class BQProductionRequestInputModelProductionInstanceRecord   {
  private BQProductionRequestInputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements productServiceDeploymentProductionRequirements = null;


  /**
   * Get productServiceDeploymentProductionRequirements
   * @return productServiceDeploymentProductionRequirements
  **/

  public BQProductionRequestInputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements getProductServiceDeploymentProductionRequirements() {
    return productServiceDeploymentProductionRequirements;
  }

  public void setProductServiceDeploymentProductionRequirements(BQProductionRequestInputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements productServiceDeploymentProductionRequirements) {
    this.productServiceDeploymentProductionRequirements = productServiceDeploymentProductionRequirements;
  }


}

