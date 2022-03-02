package defpackage;

/* renamed from: abrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrv implements Runnable {
    final /* synthetic */ abrw a;

    public abrv(abrw abrw) {
        this.a = abrw;
    }

    public final void run() {
        abrw abrw = this.a;
        absf absf = abrw.b;
        absr absr = new absr(abrw.a);
        abrw abrw2 = this.a;
        absf.a(absr, abrw2.c, abrw2.d, abrw2.e);
    }
}
