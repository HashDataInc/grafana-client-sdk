package cn.hashdata.grafana.server.model;

import lombok.Getter;

@Getter
public class Panel {
  String type;
  String title;
  GridPos gridPos;
  int id;
  String mode;
  String content;
}
