package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServicingRequestInputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements;

import javax.validation.Valid;
  
/**
 * BQServicingRequestInputModelServicingInstanceRecord
 */
public class BQServicingRequestInputModelServicingInstanceRecord   {
  private BQServicingRequestInputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements productServiceDeploymentServicingRequirements = null;


  /**
   * Get productServiceDeploymentServicingRequirements
   * @return productServiceDeploymentServicingRequirements
  **/

  public BQServicingRequestInputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements getProductServiceDeploymentServicingRequirements() {
    return productServiceDeploymentServicingRequirements;
  }

  public void setProductServiceDeploymentServicingRequirements(BQServicingRequestInputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements productServiceDeploymentServicingRequirements) {
    this.productServiceDeploymentServicingRequirements = productServiceDeploymentServicingRequirements;
  }


}

