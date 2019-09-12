package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRequestInputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements
 */
public class BQProductionRequestInputModelProductionInstanceRecordProductServiceDeploymentProductionRequirements   {
  private String productServiceDeploymentProductionRequirementsWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String productServiceDeploymentProductionRequirementsTaskSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated deployment planning and deliverable specifications for the task 
   * @return productServiceDeploymentProductionRequirementsWorkProducts
  **/

  public String getProductServiceDeploymentProductionRequirementsWorkProducts() {
    return productServiceDeploymentProductionRequirementsWorkProducts;
  }

  public void setProductServiceDeploymentProductionRequirementsWorkProducts(String productServiceDeploymentProductionRequirementsWorkProducts) {
    this.productServiceDeploymentProductionRequirementsWorkProducts = productServiceDeploymentProductionRequirementsWorkProducts;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the tasks and deliverables needed to handle the production needs of the deployment 
   * @return productServiceDeploymentProductionRequirementsTaskSpecification
  **/

  public String getProductServiceDeploymentProductionRequirementsTaskSpecification() {
    return productServiceDeploymentProductionRequirementsTaskSpecification;
  }

  public void setProductServiceDeploymentProductionRequirementsTaskSpecification(String productServiceDeploymentProductionRequirementsTaskSpecification) {
    this.productServiceDeploymentProductionRequirementsTaskSpecification = productServiceDeploymentProductionRequirementsTaskSpecification;
  }


}

