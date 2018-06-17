package cn.hashdata.grafana.server.controller;

import cn.hashdata.grafana.server.model.AddDataSourceCommand;
import cn.hashdata.grafana.server.model.CreateDataSourceResponse;
import cn.hashdata.grafana.server.model.CreateFolderCommand;
import cn.hashdata.grafana.server.model.DataSource;
import cn.hashdata.grafana.server.model.DataSourceListItem;
import cn.hashdata.grafana.server.model.Id;
import cn.hashdata.grafana.server.model.SuccessMessage;
import cn.hashdata.grafana.server.model.Folder;
import cn.hashdata.grafana.server.model.Message;
import cn.hashdata.grafana.server.model.UpdateDataSourceCommand;
import cn.hashdata.grafana.server.model.UpdateFolderCommand;
import java.util.List;
import javax.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/datasources")
public class GrafanaDataSourceEndpoint {
  @RequestMapping(method = RequestMethod.GET)
  public List<DataSourceListItem> GetDataSources() {
    return null;
  }

  @RequestMapping(path = "/{id}", method = RequestMethod.GET)
  public DataSource GetDataSourceByID(@PathVariable Long id) {
    return null;
  }

  @RequestMapping(path = "/name/{name}", method = RequestMethod.GET)
  public DataSource GetDataSourceByName(@PathVariable String name) {
    return null;
  }

  @RequestMapping(path = "/id/{name}", method = RequestMethod.GET)
  public Id GetDataSourceIDByName(@PathVariable String name) {
    return null;
  }

  @RequestMapping(method = RequestMethod.POST)
  public CreateDataSourceResponse AddDataSource(@Valid @RequestBody AddDataSourceCommand request) {
    return null;
  }

  @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
  public CreateDataSourceResponse UpdateDataSource(
      @Valid @RequestBody UpdateDataSourceCommand request, @PathVariable Long id) {
    return null;
  }

  @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
  public SuccessMessage DeleteDataSourceByID(@PathVariable Long id) {
    return null;
  }

  @RequestMapping(path = "/name/{name}", method = RequestMethod.DELETE)
  public SuccessMessage DeleteDataSourceByName(@PathVariable String name) {
    return null;
  }
}
