package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: tgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tgf {
    public final Object a;
    private final Class[] b;

    public tgf(Object obj, Class[] clsArr) {
        this.a = obj;
        this.b = clsArr;
    }

    public static tgf a(Object obj) {
        return new tgf(obj, new Class[0]);
    }

    public final Object a(Object... objArr) {
        try {
            return ((Class) this.a).getDeclaredConstructor(this.b).newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw new tgg(e);
        } catch (InstantiationException e2) {
            throw new tgg(e2);
        } catch (NoSuchMethodException e3) {
            throw new tgg(e3);
        } catch (InvocationTargetException e4) {
            throw new tgg(e4);
        } catch (ClassCastException e5) {
            throw new tgg(e5);
        }
    }

    public final tge a(String str, Class... clsArr) {
        try {
            return new tge(this, this.a.getClass().getMethod(str, clsArr));
        } catch (NoSuchMethodException e) {
            throw new tgg(e);
        }
    }

    public final void a(String str, Object obj) {
        try {
            Field declaredField = this.a.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(this.a, obj);
        } catch (NoSuchFieldException e) {
            throw new tgg(e);
        } catch (IllegalAccessException e2) {
            throw new tgg(e2);
        }
    }
}
