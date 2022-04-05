# Backend

### Http 통신 - Request & Response

- 요청 Request, 응답 Response으로 이루어짐

- 클라이언트가 서버에게 요청을 보냄

- 서버는 요청에 대한 응답 결과를 줌

- 클라이언트 사용자에게 응답 받은 결과를 보여줌

  

### Http 패킷

- Http 통신은 요청을 보내고 응답을 받을때 그 정보를 패킷(Packet)에 넣어 보낸다.

- 패킷 구조 : Header / Body

- Header : 보내는 사람의 주소, 받는 사람의 주소, 패킷 생명시간

- Body : 실제 전달하고자 하는 내용

  ![img](https://media.vlpt.us/images/sdc337dc/post/72ffbf58-513d-47b3-a8d3-0d6f0cb5fb52/image.png)

- 요청과 응답에 담겨있는 정보



### Java

접근제한자 :

public - 모두 허용

protected - 같은 패키지 허용, 상속관계 허용

default - 같은 패키지 허용 

private - 같은 클래스 내에서만 허용



```java
public class Main {
    private String hello;

    //Getter
    public String getHello() {
        return hello;
    }

    //Setter
    public void setHello(String hello) {
        this.hello = hello;
    }
}
```

