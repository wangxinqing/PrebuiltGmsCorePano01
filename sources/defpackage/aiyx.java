package defpackage;

/* renamed from: aiyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiyx implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ aiyz b;

    public aiyx(aiyz aiyz, int i) {
        this.b = aiyz;
        this.a = i;
    }

    public final void run() {
        aiyy aiyy = this.b.d;
        int i = this.a;
        aizc aizc = (aizc) aiyy;
        aizc.a.a(aico.CHRE_AR_UNAVAILABLE, i);
        StringBuilder sb = new StringBuilder(43);
        sb.append("NanoApp unavailable, unloadType=");
        sb.append(i);
        sb.toString();
        if (i == 2) {
            aizc.h();
        }
    }
}
