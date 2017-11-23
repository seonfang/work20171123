package springbootTest;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
/**
 * 使用注解@bean 和 xml 联合生成bean
 * @author seon
 *
 */
@Configuration
@ImportResource("context.xml")
public class AppConfig {
	
	@Bean
	public AnnotationBean annotationBean() {
		AnnotationBean annotationBean = new AnnotationBean();
		annotationBean.setP1(99);
		annotationBean.setP2("Name");
		//调用dataSource方法，该方法是单例模式，可重复调用
		annotationBean.setDataSource(dataSource());
		return annotationBean;
	}

	@Bean(destroyMethod = "close")
	DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.mariadb.jdbc.Driver");
		ds.setUsername("app");
		ds.setPassword("app");
		ds.setUrl("jdbc:mariadb://localhost:3306/app");
		return ds;
	}

}
