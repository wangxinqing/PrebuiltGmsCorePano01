package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aixg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aixg implements Executor {
    private final aixh a;

    public aixg(aixh aixh) {
        this.a = aixh;
    }

    public final void execute(Runnable runnable) {
        this.a.d.a(runnable);
    }
}
