package cn.hashdata.grafana.server.model;

import java.util.Date;
import lombok.Getter;

@Getter
public class Folder {
  long id;
  String uid;
  String title;
  String url;
  boolean hasAcl;
  boolean canSave;
  boolean canEdit;
  boolean canAdmin;
  String createdBy;
  Date created;
  String updatedBy;
  Date updated;
  int version;
}
