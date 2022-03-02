package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: agwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agwt implements Runnable {
    private final ExecutionException a;

    public agwt(ExecutionException executionException) {
        this.a = executionException;
    }

    public final void run() {
        throw new RuntimeException(this.a.getCause());
    }
}
