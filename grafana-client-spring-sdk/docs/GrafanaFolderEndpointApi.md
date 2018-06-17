# GrafanaFolderEndpointApi

All URIs are relative to *https://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFolderUsingPOST**](GrafanaFolderEndpointApi.md#createFolderUsingPOST) | **POST** /api/folders | CreateFolder
[**deleteFolderUsingDELETE**](GrafanaFolderEndpointApi.md#deleteFolderUsingDELETE) | **DELETE** /api/folders/{uid} | DeleteFolder
[**getFolderByUIDUsingGET**](GrafanaFolderEndpointApi.md#getFolderByUIDUsingGET) | **GET** /api/folders/{uid} | GetFolderByUID
[**getFoldersUsingGET**](GrafanaFolderEndpointApi.md#getFoldersUsingGET) | **GET** /api/folders | GetFolders
[**updateFolderUsingPUT**](GrafanaFolderEndpointApi.md#updateFolderUsingPUT) | **PUT** /api/folders/{uid} | UpdateFolder


<a name="createFolderUsingPOST"></a>
# **createFolderUsingPOST**
> Folder createFolderUsingPOST(request)

CreateFolder

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaFolderEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaFolderEndpointApi apiInstance = new GrafanaFolderEndpointApi();
CreateFolderCommand request = new CreateFolderCommand(); // CreateFolderCommand | request
try {
    Folder result = apiInstance.createFolderUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaFolderEndpointApi#createFolderUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateFolderCommand**](CreateFolderCommand.md)| request |

### Return type

[**Folder**](Folder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteFolderUsingDELETE"></a>
# **deleteFolderUsingDELETE**
> Message deleteFolderUsingDELETE(uid)

DeleteFolder

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaFolderEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaFolderEndpointApi apiInstance = new GrafanaFolderEndpointApi();
String uid = "uid_example"; // String | uid
try {
    Message result = apiInstance.deleteFolderUsingDELETE(uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaFolderEndpointApi#deleteFolderUsingDELETE");
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

<a name="getFolderByUIDUsingGET"></a>
# **getFolderByUIDUsingGET**
> Folder getFolderByUIDUsingGET(uid)

GetFolderByUID

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaFolderEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaFolderEndpointApi apiInstance = new GrafanaFolderEndpointApi();
String uid = "uid_example"; // String | uid
try {
    Folder result = apiInstance.getFolderByUIDUsingGET(uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaFolderEndpointApi#getFolderByUIDUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| uid |

### Return type

[**Folder**](Folder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFoldersUsingGET"></a>
# **getFoldersUsingGET**
> List&lt;FolderSearchHit&gt; getFoldersUsingGET(limit)

GetFolders

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaFolderEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaFolderEndpointApi apiInstance = new GrafanaFolderEndpointApi();
Integer limit = 56; // Integer | limit
try {
    List<FolderSearchHit> result = apiInstance.getFoldersUsingGET(limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaFolderEndpointApi#getFoldersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| limit | [optional]

### Return type

[**List&lt;FolderSearchHit&gt;**](FolderSearchHit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateFolderUsingPUT"></a>
# **updateFolderUsingPUT**
> Folder updateFolderUsingPUT(request, uid)

UpdateFolder

### Example
```java
// Import classes:
//import cn.hashdata.grafana.ApiClient;
//import cn.hashdata.grafana.ApiException;
//import cn.hashdata.grafana.Configuration;
//import cn.hashdata.grafana.auth.*;
//import cn.hashdata.grafana.api.GrafanaFolderEndpointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GrafanaFolderEndpointApi apiInstance = new GrafanaFolderEndpointApi();
UpdateFolderCommand request = new UpdateFolderCommand(); // UpdateFolderCommand | request
String uid = "uid_example"; // String | uid
try {
    Folder result = apiInstance.updateFolderUsingPUT(request, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafanaFolderEndpointApi#updateFolderUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UpdateFolderCommand**](UpdateFolderCommand.md)| request |
 **uid** | **String**| uid |

### Return type

[**Folder**](Folder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

