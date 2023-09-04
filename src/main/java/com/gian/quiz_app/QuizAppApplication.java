package com.gian.quiz_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

interface Runner {
	void start();
}

@SpringBootApplication
public class QuizAppApplication {

	public static void main(String[] args) {

	}

	@RunThisMethodForApp
	static void startApp(String[] args) {

		Runner appRunner = () -> SpringApplication.run(QuizAppApplication.class, args);

		runnerOfRunner(appRunner);
	}

	static void runnerOfRunner(Runner runner) {
		runner.start();
	}
}
