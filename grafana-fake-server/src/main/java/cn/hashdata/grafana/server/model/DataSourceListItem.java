package cn.hashdata.grafana.server.model;

import java.util.Map;
import lombok.Getter;

@Getter
public class DataSourceListItem {
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
  boolean isDefault;
  Map<String, Object> jsonData;
  boolean readOnly;
}
