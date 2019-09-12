package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSystemsRetrieveOutputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements;

import javax.validation.Valid;
  
/**
 * BQSystemsRetrieveOutputModelSystemsInstanceRecord
 */
public class BQSystemsRetrieveOutputModelSystemsInstanceRecord   {
  private BQSystemsRetrieveOutputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements productServiceDeploymentSystemsRequirements = null;


  /**
   * Get productServiceDeploymentSystemsRequirements
   * @return productServiceDeploymentSystemsRequirements
  **/

  public BQSystemsRetrieveOutputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements getProductServiceDeploymentSystemsRequirements() {
    return productServiceDeploymentSystemsRequirements;
  }

  public void setProductServiceDeploymentSystemsRequirements(BQSystemsRetrieveOutputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements productServiceDeploymentSystemsRequirements) {
    this.productServiceDeploymentSystemsRequirements = productServiceDeploymentSystemsRequirements;
  }


}

