package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQITOperationsUpdateInputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements;

import javax.validation.Valid;
  
/**
 * BQITOperationsUpdateInputModelITOperationsInstanceRecord
 */
public class BQITOperationsUpdateInputModelITOperationsInstanceRecord   {
  private BQITOperationsUpdateInputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements productServiceDeploymentITOperationsRequirements = null;


  /**
   * Get productServiceDeploymentITOperationsRequirements
   * @return productServiceDeploymentITOperationsRequirements
  **/

  public BQITOperationsUpdateInputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements getProductServiceDeploymentITOperationsRequirements() {
    return productServiceDeploymentITOperationsRequirements;
  }

  public void setProductServiceDeploymentITOperationsRequirements(BQITOperationsUpdateInputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements productServiceDeploymentITOperationsRequirements) {
    this.productServiceDeploymentITOperationsRequirements = productServiceDeploymentITOperationsRequirements;
  }


}

