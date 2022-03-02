package defpackage;

/* renamed from: poh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class poh implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ String b;

    public poh(Runnable runnable, String str) {
        this.a = runnable;
        this.b = str;
    }

    public final void run() {
        this.a.run();
    }

    public final String toString() {
        return this.b;
    }
}
