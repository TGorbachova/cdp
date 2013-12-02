import java.lang.reflect.*;
import java.lang.annotation.Annotation;

public class reflection {

public static void main(String[] args) {	

	Runner travelTour = new Runner();
	Class someClass  = travelTour.getClass();

	Field[] fields = someClass.getDeclaredFields();
	for (Field field : fields) {
	   System.out.println("\t" + field.getModifiers() + field.getType().toString() + " " + field.getName() + ";");
	}
	
	
	Method[] methods = someClass.getDeclaredMethods();
	for (Method m : methods) {
	   Annotation[] annotations = m.getAnnotations();
	   System.out.print("\t");
	   for (Annotation a : annotations)
	       System.out.print("@" + a.annotationType().getSimpleName() + " ");
	       System.out.println();
	 
	       System.out.print("\t" + m.getModifiers() + m.getReturnType() + " " + m.getName() + "(");
	       System.out.print(m.getParameterTypes());
	       System.out.println(") { }");
	}
	
	
	Constructor[] constructors = someClass.getDeclaredConstructors();
    for (Constructor c : constructors) {
        System.out.println("\t" + c.getModifiers() +
                someClass.getSimpleName() + "(" + 
        		c.getParameterTypes().toString() + ") { }");
    }    
	
    
     
   
   try {
	   Field f1 = someClass.getDeclaredField("tourName");
	   System.out.println(f1);
	  /* f1.set(someClass, "h");
	   
	   String str1 = (String) f1.get(someClass);
		System.out.println("pub field: " + str1);*/
   } catch (Exception e) {
			e.printStackTrace();
		}
   
	}


    
	public reflection() {
		// TODO Auto-generated constructor stub
	}

}
