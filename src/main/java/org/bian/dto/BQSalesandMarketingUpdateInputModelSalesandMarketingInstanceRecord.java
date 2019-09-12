package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecordProductServiceDeploymentSalesandMarketingRequirements;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecord
 */
public class BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecord   {
  private BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecordProductServiceDeploymentSalesandMarketingRequirements productServiceDeploymentSalesandMarketingRequirements = null;


  /**
   * Get productServiceDeploymentSalesandMarketingRequirements
   * @return productServiceDeploymentSalesandMarketingRequirements
  **/

  public BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecordProductServiceDeploymentSalesandMarketingRequirements getProductServiceDeploymentSalesandMarketingRequirements() {
    return productServiceDeploymentSalesandMarketingRequirements;
  }

  public void setProductServiceDeploymentSalesandMarketingRequirements(BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecordProductServiceDeploymentSalesandMarketingRequirements productServiceDeploymentSalesandMarketingRequirements) {
    this.productServiceDeploymentSalesandMarketingRequirements = productServiceDeploymentSalesandMarketingRequirements;
  }


}

