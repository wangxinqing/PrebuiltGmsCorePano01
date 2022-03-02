package defpackage;

import java.util.concurrent.TimeoutException;

/* renamed from: aosl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aosl extends TimeoutException {
    public aosl(String str) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
