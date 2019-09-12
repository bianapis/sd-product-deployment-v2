package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesandMarketingRequestInputModelSalesandMarketingInstanceRecordProductServiceDeploymentSalesandMarketingRequirements;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingRequestInputModelSalesandMarketingInstanceRecord
 */
public class BQSalesandMarketingRequestInputModelSalesandMarketingInstanceRecord   {
  private BQSalesandMarketingRequestInputModelSalesandMarketingInstanceRecordProductServiceDeploymentSalesandMarketingRequirements productServiceDeploymentSalesandMarketingRequirements = null;


  /**
   * Get productServiceDeploymentSalesandMarketingRequirements
   * @return productServiceDeploymentSalesandMarketingRequirements
  **/

  public BQSalesandMarketingRequestInputModelSalesandMarketingInstanceRecordProductServiceDeploymentSalesandMarketingRequirements getProductServiceDeploymentSalesandMarketingRequirements() {
    return productServiceDeploymentSalesandMarketingRequirements;
  }

  public void setProductServiceDeploymentSalesandMarketingRequirements(BQSalesandMarketingRequestInputModelSalesandMarketingInstanceRecordProductServiceDeploymentSalesandMarketingRequirements productServiceDeploymentSalesandMarketingRequirements) {
    this.productServiceDeploymentSalesandMarketingRequirements = productServiceDeploymentSalesandMarketingRequirements;
  }


}

