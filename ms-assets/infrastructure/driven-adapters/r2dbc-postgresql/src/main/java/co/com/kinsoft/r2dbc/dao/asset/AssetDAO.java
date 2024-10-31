package co.com.kinsoft.r2dbc.dao.asset;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table("activo")
public class AssetDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id")
    private Long assetId;
    @Column("responsable")
    private String responsible;
    @Column("fecha_compra")
    private LocalDate purchaseDate;
    @Column("numero_factura")
    private String invoiceNumber;
    @Column("descripcion")
    private String description;
    @Column("estado")
    private String state;
}
