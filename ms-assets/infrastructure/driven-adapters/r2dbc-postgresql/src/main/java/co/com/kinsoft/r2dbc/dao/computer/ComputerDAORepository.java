package co.com.kinsoft.r2dbc.dao.computer;

import co.com.kinsoft.r2dbc.dao.abstractasset.AbstractAssetDAO;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ComputerDAORepository
        extends ReactiveCrudRepository<ComputerDAO, Long>, ReactiveQueryByExampleExecutor<ComputerDAO> {
}
