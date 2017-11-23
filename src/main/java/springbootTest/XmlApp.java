package springbootTest;

import java.util.Locale;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class XmlApp {

	private static final Logger log = LoggerFactory.getLogger(XmlApp.class);
	public static void main(String[] args) {
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		context.registerShutdownHook();
		log.debug("学习依赖注入...");
		log.info("Context = {}", context);
		
		
		DataSource dataSource = (DataSource) context.getBean("dataSource");
		System.out.println("dataSource:  "+dataSource);
		
		XmlBean xmlBean = (XmlBean) context.getBean("xmlBean");
		System.out.println("xmlBean:  "+xmlBean);
		
		XmlBean2 xmlBean2 = (XmlBean2) context.getBean("xmlBean2");
		System.out.println("xmlBean2:  "+xmlBean2);
		
		Locale locale = context.getBean(Locale.class);
		System.out.println(locale);
		
		ComplexObject complexObject = (ComplexObject) context.getBean("complexObject");
		System.out.println("complexObject:  "+complexObject);
		
		
		/**
		 * 作业：同时使用@bean 和xml 生成bean
		 */
//		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);

		context.registerShutdownHook();
		DataSource dataSource2 = (DataSource) context.getBean("dataSource");
		System.out.println("@bean>>>>>dataSource2:"+dataSource2);
		AnnotationBean annotationBean = (AnnotationBean) context.getBean(AnnotationBean.class);
		System.out.println("@bean>>>>>annotationBean:"+annotationBean);
		
		
	}
}
