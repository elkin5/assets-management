package co.com.kinsoft.model.asset;

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
public class Asset {
    private Long assetId;
    private String responsible;
    private LocalDate purchaseDate;
    private String invoiceNumber;
    private String description;
    private String state;
}
