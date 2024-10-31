package co.com.kinsoft.r2dbc.dao.license;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface LicenseDAORepository
        extends ReactiveCrudRepository<LicenseDAO, Long>, ReactiveQueryByExampleExecutor<LicenseDAO> {
}
