package org.sid.walletservice;

import org.sid.walletservice.entities.Client;
import org.sid.walletservice.entities.Wallet;
import org.sid.walletservice.repo.ClientRepository;
import org.sid.walletservice.repo.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(ClientRepository clientRepository, WalletRepository walletRepository){
		return args->{
			clientRepository.saveAll(List.of(
					Client.builder().name("Zakia").email("zakia@gmail.com").build(),
					Client.builder().name("Regoug").email("regoug@gmail.com").build(),
					Client.builder().name("hiba").email("hiba@gmail.com").build()
			));
			Random random=new Random();
			clientRepository.findAll().forEach(client -> {
				walletRepository.save(new Wallet(UUID.randomUUID().toString(),random.nextDouble(),new Date(),Math.random()>0.5?"MAD":"EURO",client));
			});
		};


	}
}
