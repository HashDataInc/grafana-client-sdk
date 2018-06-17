package cn.hashdata.grafana.server.model;

import java.util.Map;
import lombok.Getter;

@Getter
public class UpdateDataSourceCommand {
  String name;
  String type;
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
  Map<String, String> jsonData;
  Map<String, String> secureJsonData;
  int version;
  boolean readOnly;
}
