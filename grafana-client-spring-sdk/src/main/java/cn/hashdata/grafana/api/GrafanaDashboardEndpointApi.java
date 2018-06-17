package cn.hashdata.grafana.api;

import cn.hashdata.grafana.ApiClient;

import cn.hashdata.grafana.model.CreateDashboardResponse;
import cn.hashdata.grafana.model.DashboardFullWithMeta;
import cn.hashdata.grafana.model.DashboardTagCloudItem;
import cn.hashdata.grafana.model.Message;
import cn.hashdata.grafana.model.SaveDashboardCommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-17T14:29:19.214Z")
@Component("cn.hashdata.grafana.api.GrafanaDashboardEndpointApi")
public class GrafanaDashboardEndpointApi {
    private ApiClient apiClient;

    public GrafanaDashboardEndpointApi() {
        this(new ApiClient());
    }

    @Autowired
    public GrafanaDashboardEndpointApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * CreateAndUpdateDashboard
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param request request
     * @return CreateDashboardResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateDashboardResponse createAndUpdateDashboardUsingPOST(SaveDashboardCommand request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling createAndUpdateDashboardUsingPOST");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/dashboards/db").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<CreateDashboardResponse> returnType = new ParameterizedTypeReference<CreateDashboardResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * DeleteDashboardByUID
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @param uid uid
     * @return Message
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Message deleteDashboardByUIDUsingDELETE(String uid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling deleteDashboardByUIDUsingDELETE");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/api/dashboards/uid/{uid}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<Message> returnType = new ParameterizedTypeReference<Message>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GetDashboardByUID
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param uid uid
     * @return DashboardFullWithMeta
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DashboardFullWithMeta getDashboardByUIDUsingGET(String uid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling getDashboardByUIDUsingGET");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/api/dashboards/uid/{uid}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<DashboardFullWithMeta> returnType = new ParameterizedTypeReference<DashboardFullWithMeta>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GetDashboardTags
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return List&lt;DashboardTagCloudItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DashboardTagCloudItem> getDashboardTagsUsingGET() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/dashboards/tags").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<List<DashboardTagCloudItem>> returnType = new ParameterizedTypeReference<List<DashboardTagCloudItem>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * GetHomeDashboard
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param uid uid
     * @return DashboardFullWithMeta
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DashboardFullWithMeta getHomeDashboardUsingGET(String uid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling getHomeDashboardUsingGET");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/api/dashboards/home").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<DashboardFullWithMeta> returnType = new ParameterizedTypeReference<DashboardFullWithMeta>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
