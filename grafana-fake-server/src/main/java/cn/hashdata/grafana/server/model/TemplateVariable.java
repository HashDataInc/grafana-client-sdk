package cn.hashdata.grafana.server.model;

import java.util.List;
import lombok.Getter;

@Getter
public class TemplateVariable {
  String allFormat;
  CurrentSelectedVariable current;
  String datasource;
  boolean includeAll;
  boolean multi;
  String multiFormat;
  String name;
  List<VariableOption> options;
  String query;
  boolean refresh;
  String regex;
  String type;
}
