package cn.hashdata.grafana.server.controller;

import cn.hashdata.grafana.server.model.CreateDashboardResponse;
import cn.hashdata.grafana.server.model.DashboardFullWithMeta;
import cn.hashdata.grafana.server.model.DashboardTagCloudItem;
import cn.hashdata.grafana.server.model.Message;
import cn.hashdata.grafana.server.model.SaveDashboardCommand;
import java.util.List;
import javax.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/dashboards")
public class GrafanaDashboardEndpoint {
  @RequestMapping(path = "/uid/{uid}", method = RequestMethod.GET)
  public DashboardFullWithMeta GetDashboardByUID(@PathVariable String uid) {
    return null;
  }

  @RequestMapping(path = "/db", method = RequestMethod.POST)
  public CreateDashboardResponse CreateAndUpdateDashboard(
      @Valid @RequestBody SaveDashboardCommand request) {
    return null;
  }

  @RequestMapping(path = "/uid/{uid}", method = RequestMethod.DELETE)
  public Message DeleteDashboardByUID(@PathVariable String uid) {
    return null;
  }

  @RequestMapping(path = "/home", method = RequestMethod.GET)
  public DashboardFullWithMeta GetHomeDashboard(@PathVariable String uid) {
    return null;
  }

  @RequestMapping(path = "tags", method = RequestMethod.GET)
  public List<DashboardTagCloudItem> GetDashboardTags() {
    return null;
  }
}
