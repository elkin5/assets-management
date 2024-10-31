package co.com.kinsoft.model.furnitureasset;

import co.com.kinsoft.model.asset.Asset;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class FurnitureAsset extends Asset {
    private Long furnitureAssetId;
    private String manufacturer;
    private String location;
    private int quantity;
    private String details;
    private String furnitureState;
    private Long assetIdReference;
}
