package cn.hashdata.grafana.server.controller;

import cn.hashdata.grafana.server.model.CreateFolderCommand;
import cn.hashdata.grafana.server.model.Folder;
import cn.hashdata.grafana.server.model.FolderSearchHit;
import cn.hashdata.grafana.server.model.Message;
import cn.hashdata.grafana.server.model.UpdateFolderCommand;
import io.swagger.annotations.ApiResponses;
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
@RequestMapping("/api/folders")
public class GrafanaFolderEndpoint {
  @RequestMapping(method = RequestMethod.GET)
  public List<FolderSearchHit> GetFolders(@RequestParam(required = false) int limit) {
    return null;
  }

  @RequestMapping(path = "/{uid}", method = RequestMethod.GET)
  public Folder GetFolderByUID(@PathVariable String uid) {
    return null;
  }

  @RequestMapping(method = RequestMethod.POST)
  public Folder CreateFolder(@Valid @RequestBody CreateFolderCommand request) {
    return null;
  }

  @RequestMapping(path = "/{uid}", method = RequestMethod.PUT)
  public Folder UpdateFolder(
      @Valid @RequestBody UpdateFolderCommand request, @PathVariable String uid) {
    return null;
  }

  @RequestMapping(path = "/{uid}", method = RequestMethod.DELETE)
  public Message DeleteFolder(@PathVariable String uid) {
    return null;
  }
}
