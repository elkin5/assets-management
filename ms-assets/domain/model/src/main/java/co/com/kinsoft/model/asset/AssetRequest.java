package co.com.kinsoft.model.asset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssetRequest<T> {
    private String type;
    private T asset;
}
