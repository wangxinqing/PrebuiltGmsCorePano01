package defpackage;

/* renamed from: umj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class umj implements aora {
    final /* synthetic */ umk a;
    final /* synthetic */ umm b;

    public umj(umm umm, umk umk) {
        this.b = umm;
        this.a = umk;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        usx usx = (usx) obj;
        this.a.a(usx);
        this.b.a((Runnable) new umi(this, usx));
    }

    public final void a(Throwable th) {
        anih anih = (anih) ulh.a.c();
        anih.a(th);
        ((anih) anih.a("umj", "a", 300, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get WebRtcSocket.");
    }
}
