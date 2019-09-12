/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Develop;

@BianRestController
public class ProductDeploymentApiController {

	@Autowired
	ProductDeploymentApiService service;
	
	@Develop.Activate
	public BianResponse<SDProductDeploymentActivateOutputModel> activate(@RequestBody BianRequest<SDProductDeploymentActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Develop.Capture
	public BianResponse<CRProductOrServiceDeploymentProjectCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductOrServiceDeploymentProjectCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Develop.Configure
	public BianResponse<SDProductDeploymentConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductDeploymentConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Develop.Control
	public BianResponse<CRProductOrServiceDeploymentProjectControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductOrServiceDeploymentProjectControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Develop.Create
	public BianResponse<CRProductOrServiceDeploymentProjectCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRProductOrServiceDeploymentProjectCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("hroperations")
	@Develop.Exchange
	public BianResponse<BQHROperationsExchangeOutputModel> exchangeHroperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQHROperationsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeHroperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("itoperations")
	@Develop.Exchange
	public BianResponse<BQITOperationsExchangeOutputModel> exchangeItoperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQITOperationsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeItoperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionsupport")
	@Develop.Exchange
	public BianResponse<BQProductionSupportExchangeOutputModel> exchangeProductionsupport(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionSupportExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeProductionsupport(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Develop.Exchange
	public BianResponse<BQProductionExchangeOutputModel> exchangeProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeProduction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("salesandmarketing")
	@Develop.Exchange
	public BianResponse<BQSalesandMarketingExchangeOutputModel> exchangeSalesandmarketing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSalesandMarketingExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeSalesandmarketing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicing")
	@Develop.Exchange
	public BianResponse<BQServicingExchangeOutputModel> exchangeServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServicingExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeServicing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("systems")
	@Develop.Exchange
	public BianResponse<BQSystemsExchangeOutputModel> exchangeSystems(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSystemsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeSystems(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Develop.Exchange
	public BianResponse<CRProductOrServiceDeploymentProjectExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductOrServiceDeploymentProjectExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Develop.Feedback
	public BianResponse<SDProductDeploymentFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductDeploymentFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Develop.Grant
	public BianResponse<CRProductOrServiceDeploymentProjectGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductOrServiceDeploymentProjectGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("hroperations")
	@Develop.Request
	public BianResponse<BQHROperationsRequestOutputModel> requestHroperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQHROperationsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestHroperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("itoperations")
	@Develop.Request
	public BianResponse<BQITOperationsRequestOutputModel> requestItoperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQITOperationsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestItoperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionsupport")
	@Develop.Request
	public BianResponse<BQProductionSupportRequestOutputModel> requestProductionsupport(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionSupportRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProductionsupport(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Develop.Request
	public BianResponse<BQProductionRequestOutputModel> requestProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProduction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("salesandmarketing")
	@Develop.Request
	public BianResponse<BQSalesandMarketingRequestOutputModel> requestSalesandmarketing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSalesandMarketingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSalesandmarketing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicing")
	@Develop.Request
	public BianResponse<BQServicingRequestOutputModel> requestServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServicingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestServicing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("systems")
	@Develop.Request
	public BianResponse<BQSystemsRequestOutputModel> requestSystems(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSystemsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSystems(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Develop.Request
	public BianResponse<CRProductOrServiceDeploymentProjectRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductOrServiceDeploymentProjectRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Develop.Retrieve
	public BianResponse<CRProductOrServiceDeploymentProjectRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Develop.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Develop.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Develop.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("hroperations")
	@Develop.Retrieve
	public BianResponse<BQHROperationsRetrieveOutputModel> retrieveHroperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveHroperations(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("itoperations")
	@Develop.Retrieve
	public BianResponse<BQITOperationsRetrieveOutputModel> retrieveItoperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveItoperations(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("production")
	@Develop.Retrieve
	public BianResponse<BQProductionRetrieveOutputModel> retrieveProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProduction(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("productionsupport")
	@Develop.Retrieve
	public BianResponse<BQProductionSupportRetrieveOutputModel> retrieveProductionsupport(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductionsupport(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("salesandmarketing")
	@Develop.Retrieve
	public BianResponse<BQSalesandMarketingRetrieveOutputModel> retrieveSalesandmarketing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSalesandmarketing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicing")
	@Develop.Retrieve
	public BianResponse<BQServicingRetrieveOutputModel> retrieveServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("systems")
	@Develop.Retrieve
	public BianResponse<BQSystemsRetrieveOutputModel> retrieveSystems(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSystems(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Develop.RetrieveSD
	public BianResponse<SDProductDeploymentRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Develop.Update
	public BianResponse<CRProductOrServiceDeploymentProjectUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductOrServiceDeploymentProjectUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("hroperations")
	@Develop.Update
	public BianResponse<BQHROperationsUpdateOutputModel> updateHroperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQHROperationsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateHroperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("itoperations")
	@Develop.Update
	public BianResponse<BQITOperationsUpdateOutputModel> updateItoperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQITOperationsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateItoperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Develop.Update
	public BianResponse<BQProductionUpdateOutputModel> updateProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProduction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionsupport")
	@Develop.Update
	public BianResponse<BQProductionSupportUpdateOutputModel> updateProductionsupport(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionSupportUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProductionsupport(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("salesandmarketing")
	@Develop.Update
	public BianResponse<BQSalesandMarketingUpdateOutputModel> updateSalesandmarketing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSalesandMarketingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSalesandmarketing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicing")
	@Develop.Update
	public BianResponse<BQServicingUpdateOutputModel> updateServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServicingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateServicing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("systems")
	@Develop.Update
	public BianResponse<BQSystemsUpdateOutputModel> updateSystems(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSystemsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSystems(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
