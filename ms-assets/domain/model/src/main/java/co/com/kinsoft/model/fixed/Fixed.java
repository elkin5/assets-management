package co.com.kinsoft.model.fixed;

import co.com.kinsoft.model.furnitureasset.FurnitureAsset;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Fixed extends FurnitureAsset {
    private Long fixedId;
    private Long furnitureAssetIdReference;
}
