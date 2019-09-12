package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecordProductServiceDeploymentSalesandMarketingRequirements
 */
public class BQSalesandMarketingUpdateInputModelSalesandMarketingInstanceRecordProductServiceDeploymentSalesandMarketingRequirements   {
  private String productServiceDeploymentSalesandMarketingRequirementsWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String productServiceDeploymentSalesandMarketingRequirementsTaskSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated deployment planning and deliverable specifications for the task 
   * @return productServiceDeploymentSalesandMarketingRequirementsWorkProducts
  **/

  public String getProductServiceDeploymentSalesandMarketingRequirementsWorkProducts() {
    return productServiceDeploymentSalesandMarketingRequirementsWorkProducts;
  }

  public void setProductServiceDeploymentSalesandMarketingRequirementsWorkProducts(String productServiceDeploymentSalesandMarketingRequirementsWorkProducts) {
    this.productServiceDeploymentSalesandMarketingRequirementsWorkProducts = productServiceDeploymentSalesandMarketingRequirementsWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the tasks and deliverables needed to handle the sales and marketing needs of the deployment 
   * @return productServiceDeploymentSalesandMarketingRequirementsTaskSpecification
  **/

  public String getProductServiceDeploymentSalesandMarketingRequirementsTaskSpecification() {
    return productServiceDeploymentSalesandMarketingRequirementsTaskSpecification;
  }

  public void setProductServiceDeploymentSalesandMarketingRequirementsTaskSpecification(String productServiceDeploymentSalesandMarketingRequirementsTaskSpecification) {
    this.productServiceDeploymentSalesandMarketingRequirementsTaskSpecification = productServiceDeploymentSalesandMarketingRequirementsTaskSpecification;
  }


}

