package hook.tariq.server;

import hook.tariq.server.domain.client.model.Client;
import hook.tariq.server.domain.client.services.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(ServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Autowired
	private ClientService clientService;

	@Override
	public void run(String... args) throws Exception {
		Client client = new Client("Tariq", "Hook", "tariq@gmail.com");
		client = clientService.create(client);
		logger.info(client.toString());
	}
}
