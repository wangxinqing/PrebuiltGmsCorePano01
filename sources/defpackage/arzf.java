package defpackage;

import java.util.concurrent.Callable;

/* renamed from: arzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class arzf implements Callable {
    private final Runnable a;

    public arzf(Runnable runnable) {
        this.a = runnable;
    }

    public final Object call() {
        this.a.run();
        return true;
    }
}
