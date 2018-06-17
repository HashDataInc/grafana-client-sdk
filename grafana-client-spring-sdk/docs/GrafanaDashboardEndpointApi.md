# GrafanaDashboardEndpointApi

All URIs are relative to *https://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAndUpdateDashboardUsingPOST**](GrafanaDashboardEndpointApi.md#createAndUpdateDashboardUsingPOST) | **POST** /api/dashboards/db | CreateAndUpdateDashboard
[**deleteDashboardByUIDUsingDELETE**](GrafanaDashboardEndpointApi.md#deleteDashboardByUIDUsingDELETE) | **DELETE** /api/dashboards/uid/{uid} | DeleteDashboardByUID
[**getDashboardByUIDUsingGET**](GrafanaDashboardEndpointApi.md#getDashboardByUIDUsingGET) | **GET** /api/dashboards/uid/{uid} | GetDashboardByUID
[**getDashboardTagsUsingGET**](GrafanaDashboardEndpointApi.md#getDashboardTagsUsingGET) | **GET** /api/dashboards/tags | GetDashboardTags
[**getHomeDashboardUsingGET**](GrafanaDashboardEndpointApi.md#getHomeDashboardUsingGET) | **GET** /api/dashboards/home | GetHomeDashboard


<a name="createAndUpdateDashboardUsingPOST"></a>
# **createAndUpdateDashboardUsingPOST**
> CreateDashboardResponse createAndUpdateDashboardUsingPOST(request)

CreateAndUpdateDashboard

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDashboardEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDashboardEndpointApi apiInstance = new GrafanaDashboardEndpointApi();
SaveDashboardCommand request = new SaveDashboardCommand(); // SaveDashboardCommand | request
try {
    CreateDashboardResponse result = apiInstance.createAndUpdateDashboardUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDashboardEndpointApi#createAndUpdateDashboardUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SaveDashboardCommand**](SaveDashboardCommand.md)| request |

### Return type

[**CreateDashboardResponse**](CreateDashboardResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDashboardByUIDUsingDELETE"></a>
# **deleteDashboardByUIDUsingDELETE**
> Message deleteDashboardByUIDUsingDELETE(uid)

DeleteDashboardByUID

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDashboardEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDashboardEndpointApi apiInstance = new GrafanaDashboardEndpointApi();
String uid = "uid_example"; // String | uid
try {
    Message result = apiInstance.deleteDashboardByUIDUsingDELETE(uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDashboardEndpointApi#deleteDashboardByUIDUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| uid |

### Return type

[**Message**](Message.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDashboardByUIDUsingGET"></a>
# **getDashboardByUIDUsingGET**
> DashboardFullWithMeta getDashboardByUIDUsingGET(uid)

GetDashboardByUID

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDashboardEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDashboardEndpointApi apiInstance = new GrafanaDashboardEndpointApi();
String uid = "uid_example"; // String | uid
try {
    DashboardFullWithMeta result = apiInstance.getDashboardByUIDUsingGET(uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDashboardEndpointApi#getDashboardByUIDUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| uid |

### Return type

[**DashboardFullWithMeta**](DashboardFullWithMeta.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDashboardTagsUsingGET"></a>
# **getDashboardTagsUsingGET**
> List&lt;DashboardTagCloudItem&gt; getDashboardTagsUsingGET()

GetDashboardTags

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDashboardEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDashboardEndpointApi apiInstance = new GrafanaDashboardEndpointApi();
try {
    List<DashboardTagCloudItem> result = apiInstance.getDashboardTagsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDashboardEndpointApi#getDashboardTagsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DashboardTagCloudItem&gt;**](DashboardTagCloudItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHomeDashboardUsingGET"></a>
# **getHomeDashboardUsingGET**
> DashboardFullWithMeta getHomeDashboardUsingGET(uid)

GetHomeDashboard

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaDashboardEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaDashboardEndpointApi apiInstance = new GrafanaDashboardEndpointApi();
String uid = "uid_example"; // String | uid
try {
    DashboardFullWithMeta result = apiInstance.getHomeDashboardUsingGET(uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaDashboardEndpointApi#getHomeDashboardUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| uid |

### Return type

[**DashboardFullWithMeta**](DashboardFullWithMeta.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

