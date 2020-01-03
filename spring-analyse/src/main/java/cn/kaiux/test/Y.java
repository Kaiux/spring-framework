package cn.kaiux.test;

import org.springframework.stereotype.Component;

/**
 * @author likai.yu
 * @date 2020/1/3 3:57 下午
 */
public class Y {

	public Y() {
		System.out.println("Y inited");
	}

	@Override
	public String toString() {
		return "=====Y=====";
	}

}
