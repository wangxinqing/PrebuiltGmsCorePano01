package defpackage;

/* renamed from: acax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acax implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ acbb b;

    public acax(acbb acbb, int i) {
        this.b = acbb;
        this.a = i;
    }

    public final void run() {
        this.b.e.a(this.a);
    }
}
