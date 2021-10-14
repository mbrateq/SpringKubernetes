package pl.sggw.technologiekontenerowe.SpringKubernetes;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Technologie Kontenerowe - projekt zaliczeniowy" ,description = "Aplikacja webowa z generycznym interfejsem openApi do testowania i wizualizacji endPointów", version = "v1"))
public class OpenApi30Config {
    @Value("${server.servlet.context-path:/}")
    private String context;

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .addServersItem(new Server().url(context));
    }
}
