package defpackage;

/* renamed from: kek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kek implements Runnable {
    final /* synthetic */ keo a;

    public kek(keo keo) {
        this.a = keo;
    }

    public final void run() {
        keo keo = this.a;
        if (!keo.h) {
            keo.d.c();
            this.a.h = true;
        }
    }
}
