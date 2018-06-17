/*
 * Grafana
 * Grafana Restful API.
 *
 * OpenAPI spec version: v1.0
 * Contact: wang@hashdata.cn
 *
 */


package cn.hashdata.grafana.api;

import cn.hashdata.grafana.model.CreateFolderCommand;
import cn.hashdata.grafana.model.Folder;
import cn.hashdata.grafana.model.FolderSearchHit;
import cn.hashdata.grafana.model.Message;
import cn.hashdata.grafana.model.UpdateFolderCommand;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GrafanaFolderEndpointApi
 */
@Ignore
public class GrafanaFolderEndpointApiTest {

    private final GrafanaFolderEndpointApi api = new GrafanaFolderEndpointApi();

    
    /**
     * CreateFolder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFolderUsingPOSTTest() {
        CreateFolderCommand request = null;
        Folder response = api.createFolderUsingPOST(request);

        // TODO: test validations
    }
    
    /**
     * DeleteFolder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFolderUsingDELETETest() {
        String uid = null;
        Message response = api.deleteFolderUsingDELETE(uid);

        // TODO: test validations
    }
    
    /**
     * GetFolderByUID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFolderByUIDUsingGETTest() {
        String uid = null;
        Folder response = api.getFolderByUIDUsingGET(uid);

        // TODO: test validations
    }
    
    /**
     * GetFolders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFoldersUsingGETTest() {
        Integer limit = null;
        List<FolderSearchHit> response = api.getFoldersUsingGET(limit);

        // TODO: test validations
    }
    
    /**
     * UpdateFolder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFolderUsingPUTTest() {
        UpdateFolderCommand request = null;
        String uid = null;
        Folder response = api.updateFolderUsingPUT(request, uid);

        // TODO: test validations
    }
    
}
