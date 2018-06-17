package cn.hashdata.grafana.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GrafanaApplicationTest {

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void testGenerateSwaggerApiDoc() throws IOException {
    String apiDocPath = System.getProperty("api.doc.path");
    Assert.assertNotNull(apiDocPath);
    System.err.println("Dump api docs to " + apiDocPath);

    Object docs = restTemplate.getForEntity("/v2/api-docs", Object.class).getBody();
    Assert.assertNotNull(docs);

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    System.err.println(gson.toJson(docs));

    try (Writer writer = new FileWriter(apiDocPath)) {
      gson.toJson(docs, writer);
    }
  }
}
