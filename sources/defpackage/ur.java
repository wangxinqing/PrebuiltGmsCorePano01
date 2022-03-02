package defpackage;

/* renamed from: ur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ur implements Runnable {
    final /* synthetic */ uu a;

    public ur(uu uuVar) {
        this.a = uuVar;
    }

    public final void run() {
        this.a.a(true);
        this.a.invalidateSelf();
    }
}
