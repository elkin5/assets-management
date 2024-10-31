package co.com.kinsoft.r2dbc.dao.abstractasset;

import co.com.kinsoft.model.asset.Asset;
import co.com.kinsoft.r2dbc.dao.asset.AssetDAO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Entity
@Table("abstracto")
public class AbstractAssetDAO extends AssetDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id")
    private Long abstractAssetId;
    @Column("url")
    private String url;
    @Column("estado")
    private String abstractState;
    @Column("activo_id")
    private Long assetIdReference;
}
