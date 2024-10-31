package co.com.kinsoft.r2dbc.dao.technologyasset;

import co.com.kinsoft.r2dbc.dao.asset.AssetDAO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table("tecnologico")
public class TechnologyAssetDAO extends AssetDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id")
    private Long technologyAssetId;
    @Column("marca")
    private String brand;
    @Column("ubicacion")
    private String location;
    @Column("detalle")
    private String details;
    @Column("fecha_expiracion_garantia")
    private LocalDate warrantyExpirationDate;
    @Column("detalle_garantia")
    private String warrantyDetails;
    @Column("activo_id")
    private Long assetIdReference;
}
