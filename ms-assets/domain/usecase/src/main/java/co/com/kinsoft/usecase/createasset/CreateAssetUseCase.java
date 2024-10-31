package co.com.kinsoft.usecase.createasset;

import co.com.kinsoft.model.asset.AssetRequest;
import co.com.kinsoft.model.asset.gateways.AssetRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CreateAssetUseCase {
    private final AssetRepository assetRepository;

    public Mono<AssetRequest<?>> createAsset(AssetRequest<?> assetRequest) {
        return assetRepository.saveAsset(assetRequest);
    }
}
