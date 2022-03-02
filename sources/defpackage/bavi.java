package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bavi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavi implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    public bavi(Executor executor, int i, boolean z, int i2) {
        this.a = executor;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    public final void execute(Runnable runnable) {
        this.a.execute(new bavc(this, runnable));
    }
}
