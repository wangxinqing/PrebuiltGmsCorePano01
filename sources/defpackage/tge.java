package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: tge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tge {
    final /* synthetic */ tgf a;
    private final Method b;

    public tge(tgf tgf, Method method) {
        this.a = tgf;
        this.b = method;
    }

    public final Object a(Object... objArr) {
        try {
            return this.b.invoke(this.a.a, objArr);
        } catch (IllegalAccessException e) {
            throw new tgg(e);
        } catch (InvocationTargetException e2) {
            throw new tgg(e2);
        }
    }
}
