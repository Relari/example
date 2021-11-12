package com.pe.relari;

import com.pe.relari.config.DemoConfig;
import com.pe.relari.model.Demo;
import io.reactivex.Single;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private static final String ACTIVE_CODE = "OK";

	private static final Demo DEMO_ACTIVE = new Demo("OK", "active");
	private static final Demo DEMO_INACTIVE = new Demo("ERROR", "inactive");

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}

	void setDemoActive () {
		Single.fromCallable(() -> DEMO_ACTIVE)
				.filter(demo -> ACTIVE_CODE.equals(demo.getCode()))
				.map(demo -> Boolean.TRUE)
				.doOnSuccess(aBoolean -> log.info("Active -> {}", aBoolean.toString()))
				.subscribe();
	}

	void setDemoInactive() {
		Single.fromCallable(() -> DEMO_INACTIVE)
				.filter(demo -> ACTIVE_CODE.equals(demo.getCode()))
				.map(demo -> Boolean.TRUE)
				.switchIfEmpty(Single.just(Boolean.FALSE))
				.doOnSuccess(aBoolean -> log.info("Inactive -> {}", aBoolean.toString()))
				.ignoreElement()
				.subscribe();
	}

	@Autowired
	private DemoConfig demoConfig;

	@Override
	public void run(String... args) throws Exception {

		log.info(demoConfig.getHome());

	}
}
