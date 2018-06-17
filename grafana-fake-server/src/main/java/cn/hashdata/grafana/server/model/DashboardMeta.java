package cn.hashdata.grafana.server.model;

import java.util.Date;
import lombok.Getter;

@Getter
public class DashboardMeta {
  boolean isStarred;
  boolean isHome;
  boolean isSnapshot;
  String type;
  boolean canSave;
  boolean canEdit;
  boolean canAdmin;
  boolean canStar;
  String slug;
  String url;
  Date expires;
  Date created;
  Date updated;
  String updatedBy;
  String createdBy;
  int version;
  boolean hasAcl;
  boolean isFolder;
  long folderId;
  String folderTitle;
  String folderUrl;
  boolean provisioned;
}
