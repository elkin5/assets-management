package co.com.kinsoft.r2dbc.dao.monitor;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MonitorDAORepository
    extends ReactiveCrudRepository<MonitorDAO, Long>, ReactiveQueryByExampleExecutor<MonitorDAO> {
}
