package OOP2.Them_9_proxi.Laba1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by den on 27.04.17.
 */
public abstract class CalculateProxy implements InvocationHandler{

    private Object object;
    public CalculateProxy(Object target){
        this.object=target;
    }
public Object invoke(Object proxy, Method method, Object[] args)throws Throwable
{
    System.out.println(" the metod" + method.getName() +"**" + Arrays.toString(args));
    Object result =method.invoke(object,args);

    System.out.println("the mrtod the hame "+ result.toString());



    return  result;
}





}
