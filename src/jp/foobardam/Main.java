package jp.foobardam;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;

public class Main {
	public static void print(Object o){
		for(PropertyDescriptor pd : PropertyUtils.getPropertyDescriptors(o)){
			try{
				String propName = pd.getName();
				Object prop = PropertyUtils.getProperty(o, propName);
				String propType = pd.getPropertyType().toString();
				if(!"class java.lang.Class".equals(propType)){
					System.out.format("プロパティ(%s) => %s%n",  propName, prop);
				}
			} catch (IllegalAccessException e){
				e.printStackTrace();
			} catch (InvocationTargetException e){
				e.printStackTrace();
			} catch (NoSuchMethodException e){
				e.printStackTrace();
			}
		}
	}
	
//	public static void main(String[] args) {
//		Person p = new Person("太郎", 28, "090-1234-5678");
//		print(p);
//	}
	
//	public static void main(String[] args) {
//		Company c = new Company("ZONY", "品川", "03-1234-5678");
//		print(c);
//	}

	public static void main(String[] args) {
		Company c = new Company("ZONY", "品川", "03-1234-5678");
		Employee e = new Employee("太郎", 28, "090-1234-5678", c);
		print(e);
	}
}
