package tw.Ian.com;

import org.apache.logging.log4j.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    private static Logger logger = LogManager.getLogger(HelloSpringApp.class);
    
     public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
         HelloSpringBean helloSpringBean = (HelloSpringBean) context.getBean("helloBean");
         //System.out.println(helloSpringBean.getMessage());
         logger.info(helloSpringBean);

	}

}
