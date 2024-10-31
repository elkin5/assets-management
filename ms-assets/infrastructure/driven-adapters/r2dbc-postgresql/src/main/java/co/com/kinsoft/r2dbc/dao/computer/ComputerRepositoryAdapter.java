package co.com.kinsoft.r2dbc.dao.computer;

import co.com.kinsoft.model.computer.Computer;
import co.com.kinsoft.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ComputerRepositoryAdapter
        extends ReactiveAdapterOperations<Computer, ComputerDAO, Long, ComputerDAORepository> {
    public ComputerRepositoryAdapter(ComputerDAORepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Computer.class));
    }
}
