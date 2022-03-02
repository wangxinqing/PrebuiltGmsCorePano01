package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ahia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ahia implements amqy {
    private final Method a;
    private final Object b;

    public ahia(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    public final Object a(Object obj) {
        try {
            this.a.invoke(this.b, new Object[]{obj});
            return true;
        } catch (InvocationTargetException e) {
            throw ((RuntimeException) e.getCause());
        } catch (Exception e2) {
            Log.e("AndroidStrictMode", "Failed to invoke handleViolation.", e2);
            return false;
        }
    }
}
