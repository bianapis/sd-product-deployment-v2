package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHROperationsRequestInputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements;

import javax.validation.Valid;
  
/**
 * BQHROperationsRequestInputModelHROperationsInstanceRecord
 */
public class BQHROperationsRequestInputModelHROperationsInstanceRecord   {
  private BQHROperationsRequestInputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements productServiceDeploymentHROperationsRequirements = null;


  /**
   * Get productServiceDeploymentHROperationsRequirements
   * @return productServiceDeploymentHROperationsRequirements
  **/

  public BQHROperationsRequestInputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements getProductServiceDeploymentHROperationsRequirements() {
    return productServiceDeploymentHROperationsRequirements;
  }

  public void setProductServiceDeploymentHROperationsRequirements(BQHROperationsRequestInputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements productServiceDeploymentHROperationsRequirements) {
    this.productServiceDeploymentHROperationsRequirements = productServiceDeploymentHROperationsRequirements;
  }


}

