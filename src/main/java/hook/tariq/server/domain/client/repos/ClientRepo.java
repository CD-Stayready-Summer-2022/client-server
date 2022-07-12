package hook.tariq.server.domain.client.repos;

import hook.tariq.server.domain.client.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client, Long> {
}
