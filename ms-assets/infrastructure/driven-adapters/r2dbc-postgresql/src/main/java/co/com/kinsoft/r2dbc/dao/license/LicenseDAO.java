package co.com.kinsoft.r2dbc.dao.license;

import co.com.kinsoft.model.abstractasset.AbstractAsset;
import co.com.kinsoft.r2dbc.dao.abstractasset.AbstractAssetDAO;
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
@Table("licencia")
public class LicenseDAO extends AbstractAssetDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id")
    private Long licenseId;
    @Column("proveedor")
    private String provider;
    @Column("fecha_vencimiento")
    private LocalDate expirationDate;
    @Column("estado")
    private String licenseState;
    @Column("activo_id")
    private Long abstractAssetIdReference;
}
