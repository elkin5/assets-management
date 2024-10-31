package co.com.kinsoft.r2dbc.dao.monitor;

import co.com.kinsoft.model.monitor.Monitor;
import co.com.kinsoft.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MonitorRepositoryAdapter
        extends ReactiveAdapterOperations<Monitor, MonitorDAO, Long, MonitorDAORepository> {
    public MonitorRepositoryAdapter(MonitorDAORepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Monitor.class));
    }
}
