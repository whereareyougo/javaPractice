package PayCode;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.TreeMap;

import com.sun.mirror.declaration.MethodDeclaration;

public class Test {
	
//	public static Map<Object, Object> object2Map(Object object){
//		Map<String, Object> data = new TreeMap<>();
//		try {
//			BeanInfo info = Introspector.getBeanInfo(object.getClass(),Introspector.IGNORE_ALL_BEANINFO);
//			PropertyDescriptor[] descriptors = info.getPropertyDescriptors();
//			for (PropertyDescriptor pd : descriptors) {
//				  // 将 驼峰式写法转成下划线写法
//                String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, pd.getName());
//                Object value = pd.getReadMethod().invoke(object);
//                if ("class".equals(name) || value == null)
//                    continue;
//                data.put(name, value);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return null;
//	}
//	
//    public static <T> T map2Object(Class<T> clazz, Map<String, Object> data) {
//        try {
//            T object = clazz.newInstance();
//            BeanInfo info = Introspector.getBeanInfo(object.getClass(), Introspector.IGNORE_ALL_BEANINFO);
//            PropertyDescriptor[] descriptors = info.getPropertyDescriptors();
//            for (PropertyDescriptor pd : descriptors) {
//                String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, pd.getName());
//
//                Object value = data.get(name);
//                if (value == null)
//                    continue;
//                pd.getWriteMethod().invoke(object, value);
//
//            }
//            return object;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
	
	public static void main(String[] args) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		 System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "orderId")); // order_id
//	        PayOrderParam param = new PayOrderParam();
//	        param.setAppid("124");
//	        param.setOutTradeNo("v");
//
//	        Map<String, Object> map = object2Map(param);
//	        System.out.println(map);
//
//	        System.out.println(map2Object(PayOrderParam.class, map).getOutTradeNo());
		PerSonBean perSonBean = new PerSonBean();
		perSonBean.setName("测试");
		perSonBean.setAge(11);
		BeanInfo beanInfo = Introspector.getBeanInfo(perSonBean.getClass());
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
			System.out.println("====:"+propertyDescriptor.getName()+","+propertyDescriptor.getReadMethod().invoke(perSonBean));
		}
		MethodDescriptor[] methodDeclarations = beanInfo.getMethodDescriptors();
		for (MethodDescriptor methodDescriptor : methodDeclarations) {
			System.out.println("="+methodDescriptor.getName());
		}
	}

}
