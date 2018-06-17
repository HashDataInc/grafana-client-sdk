/*
 * Grafana
 * Grafana Restful API.
 *
 * OpenAPI spec version: v1.0
 * Contact: wang@hashdata.cn
 *
 */


package cn.hashdata.grafana.api;

import cn.hashdata.grafana.ApiClient;
import cn.hashdata.grafana.model.AddDataSourceCommand;
import cn.hashdata.grafana.model.CreateDataSourceResponse;
import cn.hashdata.grafana.model.DataSource;
import cn.hashdata.grafana.model.DataSourceListItem;
import cn.hashdata.grafana.model.Id;
import cn.hashdata.grafana.model.UpdateDataSourceCommand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestClientException;

/**
 * API tests for GrafanaDataSourceEndpointApi
 */
public class GrafanaDataSourceEndpointApiTest {

    private final GrafanaDataSourceEndpointApi api = new GrafanaDataSourceEndpointApi();

    @Before
    public void setup() {
        ApiClient client = api.getApiClient();
        client.setBasePath("http://localhost:3000");
        client.setUsername("admin");
        client.setPassword("admin");
    }

    private DataSource addDataSource() {
        Map<String, String> options = new HashMap<>();
        options.put("sslmode", "disable");

        Map<String, String> secureOptions = new HashMap<>();
        secureOptions.put("password", "123456");

        AddDataSourceCommand request = new AddDataSourceCommand()
                .type("postgres")
                .name(UUID.randomUUID().toString())
                .url("192.168.253.5:5432")
                .access("proxy")
                .database("postgres")
                .user("postgres")
                .jsonData(options)
                .secureJsonData(secureOptions);
        try {
            CreateDataSourceResponse response = api.addDataSourceUsingPOST(request);
            System.err.println(response);
            return response.getDatasource();
        } catch (RestClientException e) {
            System.err.println(e);
            Assert.fail();
        }

        return null;
    }

    /**
     * AddDataSource
     *
     * @throws RestClientException if the Api call fails
     */
    @Test
    public void addDataSourceUsingPOSTTest() {
        addDataSource();
    }

    /**
     * DeleteDataSourceByID
     *
     * @throws RestClientException if the Api call fails
     */
    @Test
    public void deleteDataSourceByIDUsingDELETETest() {
        Long id = addDataSource().getId();
        api.deleteDataSourceByIDUsingDELETE(id);
    }

    /**
     * DeleteDataSourceByName
     *
     * @throws RestClientException if the Api call fails
     */
    @Test
    public void deleteDataSourceByNameUsingDELETETest() {
        String name = addDataSource().getName();
        api.deleteDataSourceByNameUsingDELETE(name);
    }

    /**
     * GetDataSourceByID
     *
     * @throws RestClientException if the Api call fails
     */
    @Test
    public void getDataSourceByIDUsingGETTest() {
        DataSource target = addDataSource();
        DataSource response = api.getDataSourceByIDUsingGET(target.getId());

        Assert.assertEquals(target, response);
    }

    /**
     * GetDataSourceByName
     *
     * @throws RestClientException if the Api call fails
     */
    @Test
    public void getDataSourceByNameUsingGETTest() {
        DataSource target = addDataSource();
        DataSource response = api.getDataSourceByNameUsingGET(target.getName());
        target.readOnly(true);
        Assert.assertEquals(target, response);
    }

    /**
     * GetDataSourceIDByName
     *
     * @throws RestClientException if the Api call fails
     */
    @Test
    public void getDataSourceIDByNameUsingGETTest() {
        DataSource target = addDataSource();
        Id response = api.getDataSourceIDByNameUsingGET(target.getName());

        Assert.assertEquals(target.getId(), response.getId());
    }

    /**
     * GetDataSources
     *
     * @throws RestClientException if the Api call fails
     */
    @Test
    public void getDataSourcesUsingGETTest() {
        addDataSource();
        List<DataSourceListItem> response = api.getDataSourcesUsingGET();
        Assert.assertFalse(response.isEmpty());
    }

    /**
     * UpdateDataSource
     *
     * @throws RestClientException if the Api call fails
     */
    @Test
    public void updateDataSourceUsingPUTTest() {
        DataSource target = addDataSource();

        Map<String, String> options = new HashMap<>();
        options.put("sslmode", "disable");

        Map<String, String> secureOptions = new HashMap<>();
        secureOptions.put("password", "1234567");


        UpdateDataSourceCommand request = new UpdateDataSourceCommand()
                .type("postgres")
                .name(target.getName())
                .url(target.getUrl())
                .access(target.getAccess())
                .database(target.getDatabase())
                .user(target.getUser())
                .jsonData(options)
                .secureJsonData(secureOptions);

        api.updateDataSourceUsingPUT(request, target.getId());
    }
}
