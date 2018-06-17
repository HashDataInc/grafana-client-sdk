/*
 * Grafana
 * Grafana Restful API.
 *
 * OpenAPI spec version: v1.0
 * Contact: wang@hashdata.cn
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cn.hashdata.grafana.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DataSourceListItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-17T15:47:40.212Z")
public class DataSourceListItem {
  @JsonProperty("access")
  private String access = null;

  @JsonProperty("basicAuth")
  private Boolean basicAuth = null;

  @JsonProperty("database")
  private String database = null;

  @JsonProperty("default")
  private Boolean _default = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("jsonData")
  private Object jsonData = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("orgId")
  private Long orgId = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("readOnly")
  private Boolean readOnly = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("typeLogoUrl")
  private String typeLogoUrl = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("user")
  private String user = null;

  public DataSourceListItem access(String access) {
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @ApiModelProperty(value = "")
  public String getAccess() {
    return access;
  }

  public void setAccess(String access) {
    this.access = access;
  }

  public DataSourceListItem basicAuth(Boolean basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @ApiModelProperty(value = "")
  public Boolean isBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(Boolean basicAuth) {
    this.basicAuth = basicAuth;
  }

  public DataSourceListItem database(String database) {
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @ApiModelProperty(value = "")
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public DataSourceListItem _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(value = "")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public DataSourceListItem id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DataSourceListItem jsonData(Object jsonData) {
    this.jsonData = jsonData;
    return this;
  }

   /**
   * Get jsonData
   * @return jsonData
  **/
  @ApiModelProperty(value = "")
  public Object getJsonData() {
    return jsonData;
  }

  public void setJsonData(Object jsonData) {
    this.jsonData = jsonData;
  }

  public DataSourceListItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataSourceListItem orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @ApiModelProperty(value = "")
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public DataSourceListItem password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DataSourceListItem readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public DataSourceListItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataSourceListItem typeLogoUrl(String typeLogoUrl) {
    this.typeLogoUrl = typeLogoUrl;
    return this;
  }

   /**
   * Get typeLogoUrl
   * @return typeLogoUrl
  **/
  @ApiModelProperty(value = "")
  public String getTypeLogoUrl() {
    return typeLogoUrl;
  }

  public void setTypeLogoUrl(String typeLogoUrl) {
    this.typeLogoUrl = typeLogoUrl;
  }

  public DataSourceListItem url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DataSourceListItem user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSourceListItem dataSourceListItem = (DataSourceListItem) o;
    return Objects.equals(this.access, dataSourceListItem.access) &&
        Objects.equals(this.basicAuth, dataSourceListItem.basicAuth) &&
        Objects.equals(this.database, dataSourceListItem.database) &&
        Objects.equals(this._default, dataSourceListItem._default) &&
        Objects.equals(this.id, dataSourceListItem.id) &&
        Objects.equals(this.jsonData, dataSourceListItem.jsonData) &&
        Objects.equals(this.name, dataSourceListItem.name) &&
        Objects.equals(this.orgId, dataSourceListItem.orgId) &&
        Objects.equals(this.password, dataSourceListItem.password) &&
        Objects.equals(this.readOnly, dataSourceListItem.readOnly) &&
        Objects.equals(this.type, dataSourceListItem.type) &&
        Objects.equals(this.typeLogoUrl, dataSourceListItem.typeLogoUrl) &&
        Objects.equals(this.url, dataSourceListItem.url) &&
        Objects.equals(this.user, dataSourceListItem.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, basicAuth, database, _default, id, jsonData, name, orgId, password, readOnly, type, typeLogoUrl, url, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSourceListItem {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jsonData: ").append(toIndentedString(jsonData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeLogoUrl: ").append(toIndentedString(typeLogoUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

