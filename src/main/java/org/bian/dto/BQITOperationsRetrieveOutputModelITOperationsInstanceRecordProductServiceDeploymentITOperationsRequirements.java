package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITOperationsRetrieveOutputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements
 */
public class BQITOperationsRetrieveOutputModelITOperationsInstanceRecordProductServiceDeploymentITOperationsRequirements   {
  private String productServiceDeploymentITOperationsRequirementsWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String productServiceDeploymentITOperationsRequirementsTaskSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated deployment planning and deliverable specifications for the task 
   * @return productServiceDeploymentITOperationsRequirementsWorkProducts
  **/

  public String getProductServiceDeploymentITOperationsRequirementsWorkProducts() {
    return productServiceDeploymentITOperationsRequirementsWorkProducts;
  }

  public void setProductServiceDeploymentITOperationsRequirementsWorkProducts(String productServiceDeploymentITOperationsRequirementsWorkProducts) {
    this.productServiceDeploymentITOperationsRequirementsWorkProducts = productServiceDeploymentITOperationsRequirementsWorkProducts;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the tasks and deliverables needed to handle the IT operations needs of the deployment 
   * @return productServiceDeploymentITOperationsRequirementsTaskSpecification
  **/

  public String getProductServiceDeploymentITOperationsRequirementsTaskSpecification() {
    return productServiceDeploymentITOperationsRequirementsTaskSpecification;
  }

  public void setProductServiceDeploymentITOperationsRequirementsTaskSpecification(String productServiceDeploymentITOperationsRequirementsTaskSpecification) {
    this.productServiceDeploymentITOperationsRequirementsTaskSpecification = productServiceDeploymentITOperationsRequirementsTaskSpecification;
  }


}

