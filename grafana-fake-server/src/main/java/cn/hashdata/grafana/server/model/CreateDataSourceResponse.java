package cn.hashdata.grafana.server.model;

import lombok.Getter;

@Getter
public class CreateDataSourceResponse {
  String message;
  long id;
  String name;
  DataSource datasource;
}
