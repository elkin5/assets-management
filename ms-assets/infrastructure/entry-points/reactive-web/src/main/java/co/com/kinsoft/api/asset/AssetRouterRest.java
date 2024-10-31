package co.com.kinsoft.api.asset;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class AssetRouterRest {
    private static final String BASE_ROUTE = "/api/asset";

    @Bean
    public RouterFunction<ServerResponse> routerFunction(AssetHandler assetHandler) {
        return route(GET(BASE_ROUTE), assetHandler::listenFindAll)
                .andRoute(POST(BASE_ROUTE), assetHandler::listenCreate);
    }
}
