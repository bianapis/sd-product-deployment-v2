package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSystemsRequestInputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements;

import javax.validation.Valid;
  
/**
 * BQSystemsRequestInputModelSystemsInstanceRecord
 */
public class BQSystemsRequestInputModelSystemsInstanceRecord   {
  private BQSystemsRequestInputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements productServiceDeploymentSystemsRequirements = null;


  /**
   * Get productServiceDeploymentSystemsRequirements
   * @return productServiceDeploymentSystemsRequirements
  **/

  public BQSystemsRequestInputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements getProductServiceDeploymentSystemsRequirements() {
    return productServiceDeploymentSystemsRequirements;
  }

  public void setProductServiceDeploymentSystemsRequirements(BQSystemsRequestInputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements productServiceDeploymentSystemsRequirements) {
    this.productServiceDeploymentSystemsRequirements = productServiceDeploymentSystemsRequirements;
  }


}

