/*
 * Grafana
 * Grafana Restful API.
 *
 * OpenAPI spec version: v1.0
 * Contact: wang@hashdata.cn
 *
 */


package cn.hashdata.grafana.api;

import cn.hashdata.grafana.model.CreateDashboardResponse;
import cn.hashdata.grafana.model.DashboardFullWithMeta;
import cn.hashdata.grafana.model.DashboardTagCloudItem;
import cn.hashdata.grafana.model.Message;
import cn.hashdata.grafana.model.SaveDashboardCommand;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GrafanaDashboardEndpointApi
 */
@Ignore
public class GrafanaDashboardEndpointApiTest {

    private final GrafanaDashboardEndpointApi api = new GrafanaDashboardEndpointApi();

    
    /**
     * CreateAndUpdateDashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAndUpdateDashboardUsingPOSTTest() {
        SaveDashboardCommand request = null;
        CreateDashboardResponse response = api.createAndUpdateDashboardUsingPOST(request);

        // TODO: test validations
    }
    
    /**
     * DeleteDashboardByUID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDashboardByUIDUsingDELETETest() {
        String uid = null;
        Message response = api.deleteDashboardByUIDUsingDELETE(uid);

        // TODO: test validations
    }
    
    /**
     * GetDashboardByUID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDashboardByUIDUsingGETTest() {
        String uid = null;
        DashboardFullWithMeta response = api.getDashboardByUIDUsingGET(uid);

        // TODO: test validations
    }
    
    /**
     * GetDashboardTags
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDashboardTagsUsingGETTest() {
        List<DashboardTagCloudItem> response = api.getDashboardTagsUsingGET();

        // TODO: test validations
    }
    
    /**
     * GetHomeDashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHomeDashboardUsingGETTest() {
        String uid = null;
        DashboardFullWithMeta response = api.getHomeDashboardUsingGET(uid);

        // TODO: test validations
    }
    
}
