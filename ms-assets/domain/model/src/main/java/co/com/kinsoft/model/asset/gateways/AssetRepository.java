package co.com.kinsoft.model.asset.gateways;

import co.com.kinsoft.model.asset.AssetRequest;
import reactor.core.publisher.Mono;

public interface AssetRepository {
    Mono<AssetRequest<?>> saveAsset(AssetRequest<?> assetRequest);
}
