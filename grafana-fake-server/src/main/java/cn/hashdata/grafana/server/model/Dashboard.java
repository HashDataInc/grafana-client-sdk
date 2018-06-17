package cn.hashdata.grafana.server.model;

import java.util.List;
import lombok.Getter;

// http://docs.grafana.org/reference/dashboard/

@Getter
public class Dashboard {
  Long id;
  String uid;
  String title;
  List<String> tags;
  String style; // theme of dashboard, i.e. dark or light
  String timezone;
  boolean editable;
  boolean hideControls;
  int graphTooltip; // 0 for no shared crosshair or tooltip (default), 1 for shared crosshair, 2 for
                    // shared crosshair AND shared tooltip
  List<Panel> panels;
  Time time;
  TimePicker timepicker;
  Templating templating;
  Annotations annotations;
  String refresh;
  final int schemaVersion = 16;
  int version;
  List<String> links;
}