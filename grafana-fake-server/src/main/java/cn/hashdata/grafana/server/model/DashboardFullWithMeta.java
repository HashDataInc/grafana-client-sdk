package cn.hashdata.grafana.server.model;

import lombok.Getter;

@Getter
public class DashboardFullWithMeta {
  DashboardMeta meta;
  Dashboard dashboard;
}
