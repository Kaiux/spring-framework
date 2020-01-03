package cn.kaiux.test;

import cn.kaiux.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author likai.yu
 * @date 2020/1/3 3:57 下午
 */

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		/**
		 * 1. spring扫描bean
		 * 2. spring解析bean(BeanDefinition)，有些类不能直接new，比如懒加载的，或者单例的
		 * 3. 存储解析出来的信息到一个map中(DefaultListableBeanFactory::beanDefinitionMap)
		 * 4. 调用BeanFactoryPostProcessor的实现类（如果有的话）
		 * 5. 实例化bean
		 *
		 */

		System.out.println(ac.getBean("x"));
		System.out.println(ac.getBean(Y.class));

	}
}
