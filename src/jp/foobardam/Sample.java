package jp.foobardam;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {
	static class SomeBean {
		String str;
		Integer i;
		
		public SomeBean(String str, Integer i) {
			this.str = str;
			this.i = i;
		}
		public String getStr() {
			return str;
		}
		public void setStr(String str) {
			this.str = str;
		}
		public Integer getI() {
			return i;
		}
		public void setI(Integer i) {
			this.i = i;
		}
		
	}
	public static void main(String[] args) {
		List<SomeBean> l = new ArrayList<SomeBean>();
		l.add(new SomeBean("hoge1", 77));
		l.add(new SomeBean("hoge2", 78));
		l.add(new SomeBean("hoge3", 79));
		System.out.println(l);
	}

}