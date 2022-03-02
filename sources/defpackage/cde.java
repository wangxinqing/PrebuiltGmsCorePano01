package defpackage;

/* renamed from: cde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cde implements Runnable {
    final /* synthetic */ cdg a;

    public cde(cdg cdg) {
        this.a = cdg;
    }

    public final void run() {
        cdg cdg = this.a;
        cdg.r.registerListener(cdg.m, cdg.t, 3);
    }
}
