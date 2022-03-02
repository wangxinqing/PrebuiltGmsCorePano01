package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: arwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class arwq implements Runnable {
    private final Method a;
    private final Object b;
    private final String c;
    private final aosh d;
    private final String e;

    public arwq(Method method, Object obj, String str, aosh aosh, String str2) {
        this.a = method;
        this.b = obj;
        this.c = str;
        this.d = aosh;
        this.e = str2;
    }

    public final void run() {
        Method method = this.a;
        Object obj = this.b;
        String str = this.c;
        aosh aosh = this.d;
        String str2 = this.e;
        try {
            method.invoke(obj, new Object[]{str});
            aosh.b((Object) true);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            String valueOf = String.valueOf(str2);
            Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("Error! Meet exception when calling ") : "Error! Meet exception when calling ".concat(valueOf), e2);
            aosh.b((Object) false);
        }
    }
}
