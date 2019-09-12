/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductDeploymentApiServiceImpl implements ProductDeploymentApiService {

	public SDProductDeploymentActivateOutputModel activate(SDProductDeploymentActivateInputModel request){
		return JsonReader.read("activate-SDProductDeploymentActivateOutputModel.json",new TypeReference<SDProductDeploymentActivateOutputModel>(){});
	}
	
	public CRProductOrServiceDeploymentProjectCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectCaptureInputModel request){
		return JsonReader.read("capture-CRProductOrServiceDeploymentProjectCaptureOutputModel.json",new TypeReference<CRProductOrServiceDeploymentProjectCaptureOutputModel>(){});
	}
	
	public SDProductDeploymentConfigureOutputModel configure(String sdReferenceId, SDProductDeploymentConfigureInputModel request){
		return JsonReader.read("configure-SDProductDeploymentConfigureOutputModel.json",new TypeReference<SDProductDeploymentConfigureOutputModel>(){});
	}
	
	public CRProductOrServiceDeploymentProjectControlOutputModel control(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectControlInputModel request){
		return JsonReader.read("control-CRProductOrServiceDeploymentProjectControlOutputModel.json",new TypeReference<CRProductOrServiceDeploymentProjectControlOutputModel>(){});
	}
	
	public CRProductOrServiceDeploymentProjectCreateOutputModel create(String sdReferenceId, CRProductOrServiceDeploymentProjectCreateInputModel request){
		return JsonReader.read("create-CRProductOrServiceDeploymentProjectCreateOutputModel.json",new TypeReference<CRProductOrServiceDeploymentProjectCreateOutputModel>(){});
	}
	
	public BQHROperationsExchangeOutputModel exchangeHroperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQHROperationsExchangeInputModel request){
		return JsonReader.read("exchange-BQHROperationsExchangeOutputModel.json",new TypeReference<BQHROperationsExchangeOutputModel>(){});
	}
	
	public BQITOperationsExchangeOutputModel exchangeItoperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQITOperationsExchangeInputModel request){
		return JsonReader.read("exchange-BQITOperationsExchangeOutputModel.json",new TypeReference<BQITOperationsExchangeOutputModel>(){});
	}
	
	public BQProductionSupportExchangeOutputModel exchangeProductionsupport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionSupportExchangeInputModel request){
		return JsonReader.read("exchange-BQProductionSupportExchangeOutputModel.json",new TypeReference<BQProductionSupportExchangeOutputModel>(){});
	}
	
	public BQProductionExchangeOutputModel exchangeProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionExchangeInputModel request){
		return JsonReader.read("exchange-BQProductionExchangeOutputModel.json",new TypeReference<BQProductionExchangeOutputModel>(){});
	}
	
	public BQSalesandMarketingExchangeOutputModel exchangeSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesandMarketingExchangeInputModel request){
		return JsonReader.read("exchange-BQSalesandMarketingExchangeOutputModel.json",new TypeReference<BQSalesandMarketingExchangeOutputModel>(){});
	}
	
	public BQServicingExchangeOutputModel exchangeServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingExchangeInputModel request){
		return JsonReader.read("exchange-BQServicingExchangeOutputModel.json",new TypeReference<BQServicingExchangeOutputModel>(){});
	}
	
	public BQSystemsExchangeOutputModel exchangeSystems(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSystemsExchangeInputModel request){
		return JsonReader.read("exchange-BQSystemsExchangeOutputModel.json",new TypeReference<BQSystemsExchangeOutputModel>(){});
	}
	
	public CRProductOrServiceDeploymentProjectExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectExchangeInputModel request){
		return JsonReader.read("exchange-CRProductOrServiceDeploymentProjectExchangeOutputModel.json",new TypeReference<CRProductOrServiceDeploymentProjectExchangeOutputModel>(){});
	}
	
	public SDProductDeploymentFeedbackOutputModel feedback(String sdReferenceId, SDProductDeploymentFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductDeploymentFeedbackOutputModel.json",new TypeReference<SDProductDeploymentFeedbackOutputModel>(){});
	}
	
	public CRProductOrServiceDeploymentProjectGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectGrantInputModel request){
		return JsonReader.read("grant-CRProductOrServiceDeploymentProjectGrantOutputModel.json",new TypeReference<CRProductOrServiceDeploymentProjectGrantOutputModel>(){});
	}
	
	public BQHROperationsRequestOutputModel requestHroperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQHROperationsRequestInputModel request){
		return JsonReader.read("request-BQHROperationsRequestOutputModel.json",new TypeReference<BQHROperationsRequestOutputModel>(){});
	}
	
	public BQITOperationsRequestOutputModel requestItoperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQITOperationsRequestInputModel request){
		return JsonReader.read("request-BQITOperationsRequestOutputModel.json",new TypeReference<BQITOperationsRequestOutputModel>(){});
	}
	
	public BQProductionSupportRequestOutputModel requestProductionsupport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionSupportRequestInputModel request){
		return JsonReader.read("request-BQProductionSupportRequestOutputModel.json",new TypeReference<BQProductionSupportRequestOutputModel>(){});
	}
	
	public BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request){
		return JsonReader.read("request-BQProductionRequestOutputModel.json",new TypeReference<BQProductionRequestOutputModel>(){});
	}
	
	public BQSalesandMarketingRequestOutputModel requestSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesandMarketingRequestInputModel request){
		return JsonReader.read("request-BQSalesandMarketingRequestOutputModel.json",new TypeReference<BQSalesandMarketingRequestOutputModel>(){});
	}
	
	public BQServicingRequestOutputModel requestServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingRequestInputModel request){
		return JsonReader.read("request-BQServicingRequestOutputModel.json",new TypeReference<BQServicingRequestOutputModel>(){});
	}
	
	public BQSystemsRequestOutputModel requestSystems(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSystemsRequestInputModel request){
		return JsonReader.read("request-BQSystemsRequestOutputModel.json",new TypeReference<BQSystemsRequestOutputModel>(){});
	}
	
	public CRProductOrServiceDeploymentProjectRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectRequestInputModel request){
		return JsonReader.read("request-CRProductOrServiceDeploymentProjectRequestOutputModel.json",new TypeReference<CRProductOrServiceDeploymentProjectRequestOutputModel>(){});
	}
	
	public CRProductOrServiceDeploymentProjectRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductOrServiceDeploymentProjectRetrieveOutputModel.json",new TypeReference<CRProductOrServiceDeploymentProjectRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQHROperationsRetrieveOutputModel retrieveHroperations(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQHROperationsRetrieveOutputModel.json",new TypeReference<BQHROperationsRetrieveOutputModel>(){});
	}
	
	public BQITOperationsRetrieveOutputModel retrieveItoperations(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQITOperationsRetrieveOutputModel.json",new TypeReference<BQITOperationsRetrieveOutputModel>(){});
	}
	
	public BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductionRetrieveOutputModel.json",new TypeReference<BQProductionRetrieveOutputModel>(){});
	}
	
	public BQProductionSupportRetrieveOutputModel retrieveProductionsupport(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductionSupportRetrieveOutputModel.json",new TypeReference<BQProductionSupportRetrieveOutputModel>(){});
	}
	
	public BQSalesandMarketingRetrieveOutputModel retrieveSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSalesandMarketingRetrieveOutputModel.json",new TypeReference<BQSalesandMarketingRetrieveOutputModel>(){});
	}
	
	public BQServicingRetrieveOutputModel retrieveServicing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServicingRetrieveOutputModel.json",new TypeReference<BQServicingRetrieveOutputModel>(){});
	}
	
	public BQSystemsRetrieveOutputModel retrieveSystems(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSystemsRetrieveOutputModel.json",new TypeReference<BQSystemsRetrieveOutputModel>(){});
	}
	
	public SDProductDeploymentRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductDeploymentRetrieveOutputModel.json",new TypeReference<SDProductDeploymentRetrieveOutputModel>(){});
	}
	
	public CRProductOrServiceDeploymentProjectUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductOrServiceDeploymentProjectUpdateInputModel request){
		return JsonReader.read("update-CRProductOrServiceDeploymentProjectUpdateOutputModel.json",new TypeReference<CRProductOrServiceDeploymentProjectUpdateOutputModel>(){});
	}
	
	public BQHROperationsUpdateOutputModel updateHroperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQHROperationsUpdateInputModel request){
		return JsonReader.read("update-BQHROperationsUpdateOutputModel.json",new TypeReference<BQHROperationsUpdateOutputModel>(){});
	}
	
	public BQITOperationsUpdateOutputModel updateItoperations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQITOperationsUpdateInputModel request){
		return JsonReader.read("update-BQITOperationsUpdateOutputModel.json",new TypeReference<BQITOperationsUpdateOutputModel>(){});
	}
	
	public BQProductionUpdateOutputModel updateProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionUpdateInputModel request){
		return JsonReader.read("update-BQProductionUpdateOutputModel.json",new TypeReference<BQProductionUpdateOutputModel>(){});
	}
	
	public BQProductionSupportUpdateOutputModel updateProductionsupport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionSupportUpdateInputModel request){
		return JsonReader.read("update-BQProductionSupportUpdateOutputModel.json",new TypeReference<BQProductionSupportUpdateOutputModel>(){});
	}
	
	public BQSalesandMarketingUpdateOutputModel updateSalesandmarketing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesandMarketingUpdateInputModel request){
		return JsonReader.read("update-BQSalesandMarketingUpdateOutputModel.json",new TypeReference<BQSalesandMarketingUpdateOutputModel>(){});
	}
	
	public BQServicingUpdateOutputModel updateServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingUpdateInputModel request){
		return JsonReader.read("update-BQServicingUpdateOutputModel.json",new TypeReference<BQServicingUpdateOutputModel>(){});
	}
	
	public BQSystemsUpdateOutputModel updateSystems(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSystemsUpdateInputModel request){
		return JsonReader.read("update-BQSystemsUpdateOutputModel.json",new TypeReference<BQSystemsUpdateOutputModel>(){});
	}
	
}
