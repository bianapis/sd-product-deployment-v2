package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionSupportRetrieveInputModelProductionSupportInstanceRecordProductServiceDeploymentProductionSupportRequirements;

import javax.validation.Valid;
  
/**
 * BQProductionSupportRetrieveInputModelProductionSupportInstanceRecord
 */
public class BQProductionSupportRetrieveInputModelProductionSupportInstanceRecord   {
  private BQProductionSupportRetrieveInputModelProductionSupportInstanceRecordProductServiceDeploymentProductionSupportRequirements productServiceDeploymentProductionSupportRequirements = null;


  /**
   * Get productServiceDeploymentProductionSupportRequirements
   * @return productServiceDeploymentProductionSupportRequirements
  **/

  public BQProductionSupportRetrieveInputModelProductionSupportInstanceRecordProductServiceDeploymentProductionSupportRequirements getProductServiceDeploymentProductionSupportRequirements() {
    return productServiceDeploymentProductionSupportRequirements;
  }

  public void setProductServiceDeploymentProductionSupportRequirements(BQProductionSupportRetrieveInputModelProductionSupportInstanceRecordProductServiceDeploymentProductionSupportRequirements productServiceDeploymentProductionSupportRequirements) {
    this.productServiceDeploymentProductionSupportRequirements = productServiceDeploymentProductionSupportRequirements;
  }


}

