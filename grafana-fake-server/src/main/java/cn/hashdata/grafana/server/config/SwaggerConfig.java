package cn.hashdata.grafana.server.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.BasicAuth;
import springfox.documentation.service.Contact;
import springfox.documentation.service.GrantType;
import springfox.documentation.service.OAuth;
import springfox.documentation.service.ResourceOwnerPasswordCredentialsGrant;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
  public static final String SECURITY_SCHEMA_OAUTH2 = "oauth2";
  public static final String AUTHORIZATION_SCOPE_USRE = "ROLE_USER";
  public static final String AUTHORIZATION_SCOPE_USER_DESC = "login as user";
  public static final String AUTHORIZATION_SCOPE_SUPERVISOR = "ROLE_SUPERVISOR";
  public static final String AUTHORIZATION_SCOPE_SUPERVISOR_DESC = "login as supervisor";

  public String tokenUrl = "/oauth/token";

  @Autowired private ServerProperties serverProperties;

  @Bean
  public Docket api() throws MalformedURLException {
    Docket docket = new Docket(DocumentationType.SWAGGER_2)
                        .host("localhost:3000")
                        .select()
                        .apis(RequestHandlerSelectors.any())
                        .paths(PathSelectors.ant("/api/**"))
                        .build()
                        .apiInfo(apiInfo())
                        .securitySchemes(Arrays.asList(securitySchema(),
                            new BasicAuth("basic")))
                        .securityContexts(Arrays.asList(securityContext()));

    return docket;
  }

  @SuppressWarnings("rawtypes")
  private ApiInfo apiInfo() {
    ApiInfo apiInfo = new ApiInfo("Grafana", "Grafana Restful API.", "v1.0", "Terms of service",
        new Contact("Zhanwei Wang", "http://www.hashdata.cn", "wang@hashdata.cn"), "License of API",
        "https://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
    return apiInfo;
  }

  private OAuth securitySchema() throws MalformedURLException {
    AuthorizationScope userScope =
        new AuthorizationScope(AUTHORIZATION_SCOPE_USRE, AUTHORIZATION_SCOPE_USER_DESC);
    AuthorizationScope adminScope =
        new AuthorizationScope(AUTHORIZATION_SCOPE_SUPERVISOR, AUTHORIZATION_SCOPE_SUPERVISOR_DESC);
    GrantType passwordGrant = new ResourceOwnerPasswordCredentialsGrant(tokenUrl);
    return new OAuth(
        SECURITY_SCHEMA_OAUTH2, Arrays.asList(userScope, adminScope), Arrays.asList(passwordGrant));
  }

  private SecurityContext securityContext() {
    return SecurityContext.builder()
        .securityReferences(defaultAuth())
        .forPaths(PathSelectors.regex("/api/.*"))
        .build();
  }

  List<SecurityReference> defaultAuth() {
    AuthorizationScope scope =
        new AuthorizationScope(AUTHORIZATION_SCOPE_USRE, AUTHORIZATION_SCOPE_USER_DESC);
    return Arrays.asList(
        new SecurityReference(SECURITY_SCHEMA_OAUTH2, new AuthorizationScope[] {scope}));
  }

  @Bean
  SecurityConfiguration security() {
    return SecurityConfigurationBuilder.builder()
        .clientId("bad16277-8da4-48ec-963d-b5515af3aa82")
        .realm("realm")
        .appName("Grafana")
        .scopeSeparator(",")
        .additionalQueryStringParams(null)
        .useBasicAuthenticationWithAccessCodeGrant(false)
        .build();
  }
}
