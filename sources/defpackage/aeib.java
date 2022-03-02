package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: aeib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeib {
    final /* synthetic */ aeic a;
    private final Method b;

    public aeib(aeic aeic, Method method) {
        this.a = aeic;
        this.b = method;
    }

    public final void a(Object... objArr) {
        try {
            this.b.invoke(this.a.a, objArr);
        } catch (IllegalAccessException e) {
            throw new aeid(e);
        } catch (InvocationTargetException e2) {
            throw new aeid(e2);
        }
    }

    public final Object b(Object... objArr) {
        try {
            Object invoke = this.b.invoke(this.a.a, objArr);
            if (invoke != null) {
                return invoke;
            }
            throw new aeid(new NullPointerException());
        } catch (IllegalAccessException e) {
            throw new aeid(e);
        } catch (InvocationTargetException e2) {
            throw new aeid(e2);
        }
    }
}
