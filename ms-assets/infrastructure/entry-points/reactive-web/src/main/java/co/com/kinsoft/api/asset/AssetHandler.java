package co.com.kinsoft.api.asset;

import co.com.kinsoft.model.asset.Asset;
import co.com.kinsoft.model.asset.AssetRequest;
import co.com.kinsoft.model.technologyasset.TechnologyAsset;
import co.com.kinsoft.usecase.createasset.CreateAssetUseCase;
import co.com.kinsoft.usecase.findasset.FindAssetUseCase;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

@Component
@RequiredArgsConstructor
@Slf4j
public class AssetHandler {
    private final CreateAssetUseCase createAssetUseCase;
    private final FindAssetUseCase findAssetUseCase;

    public Mono<ServerResponse> listenCreate(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(AssetRequest.class)
//                .map(this::convertToAsset)
                .flatMap(createAssetUseCase::createAsset)
                .flatMap(newAsset -> ServerResponse.ok().body(Mono.just(newAsset), Asset.class))
                .onErrorMap(throwable -> {
                    log.error(throwable.getMessage());
                    return throwable;
                });
    }

    public Mono<ServerResponse> listenFindAll(ServerRequest serverRequest) {
        // useCase2.logic();
        return ServerResponse.ok().bodyValue("");
    }

    private TechnologyAsset convertToAsset(AssetRequest<?> assetRequest) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        objectMapper.setDateFormat(simpleDateFormat);

        return objectMapper.convertValue(assetRequest.getAsset(), TechnologyAsset.class);
    }
}
