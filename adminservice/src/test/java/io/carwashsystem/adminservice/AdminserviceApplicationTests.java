package io.carwashsystem.adminservice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import io.carwashsystem.adminservice.model.AdminDetails;
import io.carwashsystem.adminservice.repo.AdminRepository;
import io.carwashsystem.adminservice.service.AdminService;



@RunWith(SpringRunner.class)
@SpringBootTest
class AdminserviceApplicationTests {

	@Autowired
	private AdminService service;

	@MockBean
	private AdminRepository repository;
	@Test
	public void getAdminsTest() {
		when(repository.findAll()).thenReturn(Stream
				.of(new AdminDetails(0,"Shamanth"),
						new AdminDetails(1, "Ravi")).collect(Collectors.toList()));
		assertEquals(2, service.getadmin().size());
	}

}
