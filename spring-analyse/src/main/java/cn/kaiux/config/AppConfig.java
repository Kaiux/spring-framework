package cn.kaiux.config;

import org.springframework.context.annotation.ComponentScan;

/**
 * @author likai.yu
 * @date 2020/1/3 3:56 下午
 */
@ComponentScan("cn.kaiux.test")
public class AppConfig {

	/**
	 * Spring会自动把这个类放到BeanDefinitionMap中，即使不在扫描的范围内
	 * 并且AppConfig类一定会被实例化：
	 * 		后续可能会使用@Bean定义一些bean，而这些bean必须通过方法调用来产生，所以必须先实例化AppConfig
	 */
	public AppConfig() {
		System.out.println("AppConfig inited");
	}
}
