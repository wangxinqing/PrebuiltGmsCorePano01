package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: amlr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amlr extends RuntimeException {
    public amlr(String str, StackTraceElement[] stackTraceElementArr) {
        super(str, (Throwable) null);
        setStackTrace(stackTraceElementArr);
    }

    public static void a(Throwable th) {
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        for (amkw b = amlv.b(); b != null; b = b.a()) {
            arrayList.add(new StackTraceElement("tk_trace", b.c(), (String) null, 0));
        }
        apev.a(th, (Throwable) new amlr("", (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
