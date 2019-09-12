package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSystemsUpdateInputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements;

import javax.validation.Valid;
  
/**
 * BQSystemsUpdateInputModelSystemsInstanceRecord
 */
public class BQSystemsUpdateInputModelSystemsInstanceRecord   {
  private BQSystemsUpdateInputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements productServiceDeploymentSystemsRequirements = null;


  /**
   * Get productServiceDeploymentSystemsRequirements
   * @return productServiceDeploymentSystemsRequirements
  **/

  public BQSystemsUpdateInputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements getProductServiceDeploymentSystemsRequirements() {
    return productServiceDeploymentSystemsRequirements;
  }

  public void setProductServiceDeploymentSystemsRequirements(BQSystemsUpdateInputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements productServiceDeploymentSystemsRequirements) {
    this.productServiceDeploymentSystemsRequirements = productServiceDeploymentSystemsRequirements;
  }


}

