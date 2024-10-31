package co.com.kinsoft.r2dbc.dao.computer;

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
@Table("computador")
public class ComputerDAO extends TechnologyAssetDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id")
    private Long computerId;
    @Column("procesador")
    private String processor;
    @Column("ram")
    private int ram;
    @Column("disco_duro")
    private int hardDrive;
    @Column("tecnologico_id")
    private Long technologyAssetIdReference;
}
