package co.com.kinsoft.r2dbc.dao.fixed;

import co.com.kinsoft.model.furnitureasset.FurnitureAsset;
import co.com.kinsoft.r2dbc.dao.furnitureasset.FurnitureAssetDAO;
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
@Table("fijo")
public class FixedDAO extends FurnitureAssetDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id")
    private Long fixedId;
    @Column("muebleria_id")
    private Long furnitureAssetIdReference;
}
