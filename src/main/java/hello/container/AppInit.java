package hello.container;

import jakarta.servlet.ServletContext;

// 애플리케이션 초기화를 진행하려면 먼저 인터페이스를 만들어야 한다.
// 내용과 형식은 상관없고, 인터페이스는 꼭 필요하다.
public interface AppInit {
    void onStartup(ServletContext servletContext);
}
