package hello.container;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

import java.util.Set;

/**
 * resources/META-INF/services/jakarta.servlet.ServletContainerInitializer 파일에 초기화 클래스 경로를 지정함
 * WAS 를 실행할 때, MyContainerInitV1 를 초기화 클래스로 인식 -> 로딩 시점에 실행
 * 서블릿 컨테이너 초기화 인터페이스 구현체
 */
public class MyContainerInitV1 implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("MyContainerInitV1.onStartup");
        System.out.println("set = " + set);
        System.out.println("servletContext = " + servletContext);
    }
}
