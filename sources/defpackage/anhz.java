package defpackage;

/* renamed from: anhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anhz extends Exception {
    public anhz(Throwable th, anig anig, StackTraceElement[] stackTraceElementArr) {
        super(anig.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    public final Throwable fillInStackTrace() {
        return this;
    }
}
