import java.lang.annotation.*;
import java.lang.reflect.*;

public class Reflection {

	public static void main(String[] args) {
		int a, b;

		try {

			Class<?> t = TestClass.class;

			Method[] methods = t.getDeclaredMethods();

			for (Method m : methods) {

				if (m.isAnnotationPresent(Test.class)) {
								
					Test t1 = m.getAnnotation(Test.class);

					m.invoke(null, t1.a(), t1.b());
					
		
				}
			}
			
		} catch (Exception ex) {
			
			ex.printStackTrace();

		}
	}
}
