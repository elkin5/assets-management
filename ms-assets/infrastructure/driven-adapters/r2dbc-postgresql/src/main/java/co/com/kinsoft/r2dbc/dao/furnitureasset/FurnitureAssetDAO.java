package co.com.kinsoft.r2dbc.dao.furnitureasset;

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
@Table("muebleria")
public class FurnitureAssetDAO extends AssetDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id")
    private Long furnitureAssetId;
    @Column("fabricante")
    private String manufacturer;
    @Column("ubicacion")
    private String location;
    @Column("cantidad")
    private int quantity;
    @Column("detalle")
    private String details;
    @Column("estado")
    private String furnitureState;
    @Column("activo_id")
    private Long assetIdReference;
}
