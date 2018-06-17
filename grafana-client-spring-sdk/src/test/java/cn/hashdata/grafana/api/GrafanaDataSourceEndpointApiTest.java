/*
 * Grafana
 * Grafana Restful API.
 *
 * OpenAPI spec version: v1.0
 * Contact: wang@hashdata.cn
 *
 */


package cn.hashdata.grafana.api;

import cn.hashdata.grafana.model.AddDataSourceCommand;
import cn.hashdata.grafana.model.CreateDataSourceResponse;
import cn.hashdata.grafana.model.DataSource;
import cn.hashdata.grafana.model.DataSourceListItem;
import cn.hashdata.grafana.model.Id;
import cn.hashdata.grafana.model.SuccessMessage;
import cn.hashdata.grafana.model.UpdateDataSourceCommand;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GrafanaDataSourceEndpointApi
 */
@Ignore
public class GrafanaDataSourceEndpointApiTest {

    private final GrafanaDataSourceEndpointApi api = new GrafanaDataSourceEndpointApi();

    
    /**
     * AddDataSource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDataSourceUsingPOSTTest() {
        AddDataSourceCommand request = null;
        CreateDataSourceResponse response = api.addDataSourceUsingPOST(request);

        // TODO: test validations
    }
    
    /**
     * DeleteDataSourceByID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDataSourceByIDUsingDELETETest() {
        String id = null;
        SuccessMessage response = api.deleteDataSourceByIDUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * DeleteDataSourceByName
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDataSourceByNameUsingDELETETest() {
        String name = null;
        SuccessMessage response = api.deleteDataSourceByNameUsingDELETE(name);

        // TODO: test validations
    }
    
    /**
     * GetDataSourceByID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataSourceByIDUsingGETTest() {
        String id = null;
        DataSource response = api.getDataSourceByIDUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * GetDataSourceByName
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataSourceByNameUsingGETTest() {
        String name = null;
        DataSource response = api.getDataSourceByNameUsingGET(name);

        // TODO: test validations
    }
    
    /**
     * GetDataSourceIDByName
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataSourceIDByNameUsingGETTest() {
        String name = null;
        Id response = api.getDataSourceIDByNameUsingGET(name);

        // TODO: test validations
    }
    
    /**
     * GetDataSources
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataSourcesUsingGETTest() {
        List<DataSourceListItem> response = api.getDataSourcesUsingGET();

        // TODO: test validations
    }
    
    /**
     * UpdateDataSource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDataSourceUsingPUTTest() {
        UpdateDataSourceCommand request = null;
        String id = null;
        CreateDataSourceResponse response = api.updateDataSourceUsingPUT(request, id);

        // TODO: test validations
    }
    
}
