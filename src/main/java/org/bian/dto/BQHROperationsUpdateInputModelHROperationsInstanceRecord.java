package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHROperationsUpdateInputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements;

import javax.validation.Valid;
  
/**
 * BQHROperationsUpdateInputModelHROperationsInstanceRecord
 */
public class BQHROperationsUpdateInputModelHROperationsInstanceRecord   {
  private BQHROperationsUpdateInputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements productServiceDeploymentHROperationsRequirements = null;


  /**
   * Get productServiceDeploymentHROperationsRequirements
   * @return productServiceDeploymentHROperationsRequirements
  **/

  public BQHROperationsUpdateInputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements getProductServiceDeploymentHROperationsRequirements() {
    return productServiceDeploymentHROperationsRequirements;
  }

  public void setProductServiceDeploymentHROperationsRequirements(BQHROperationsUpdateInputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements productServiceDeploymentHROperationsRequirements) {
    this.productServiceDeploymentHROperationsRequirements = productServiceDeploymentHROperationsRequirements;
  }


}

