package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQITOperationsRequestInputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements;

import javax.validation.Valid;
  
/**
 * BQITOperationsRequestInputModelITOperationsInstanceRecord
 */
public class BQITOperationsRequestInputModelITOperationsInstanceRecord   {
  private BQITOperationsRequestInputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements productServiceDeploymentITOperationsRequirements = null;


  /**
   * Get productServiceDeploymentITOperationsRequirements
   * @return productServiceDeploymentITOperationsRequirements
  **/

  public BQITOperationsRequestInputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements getProductServiceDeploymentITOperationsRequirements() {
    return productServiceDeploymentITOperationsRequirements;
  }

  public void setProductServiceDeploymentITOperationsRequirements(BQITOperationsRequestInputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements productServiceDeploymentITOperationsRequirements) {
    this.productServiceDeploymentITOperationsRequirements = productServiceDeploymentITOperationsRequirements;
  }


}

