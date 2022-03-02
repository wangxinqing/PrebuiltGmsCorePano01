package defpackage;

/* renamed from: ypu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ypu implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ yqb b;

    public ypu(yqb yqb, int i) {
        this.b = yqb;
        this.a = i;
    }

    public final void run() {
        yqb yqb = this.b;
        yqb.p = 2;
        if (this.a == -1) {
            yqb.f();
        } else {
            yqb.h();
        }
    }
}
