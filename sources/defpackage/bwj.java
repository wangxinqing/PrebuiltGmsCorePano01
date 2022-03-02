package defpackage;

/* renamed from: bwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bwj implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bwn b;

    public bwj(bwn bwn, Runnable runnable) {
        this.b = bwn;
        this.a = runnable;
    }

    public final void run() {
        this.b.d.a(this.a);
    }
}
