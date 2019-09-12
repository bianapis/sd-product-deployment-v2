/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductDeploymentApiService {

	SDProductDeploymentActivateOutputModel activate(SDProductDeploymentActivateInputModel request);
	
	CRProductOrServiceDeploymentProjectCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectCaptureInputModel request);
	
	SDProductDeploymentConfigureOutputModel configure(String sdReferenceId, SDProductDeploymentConfigureInputModel request);
	
	CRProductOrServiceDeploymentProjectControlOutputModel control(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectControlInputModel request);
	
	CRProductOrServiceDeploymentProjectCreateOutputModel create(String sdReferenceId, CRProductOrServiceDeploymentProjectCreateInputModel request);
	
	BQHROperationsExchangeOutputModel exchangeHroperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQHROperationsExchangeInputModel request);
	
	BQITOperationsExchangeOutputModel exchangeItoperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQITOperationsExchangeInputModel request);
	
	BQProductionSupportExchangeOutputModel exchangeProductionsupport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionSupportExchangeInputModel request);
	
	BQProductionExchangeOutputModel exchangeProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionExchangeInputModel request);
	
	BQSalesandMarketingExchangeOutputModel exchangeSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesandMarketingExchangeInputModel request);
	
	BQServicingExchangeOutputModel exchangeServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingExchangeInputModel request);
	
	BQSystemsExchangeOutputModel exchangeSystems(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSystemsExchangeInputModel request);
	
	CRProductOrServiceDeploymentProjectExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectExchangeInputModel request);
	
	SDProductDeploymentFeedbackOutputModel feedback(String sdReferenceId, SDProductDeploymentFeedbackInputModel request);
	
	CRProductOrServiceDeploymentProjectGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectGrantInputModel request);
	
	BQHROperationsRequestOutputModel requestHroperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQHROperationsRequestInputModel request);
	
	BQITOperationsRequestOutputModel requestItoperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQITOperationsRequestInputModel request);
	
	BQProductionSupportRequestOutputModel requestProductionsupport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionSupportRequestInputModel request);
	
	BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request);
	
	BQSalesandMarketingRequestOutputModel requestSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesandMarketingRequestInputModel request);
	
	BQServicingRequestOutputModel requestServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingRequestInputModel request);
	
	BQSystemsRequestOutputModel requestSystems(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSystemsRequestInputModel request);
	
	CRProductOrServiceDeploymentProjectRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectRequestInputModel request);
	
	CRProductOrServiceDeploymentProjectRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQHROperationsRetrieveOutputModel retrieveHroperations(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQITOperationsRetrieveOutputModel retrieveItoperations(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductionSupportRetrieveOutputModel retrieveProductionsupport(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSalesandMarketingRetrieveOutputModel retrieveSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServicingRetrieveOutputModel retrieveServicing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSystemsRetrieveOutputModel retrieveSystems(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDProductDeploymentRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductOrServiceDeploymentProjectUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectUpdateInputModel request);
	
	BQHROperationsUpdateOutputModel updateHroperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQHROperationsUpdateInputModel request);
	
	BQITOperationsUpdateOutputModel updateItoperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQITOperationsUpdateInputModel request);
	
	BQProductionUpdateOutputModel updateProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionUpdateInputModel request);
	
	BQProductionSupportUpdateOutputModel updateProductionsupport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionSupportUpdateInputModel request);
	
	BQSalesandMarketingUpdateOutputModel updateSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesandMarketingUpdateInputModel request);
	
	BQServicingUpdateOutputModel updateServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingUpdateInputModel request);
	
	BQSystemsUpdateOutputModel updateSystems(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSystemsUpdateInputModel request);
	
}
