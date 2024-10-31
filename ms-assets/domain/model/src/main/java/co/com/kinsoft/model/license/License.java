package co.com.kinsoft.model.license;

import co.com.kinsoft.model.abstractasset.AbstractAsset;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class License extends AbstractAsset {
    private Long licenseId;
    private String provider;
    private LocalDate expirationDate;
    private String licenseState;
    private Long abstractAssetIdReference;
}
