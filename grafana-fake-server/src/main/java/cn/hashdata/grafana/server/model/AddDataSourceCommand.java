package cn.hashdata.grafana.server.model;

import java.util.Map;
import lombok.Getter;

@Getter
public class AddDataSourceCommand {
  String name;
  String type;
  String access;
  String url;
  String password;
  String database;
  String user;
  boolean basicAuth;
  String basicAuthUser;
  String basicAuthPassword;
  boolean withCredentials;
  boolean isDefault;
  Map<String, String> jsonData;
  Map<String, String> secureJsonData;
  boolean readOnly;
}
