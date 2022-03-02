package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: gw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class gw {
    private static final ou a = new ou();

    static boolean a(ClassLoader classLoader, String str) {
        try {
            return gj.class.isAssignableFrom(d(classLoader, str));
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new gh("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new gh("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    private static Class d(ClassLoader classLoader, String str) {
        Class cls = (Class) a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        a.put(str, cls2);
        return cls2;
    }

    public gj c(ClassLoader classLoader, String str) {
        try {
            return (gj) b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new gh("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new gh("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new gh("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new gh("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
