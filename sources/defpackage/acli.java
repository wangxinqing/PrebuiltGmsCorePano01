package defpackage;

/* renamed from: acli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acli implements Runnable {
    final /* synthetic */ acll a;
    final /* synthetic */ int b;

    public acli(acll acll, int i) {
        this.a = acll;
        this.b = i;
    }

    public final void run() {
        this.a.c(this.b);
    }
}
