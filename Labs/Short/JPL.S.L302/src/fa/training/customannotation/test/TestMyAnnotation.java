package fa.training.customannotation.test;

import java.lang.reflect.Method;

import fa.training.customannotation.MyAnnotation;
import fa.training.customannotation.MyAnnotationApply;

public class TestMyAnnotation {
    
    /**
     * @param args
     * @throws SecurityException
     * @throws NoSuchMethodException
     */
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        // Access to the annotation
        MyAnnotationApply myAnnotationApply = new MyAnnotationApply();
        Method method = myAnnotationApply.getClass().getMethod("greeting");
        MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
        System.out.println("value:::" + myAnnotation.value());
    }
}
