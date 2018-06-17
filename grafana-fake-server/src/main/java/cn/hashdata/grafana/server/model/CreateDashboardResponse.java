package cn.hashdata.grafana.server.model;

import lombok.Getter;

@Getter
public class CreateDashboardResponse {
  String status;
  String slug;
  int version;
  long id;
  String uid;
  String url;
}
