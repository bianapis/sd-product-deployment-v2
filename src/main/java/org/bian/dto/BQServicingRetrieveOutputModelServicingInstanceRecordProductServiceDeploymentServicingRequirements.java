package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServicingRetrieveOutputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements
 */
public class BQServicingRetrieveOutputModelServicingInstanceRecordProductServiceDeploymentServicingRequirements   {
  private String productServiceDeploymentServicingRequirementsWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String productServiceDeploymentServicingRequirementsTaskSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated deployment planning and deliverable specifications for the task 
   * @return productServiceDeploymentServicingRequirementsWorkProducts
  **/

  public String getProductServiceDeploymentServicingRequirementsWorkProducts() {
    return productServiceDeploymentServicingRequirementsWorkProducts;
  }

  public void setProductServiceDeploymentServicingRequirementsWorkProducts(String productServiceDeploymentServicingRequirementsWorkProducts) {
    this.productServiceDeploymentServicingRequirementsWorkProducts = productServiceDeploymentServicingRequirementsWorkProducts;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the tasks and deliverables needed to handle the servicing needs of the deployment 
   * @return productServiceDeploymentServicingRequirementsTaskSpecification
  **/

  public String getProductServiceDeploymentServicingRequirementsTaskSpecification() {
    return productServiceDeploymentServicingRequirementsTaskSpecification;
  }

  public void setProductServiceDeploymentServicingRequirementsTaskSpecification(String productServiceDeploymentServicingRequirementsTaskSpecification) {
    this.productServiceDeploymentServicingRequirementsTaskSpecification = productServiceDeploymentServicingRequirementsTaskSpecification;
  }


}

