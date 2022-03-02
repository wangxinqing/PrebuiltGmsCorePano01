package defpackage;

/* renamed from: aiyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiyw implements Runnable {
    final /* synthetic */ aiyz a;

    public aiyw(aiyz aiyz) {
        this.a = aiyz;
    }

    public final void run() {
        aizc aizc = (aizc) this.a.d;
        aizc.a.a(aico.CHRE_AR_AVAILABLE, aizc.j.a());
        aizc.a();
        if (!aizc.c) {
            return;
        }
        if (!aizc.k.a() || !aizc.j.a(aiyr.a(aizc.d, aizc.e))) {
            aizc.h();
        }
    }
}
