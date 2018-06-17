package cn.hashdata.grafana.server.model;

import lombok.Getter;

@Getter
public class DashboardTagCloudItem {
  String term;
  int count;
}
