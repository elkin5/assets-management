package co.com.kinsoft.r2dbc.dao.maintenance;

import co.com.kinsoft.model.maintenance.Maintenance;
import co.com.kinsoft.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MaintenanceRepositoryAdapter
        extends ReactiveAdapterOperations<Maintenance, MaintenanceDAO, Long, MaintenanceDAORepository> {
    public MaintenanceRepositoryAdapter(MaintenanceDAORepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Maintenance.class));
    }
}
