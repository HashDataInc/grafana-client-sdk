package cn.hashdata.grafana.server.model;

import java.util.List;
import lombok.Getter;

@Getter
public class Templating {
  boolean enable;
  List<TemplateVariable> list;
}
