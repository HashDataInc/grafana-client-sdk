package cn.hashdata.grafana.server.model;

import lombok.Getter;

@Getter
public class SaveDashboardCommand {
  Dashboard dashboard;
  long userId;
  boolean overwrite;
  String message;
  long folderId;
  boolean isFolder;
}
