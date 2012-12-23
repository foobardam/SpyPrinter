package jp.foobardam;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;

public class Main {
	public static void main(String[] args) {
		Person p = new Person("太郎", 28, "090-1234-5678");
		for(PropertyDescriptor pd : PropertyUtils.getPropertyDescriptors(p)){
			try{
				String propName = pd.getName();
				Object prop = PropertyUtils.getProperty(p, propName);
				System.out.format("プロパティ(%s) => %s%n",  propName, prop);
			} catch (IllegalAccessException e){
				e.printStackTrace();
			} catch (InvocationTargetException e){
				e.printStackTrace();
			} catch (NoSuchMethodException e){
				e.printStackTrace();
			}
		}
	}
}
