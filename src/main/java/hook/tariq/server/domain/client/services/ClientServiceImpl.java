package hook.tariq.server.domain.client.services;

import hook.tariq.server.domain.client.exceptions.ClientCreationException;
import hook.tariq.server.domain.client.model.Client;
import hook.tariq.server.domain.client.repos.ClientRepo;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{
    private ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Client create(Client client) throws ClientCreationException {
        return clientRepo.save(client);
    }
}
