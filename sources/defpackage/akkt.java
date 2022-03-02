package defpackage;

/* renamed from: akkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akkt implements Runnable {
    final /* synthetic */ aklb a;

    public akkt(aklb aklb) {
        this.a = aklb;
    }

    public final void run() {
        aklb aklb = this.a;
        int i = aklb.c - 1;
        aklb.c = i;
        if (i == 0) {
            aklb.d = -1;
            aklb.a.b();
            aklb.a = null;
            aklb.b.b();
            aklb.b = null;
        }
        int i2 = aklb.c;
        if (i2 < 0) {
            i2 = 0;
        }
        aklb.c = i2;
    }
}
