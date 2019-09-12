package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServicingRetrieveOutputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements;

import javax.validation.Valid;
  
/**
 * BQServicingRetrieveOutputModelServicingInstanceRecord
 */
public class BQServicingRetrieveOutputModelServicingInstanceRecord   {
  private BQServicingRetrieveOutputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements productServiceDeploymentServicingRequirements = null;


  /**
   * Get productServiceDeploymentServicingRequirements
   * @return productServiceDeploymentServicingRequirements
  **/

  public BQServicingRetrieveOutputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements getProductServiceDeploymentServicingRequirements() {
    return productServiceDeploymentServicingRequirements;
  }

  public void setProductServiceDeploymentServicingRequirements(BQServicingRetrieveOutputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements productServiceDeploymentServicingRequirements) {
    this.productServiceDeploymentServicingRequirements = productServiceDeploymentServicingRequirements;
  }


}

