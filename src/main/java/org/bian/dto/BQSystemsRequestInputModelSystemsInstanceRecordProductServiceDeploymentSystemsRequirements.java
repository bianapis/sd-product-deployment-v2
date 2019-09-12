package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSystemsRequestInputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements
 */
public class BQSystemsRequestInputModelSystemsInstanceRecordProductServiceDeploymentSystemsRequirements   {
  private String productServiceDeploymentSystemsRequirementsWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String productServiceDeploymentSystemsRequirementsTaskSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated deployment planning and deliverable specifications for the task 
   * @return productServiceDeploymentSystemsRequirementsWorkProducts
  **/

  public String getProductServiceDeploymentSystemsRequirementsWorkProducts() {
    return productServiceDeploymentSystemsRequirementsWorkProducts;
  }

  public void setProductServiceDeploymentSystemsRequirementsWorkProducts(String productServiceDeploymentSystemsRequirementsWorkProducts) {
    this.productServiceDeploymentSystemsRequirementsWorkProducts = productServiceDeploymentSystemsRequirementsWorkProducts;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the tasks and deliverables needed to handle the systems needs of the deployment 
   * @return productServiceDeploymentSystemsRequirementsTaskSpecification
  **/

  public String getProductServiceDeploymentSystemsRequirementsTaskSpecification() {
    return productServiceDeploymentSystemsRequirementsTaskSpecification;
  }

  public void setProductServiceDeploymentSystemsRequirementsTaskSpecification(String productServiceDeploymentSystemsRequirementsTaskSpecification) {
    this.productServiceDeploymentSystemsRequirementsTaskSpecification = productServiceDeploymentSystemsRequirementsTaskSpecification;
  }


}

