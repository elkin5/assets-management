package co.com.kinsoft.r2dbc.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "spring.r2bdc-postgres")
public class PostgresqlConnectionProperties {

    private String database;
    private String schema;
    private String username;
    private String password;
    private String host;
    private Integer port;

}
