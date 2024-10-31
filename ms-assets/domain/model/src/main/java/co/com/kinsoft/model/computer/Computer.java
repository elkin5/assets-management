package co.com.kinsoft.model.computer;

import co.com.kinsoft.model.technologyasset.TechnologyAsset;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Computer extends TechnologyAsset {
    private Long computerId;
    private String processor;
    private int ram;
    private int hardDrive;
    private Long technologyAssetIdReference;
}
