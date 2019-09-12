package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionUpdateInputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements;

import javax.validation.Valid;
  
/**
 * BQProductionUpdateInputModelProductionInstanceRecord
 */
public class BQProductionUpdateInputModelProductionInstanceRecord   {
  private BQProductionUpdateInputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements productServiceDeploymentProductionRequirements = null;


  /**
   * Get productServiceDeploymentProductionRequirements
   * @return productServiceDeploymentProductionRequirements
  **/

  public BQProductionUpdateInputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements getProductServiceDeploymentProductionRequirements() {
    return productServiceDeploymentProductionRequirements;
  }

  public void setProductServiceDeploymentProductionRequirements(BQProductionUpdateInputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements productServiceDeploymentProductionRequirements) {
    this.productServiceDeploymentProductionRequirements = productServiceDeploymentProductionRequirements;
  }


}

