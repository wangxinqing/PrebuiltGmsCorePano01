package defpackage;

/* renamed from: bafb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bafb implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ bafs b;

    public bafb(bafs bafs, int i) {
        this.b = bafs;
        this.a = i;
    }

    public final void run() {
        this.b.d.c(this.a);
    }
}
