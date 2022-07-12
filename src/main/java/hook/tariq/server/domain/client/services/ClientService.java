package hook.tariq.server.domain.client.services;

import hook.tariq.server.domain.client.exceptions.ClientCreationException;
import hook.tariq.server.domain.client.model.Client;

public interface ClientService {
    Client create(Client client) throws ClientCreationException;
}
