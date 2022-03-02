package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: jfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jfh implements Runnable {
    private final ExecutionException a;
    private final String b;

    public jfh(ExecutionException executionException, String str) {
        this.a = executionException;
        this.b = str;
    }

    public final void run() {
        ExecutionException executionException = this.a;
        String str = this.b;
        Throwable cause = executionException.getCause();
        if (cause instanceof Error) {
            String valueOf = String.valueOf(str);
            throw new aoqn(valueOf.length() == 0 ? new String("rethrowing error from ") : "rethrowing error from ".concat(valueOf), (Error) cause);
        } else {
            String valueOf2 = String.valueOf(str);
            throw new aosq(valueOf2.length() == 0 ? new String("rethrowing exception from ") : "rethrowing exception from ".concat(valueOf2), cause);
        }
    }
}
