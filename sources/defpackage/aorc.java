package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aorc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aorc implements Callable {
    final /* synthetic */ Runnable a;

    public aorc(Runnable runnable) {
        this.a = runnable;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.a.run();
        return null;
    }
}
