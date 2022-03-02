package defpackage;

/* renamed from: akqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqt implements Runnable {
    final /* synthetic */ akra a;

    public akqt(akra akra) {
        this.a = akra;
    }

    public final void run() {
        akra akra = this.a;
        int i = akra.a - 1;
        akra.a = i;
        if (i == 0) {
            akra.b = -1;
            akra.g.b();
            akra.g = null;
            akra.h.b();
            akra.h = null;
        }
        akra.a = Math.max(0, akra.a);
    }
}
