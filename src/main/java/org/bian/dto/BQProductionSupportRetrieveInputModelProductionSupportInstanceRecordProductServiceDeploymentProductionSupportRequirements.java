package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionSupportRetrieveInputModelProductionSupportInstanceRecordProductServiceDeploymentProductionSupportRequirements
 */
public class BQProductionSupportRetrieveInputModelProductionSupportInstanceRecordProductServiceDeploymentProductionSupportRequirements   {
  private String productServiceDeploymentProductionSupportRequirementsWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String productServiceDeploymentProductionSupportRequirementsTaskSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated deployment planning and deliverable specifications for the task 
   * @return productServiceDeploymentProductionSupportRequirementsWorkProducts
  **/

  public String getProductServiceDeploymentProductionSupportRequirementsWorkProducts() {
    return productServiceDeploymentProductionSupportRequirementsWorkProducts;
  }

  public void setProductServiceDeploymentProductionSupportRequirementsWorkProducts(String productServiceDeploymentProductionSupportRequirementsWorkProducts) {
    this.productServiceDeploymentProductionSupportRequirementsWorkProducts = productServiceDeploymentProductionSupportRequirementsWorkProducts;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the tasks and deliverables needed to handle the production support needs of the deployment 
   * @return productServiceDeploymentProductionSupportRequirementsTaskSpecification
  **/

  public String getProductServiceDeploymentProductionSupportRequirementsTaskSpecification() {
    return productServiceDeploymentProductionSupportRequirementsTaskSpecification;
  }

  public void setProductServiceDeploymentProductionSupportRequirementsTaskSpecification(String productServiceDeploymentProductionSupportRequirementsTaskSpecification) {
    this.productServiceDeploymentProductionSupportRequirementsTaskSpecification = productServiceDeploymentProductionSupportRequirementsTaskSpecification;
  }


}

