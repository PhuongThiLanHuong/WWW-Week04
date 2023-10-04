package vn.edu.iuh.fit.WWW_Week04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.WWW_Week04.DAO.CandidateDao;
import vn.edu.iuh.fit.WWW_Week04.models.Candidate;

@SpringBootApplication
public class WwwWeek04Application {
	@Autowired
	private CandidateDao candidateDao;
	public static void main(String[] args) {
		//SpringApplication.run(WwwWeek04Application.class, args);
		SpringApplication.run(SpringApplication.run(WwwWeek04Application.class, args).getClass());
	}
	@Bean
	CommandLineRunner testFirst(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				candidateDao.getALL().forEach(System.out::println);
			}
		};
	}

}
