package com.example.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class StudyApplication {

    public static String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml";


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    public static void main(String[] args){
//        //자바 코드로 톰캣 만들기
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);
//
//        Context context = tomcat.addContext("/", "/");
//
//        //서블릿 등록
//        HttpServlet servelt = new HttpServlet(){
//            @Override
//            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//                PrintWriter writer = resp.getWriter();
//                writer.println("<html><head><title>");
//                writer.println("Hey, Tomcat");
//                writer.println("</title></head>");
//                writer.println("<body><h1>Hello Tomcat</h1></body>");
//                writer.println("</html>");
//            }
//        };
//
//        //서블릿을 톰캣에 등록
//        //hello 요청오면 이 서블릿을 띄워줌
//        String servletName = "helloServlet";
//        tomcat.addServlet("/",servletName, servelt);
//        context.addServletMappingDecoded("/hello",servletName);
//
//        tomcat.start();
//        tomcat.getServer().await();

//        SpringApplication.run(StudyApplication.class, args);

        new SpringApplicationBuilder(StudyApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }

    //http요청을 받기 위하여 connector 만들어 주기
//    @Bean
//    public ServletWebServerFactory serverFactory(){
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
//        return tomcat;
//    }
//
//    private Connector createStandardConnector(){
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setPort(8080);
//        return connector;
//    }

}
