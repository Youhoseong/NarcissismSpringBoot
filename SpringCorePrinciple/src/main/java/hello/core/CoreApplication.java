package hello.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 처음 실행 때는 바로 꺼지는게 정상임
// 서버를 넣어야 돼


@SpringBootApplication
public class CoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

}

