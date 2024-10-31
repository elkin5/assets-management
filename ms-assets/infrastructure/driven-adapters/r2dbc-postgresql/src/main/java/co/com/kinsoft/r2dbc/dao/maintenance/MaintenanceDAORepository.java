package co.com.kinsoft.r2dbc.dao.maintenance;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MaintenanceDAORepository
    extends ReactiveCrudRepository<MaintenanceDAO, Long>, ReactiveQueryByExampleExecutor<MaintenanceDAO> {
}
