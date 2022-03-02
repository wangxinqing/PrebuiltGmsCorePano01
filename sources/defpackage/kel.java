package defpackage;

/* renamed from: kel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kel implements Runnable {
    final /* synthetic */ keo a;

    public kel(keo keo) {
        this.a = keo;
    }

    public final void run() {
        keo keo = this.a;
        if (keo.h) {
            keo.d.d();
            this.a.h = false;
        }
    }
}
