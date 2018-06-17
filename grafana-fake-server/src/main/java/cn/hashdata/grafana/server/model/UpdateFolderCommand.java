package cn.hashdata.grafana.server.model;

import lombok.Getter;

@Getter
public class UpdateFolderCommand {
  String uid;
  String title;
  int version;
  boolean overwrite;
}
