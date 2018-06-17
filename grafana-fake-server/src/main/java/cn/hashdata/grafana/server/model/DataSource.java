package cn.hashdata.grafana.server.model;

import java.util.Map;
import lombok.Getter;

@Getter
public class DataSource {
  long id;
  long orgId;
  String name;
  String type;
  String typeLogoUrl;
  String access;
  String url;
  String password;
  String user;
  String database;
  boolean basicAuth;
  String basicAuthUser;
  String basicAuthPassword;
  boolean withCredentials;
  boolean isDefault;
  Map<String, Object> jsonData;
  Map<String, Boolean> secureJsonFields;
  int version;
  boolean readOnly;
}
