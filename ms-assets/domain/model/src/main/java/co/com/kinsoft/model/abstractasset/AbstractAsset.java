package co.com.kinsoft.model.abstractasset;

import co.com.kinsoft.model.asset.Asset;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class AbstractAsset extends Asset {
    private Long abstractAssetId;
    private String url;
    private String abstractState;
    private Long assetIdReference;
}
