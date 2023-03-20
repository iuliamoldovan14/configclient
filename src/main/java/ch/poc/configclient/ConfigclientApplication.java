package ch.poc.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigclientApplication
{

	@Value("${test.value}")
	private String value;

	public static void main(String[] args)
	{
		SpringApplication.run(ConfigclientApplication.class, args);
	}

	@GetMapping(
		value = "/test",
		produces = MediaType.TEXT_PLAIN_VALUE)
	public String test()
	{
		return String.format("value is %s", value);
	}

}
