package cn.kaiux.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author likai.yu
 * @date 2020/1/3 5:01 下午
 */
@Component
public class MyPostProcessor implements BeanFactoryPostProcessor {

	/**
	 * 可以通过beanFactory拿到所有bean的信息，并且修改
	 * 这些信息存放在beanDefinitionMap中
	 */

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition x = (GenericBeanDefinition) beanFactory.getBeanDefinition("x");
		x.setBeanClass(Y.class);
		System.out.println("post process");
	}
}
