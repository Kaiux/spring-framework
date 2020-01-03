package cn.kaiux.test;

import org.springframework.stereotype.Component;

/**
 * @author likai.yu
 * @date 2020/1/3 3:57 下午
 */
@Component
public class X {

	public X(){
		System.out.println("X inited");
	}

	@Override
	public String toString(){
		return "=====X=====";
	}

}
