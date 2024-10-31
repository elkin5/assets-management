package co.com.kinsoft.r2dbc.dao.monitor;

import co.com.kinsoft.r2dbc.dao.technologyasset.TechnologyAssetDAO;
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
@Table("monitor")
public class MonitorDAO extends TechnologyAssetDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id")
    private Long monitorId;
    @Column("pulgadas")
    private int inches;
    @Column("tecnologico_id")
    private Long technologyAssetIdReference;
}
