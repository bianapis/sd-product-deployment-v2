package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQHROperationsRequestInputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements
 */
public class BQHROperationsRequestInputModelHROperationsInstanceRecordProductServiceDeploymentHROperationsRequirements   {
  private String productServiceDeploymentHROperationsRequirementsWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String productServiceDeploymentHROperationsRequirementsTaskSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated deployment planning and deliverable specifications for the task 
   * @return productServiceDeploymentHROperationsRequirementsWorkProducts
  **/

  public String getProductServiceDeploymentHROperationsRequirementsWorkProducts() {
    return productServiceDeploymentHROperationsRequirementsWorkProducts;
  }

  public void setProductServiceDeploymentHROperationsRequirementsWorkProducts(String productServiceDeploymentHROperationsRequirementsWorkProducts) {
    this.productServiceDeploymentHROperationsRequirementsWorkProducts = productServiceDeploymentHROperationsRequirementsWorkProducts;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the tasks and deliverables needed to handle the staffing operations needs of the deployment 
   * @return productServiceDeploymentHROperationsRequirementsTaskSpecification
  **/

  public String getProductServiceDeploymentHROperationsRequirementsTaskSpecification() {
    return productServiceDeploymentHROperationsRequirementsTaskSpecification;
  }

  public void setProductServiceDeploymentHROperationsRequirementsTaskSpecification(String productServiceDeploymentHROperationsRequirementsTaskSpecification) {
    this.productServiceDeploymentHROperationsRequirementsTaskSpecification = productServiceDeploymentHROperationsRequirementsTaskSpecification;
  }


}

