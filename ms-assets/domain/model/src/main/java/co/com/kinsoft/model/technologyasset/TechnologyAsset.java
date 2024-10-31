package co.com.kinsoft.model.technologyasset;

import co.com.kinsoft.model.asset.Asset;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class TechnologyAsset extends Asset {
    private Long technologyAssetId;
    private String brand;
    private String location;
    private String details;
    private LocalDate warrantyExpirationDate;
    private String warrantyDetails;
    private String technologyState;
    private Long assetIdReference;
}
