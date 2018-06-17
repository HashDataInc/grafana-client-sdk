package cn.hashdata.grafana.server.model;

import lombok.Getter;

@Getter
public class CreateFolderCommand {
  String uid;
  String title;
}
