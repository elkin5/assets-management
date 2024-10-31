package co.com.kinsoft.model.monitor;

import co.com.kinsoft.model.technologyasset.TechnologyAsset;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Monitor extends TechnologyAsset {
    private Long monitorId;
    private int inches;
    private Long technologyAssetIdReference;
}
