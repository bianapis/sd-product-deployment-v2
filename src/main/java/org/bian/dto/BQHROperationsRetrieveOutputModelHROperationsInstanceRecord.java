package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHROperationsRetrieveOutputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements;

import javax.validation.Valid;
  
/**
 * BQHROperationsRetrieveOutputModelHROperationsInstanceRecord
 */
public class BQHROperationsRetrieveOutputModelHROperationsInstanceRecord   {
  private BQHROperationsRetrieveOutputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements productServiceDeploymentHROperationsRequirements = null;


  /**
   * Get productServiceDeploymentHROperationsRequirements
   * @return productServiceDeploymentHROperationsRequirements
  **/

  public BQHROperationsRetrieveOutputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements getProductServiceDeploymentHROperationsRequirements() {
    return productServiceDeploymentHROperationsRequirements;
  }

  public void setProductServiceDeploymentHROperationsRequirements(BQHROperationsRetrieveOutputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements productServiceDeploymentHROperationsRequirements) {
    this.productServiceDeploymentHROperationsRequirements = productServiceDeploymentHROperationsRequirements;
  }


}

