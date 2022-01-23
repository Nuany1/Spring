package com.lucky.start;


import com.lucky.entity.Person;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * @program: spring
 * @description: debug
 * @author: Loki
 * @create: 2020-12-30 22:03
 **/
public class DebugTest {
	private static final Log log = LogFactory.getLog(DebugTest.class);

	public static void main(String[] args) {
		log.info("Spring-framework debug === begin");
		StopWatch watch = new StopWatch();
		watch.start();
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = ac.getBean("person",Person.class);
		System.out.println(person.getName());
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);

		/* BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		factory.getBean("UserService");*/
		watch.stop();
		double time = (double) watch.getTotalTimeMillis() / 1000.0D;
		log.info("Spring-framework debug === end 时间: "+time);
	}
}
