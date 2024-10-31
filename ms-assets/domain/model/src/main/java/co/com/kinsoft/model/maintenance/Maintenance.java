package co.com.kinsoft.model.maintenance;

import co.com.kinsoft.model.furnitureasset.FurnitureAsset;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Maintenance extends FurnitureAsset {
    private Long maintenanceId;
    private String maintenanceResponsible;
    private Long furnitureAssetIdReference;
}
