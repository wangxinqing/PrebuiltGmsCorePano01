package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: bm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bm extends bp {
    private final Application a;

    public bm(Application application) {
        this.a = application;
    }

    public final bl a(Class cls) {
        if (!p.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            return (bl) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.a});
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
