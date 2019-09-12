package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionSupportUpdateInputModelProductionSupportInstanceRecordProductServiceDeploymentProductionSupportRequirements;

import javax.validation.Valid;
  
/**
 * BQProductionSupportUpdateInputModelProductionSupportInstanceRecord
 */
public class BQProductionSupportUpdateInputModelProductionSupportInstanceRecord   {
  private BQProductionSupportUpdateInputModelProductionSupportInstanceRecordProductServiceDeploymentProductionSupportRequirements productServiceDeploymentProductionSupportRequirements = null;


  /**
   * Get productServiceDeploymentProductionSupportRequirements
   * @return productServiceDeploymentProductionSupportRequirements
  **/

  public BQProductionSupportUpdateInputModelProductionSupportInstanceRecordProductServiceDeploymentProductionSupportRequirements getProductServiceDeploymentProductionSupportRequirements() {
    return productServiceDeploymentProductionSupportRequirements;
  }

  public void setProductServiceDeploymentProductionSupportRequirements(BQProductionSupportUpdateInputModelProductionSupportInstanceRecordProductServiceDeploymentProductionSupportRequirements productServiceDeploymentProductionSupportRequirements) {
    this.productServiceDeploymentProductionSupportRequirements = productServiceDeploymentProductionSupportRequirements;
  }


}

