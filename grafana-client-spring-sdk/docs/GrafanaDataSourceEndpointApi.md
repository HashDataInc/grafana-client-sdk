# GrafanaDataSourceEndpointApi

All URIs are relative to *https://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDataSourceUsingPOST**](GrafanaDataSourceEndpointApi.md#addDataSourceUsingPOST) | **POST** /api/datasources | AddDataSource
[**deleteDataSourceByIDUsingDELETE**](GrafanaDataSourceEndpointApi.md#deleteDataSourceByIDUsingDELETE) | **DELETE** /api/datasources/{id} | DeleteDataSourceByID
[**deleteDataSourceByNameUsingDELETE**](GrafanaDataSourceEndpointApi.md#deleteDataSourceByNameUsingDELETE) | **DELETE** /api/datasources/name/{name} | DeleteDataSourceByName
[**getDataSourceByIDUsingGET**](GrafanaDataSourceEndpointApi.md#getDataSourceByIDUsingGET) | **GET** /api/datasources/{id} | GetDataSourceByID
[**getDataSourceByNameUsingGET**](GrafanaDataSourceEndpointApi.md#getDataSourceByNameUsingGET) | **GET** /api/datasources/name/{name} | GetDataSourceByName
[**getDataSourceIDByNameUsingGET**](GrafanaDataSourceEndpointApi.md#getDataSourceIDByNameUsingGET) | **GET** /api/datasources/id/{name} | GetDataSourceIDByName
[**getDataSourcesUsingGET**](GrafanaDataSourceEndpointApi.md#getDataSourcesUsingGET) | **GET** /api/datasources | GetDataSources
[**updateDataSourceUsingPUT**](GrafanaDataSourceEndpointApi.md#updateDataSourceUsingPUT) | **PUT** /api/datasources/{id} | UpdateDataSource


<a name="addDataSourceUsingPOST"></a>
# **addDataSourceUsingPOST**
> CreateDataSourceResponse addDataSourceUsingPOST(request)

AddDataSource

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDataSourceEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDataSourceEndpointApi apiInstance = new GrafanaDataSourceEndpointApi();
AddDataSourceCommand request = new AddDataSourceCommand(); // AddDataSourceCommand | request
try {
    CreateDataSourceResponse result = apiInstance.addDataSourceUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDataSourceEndpointApi#addDataSourceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AddDataSourceCommand**](AddDataSourceCommand.md)| request |

### Return type

[**CreateDataSourceResponse**](CreateDataSourceResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDataSourceByIDUsingDELETE"></a>
# **deleteDataSourceByIDUsingDELETE**
> SuccessMessage deleteDataSourceByIDUsingDELETE(id)

DeleteDataSourceByID

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDataSourceEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDataSourceEndpointApi apiInstance = new GrafanaDataSourceEndpointApi();
Long id = 789L; // Long | id
try {
    SuccessMessage result = apiInstance.deleteDataSourceByIDUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDataSourceEndpointApi#deleteDataSourceByIDUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteDataSourceByNameUsingDELETE"></a>
# **deleteDataSourceByNameUsingDELETE**
> SuccessMessage deleteDataSourceByNameUsingDELETE(name)

DeleteDataSourceByName

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDataSourceEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDataSourceEndpointApi apiInstance = new GrafanaDataSourceEndpointApi();
String name = "name_example"; // String | name
try {
    SuccessMessage result = apiInstance.deleteDataSourceByNameUsingDELETE(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDataSourceEndpointApi#deleteDataSourceByNameUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDataSourceByIDUsingGET"></a>
# **getDataSourceByIDUsingGET**
> DataSource getDataSourceByIDUsingGET(id)

GetDataSourceByID

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDataSourceEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDataSourceEndpointApi apiInstance = new GrafanaDataSourceEndpointApi();
Long id = 789L; // Long | id
try {
    DataSource result = apiInstance.getDataSourceByIDUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDataSourceEndpointApi#getDataSourceByIDUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**DataSource**](DataSource.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDataSourceByNameUsingGET"></a>
# **getDataSourceByNameUsingGET**
> DataSource getDataSourceByNameUsingGET(name)

GetDataSourceByName

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDataSourceEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDataSourceEndpointApi apiInstance = new GrafanaDataSourceEndpointApi();
String name = "name_example"; // String | name
try {
    DataSource result = apiInstance.getDataSourceByNameUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDataSourceEndpointApi#getDataSourceByNameUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |

### Return type

[**DataSource**](DataSource.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDataSourceIDByNameUsingGET"></a>
# **getDataSourceIDByNameUsingGET**
> Id getDataSourceIDByNameUsingGET(name)

GetDataSourceIDByName

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDataSourceEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDataSourceEndpointApi apiInstance = new GrafanaDataSourceEndpointApi();
String name = "name_example"; // String | name
try {
    Id result = apiInstance.getDataSourceIDByNameUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDataSourceEndpointApi#getDataSourceIDByNameUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |

### Return type

[**Id**](Id.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDataSourcesUsingGET"></a>
# **getDataSourcesUsingGET**
> List&lt;DataSourceListItem&gt; getDataSourcesUsingGET()

GetDataSources

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDataSourceEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDataSourceEndpointApi apiInstance = new GrafanaDataSourceEndpointApi();
try {
    List<DataSourceListItem> result = apiInstance.getDataSourcesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDataSourceEndpointApi#getDataSourcesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DataSourceListItem&gt;**](DataSourceListItem.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateDataSourceUsingPUT"></a>
# **updateDataSourceUsingPUT**
> CreateDataSourceResponse updateDataSourceUsingPUT(request, id)

UpdateDataSource

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDataSourceEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDataSourceEndpointApi apiInstance = new GrafanaDataSourceEndpointApi();
UpdateDataSourceCommand request = new UpdateDataSourceCommand(); // UpdateDataSourceCommand | request
Long id = 789L; // Long | id
try {
    CreateDataSourceResponse result = apiInstance.updateDataSourceUsingPUT(request, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDataSourceEndpointApi#updateDataSourceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UpdateDataSourceCommand**](UpdateDataSourceCommand.md)| request |
 **id** | **Long**| id |

### Return type

[**CreateDataSourceResponse**](CreateDataSourceResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

