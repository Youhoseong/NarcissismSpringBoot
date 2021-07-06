package hello.core.lifecycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient  {

    private String url;

    public NetworkClient() {
        System.out.println("url = " + url);
    }
    public void setUrl(String url){
        this.url = url;
    }

    public void connect() {
        System.out.println("connect:" + url);

    }

    public void call(String message) {
        System.out.println("call: " + url +" message = " + message);
    }

    //서비스 종료 시 호출
    public void disconnect() {
        System.out.println("close: " + url);
    }

    //의존관계 주입 후 실행 됨
    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("초기화 연결 메시지");
    }

    // 스프링 소멸 전 실행
    @PreDestroy
    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }
}


