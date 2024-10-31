package co.com.kinsoft.r2dbc.dao.fixed;

import co.com.kinsoft.r2dbc.dao.abstractasset.AbstractAssetDAO;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface FixedDAORepository
        extends ReactiveCrudRepository<FixedDAO, Long>, ReactiveQueryByExampleExecutor<FixedDAO> {
}
