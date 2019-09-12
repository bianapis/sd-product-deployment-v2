package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServicingUpdateInputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements;

import javax.validation.Valid;
  
/**
 * BQServicingUpdateInputModelServicingInstanceRecord
 */
public class BQServicingUpdateInputModelServicingInstanceRecord   {
  private BQServicingUpdateInputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements productServiceDeploymentServicingRequirements = null;


  /**
   * Get productServiceDeploymentServicingRequirements
   * @return productServiceDeploymentServicingRequirements
  **/

  public BQServicingUpdateInputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements getProductServiceDeploymentServicingRequirements() {
    return productServiceDeploymentServicingRequirements;
  }

  public void setProductServiceDeploymentServicingRequirements(BQServicingUpdateInputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements productServiceDeploymentServicingRequirements) {
    this.productServiceDeploymentServicingRequirements = productServiceDeploymentServicingRequirements;
  }


}

