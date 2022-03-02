package defpackage;

/* renamed from: wen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wen implements Runnable {
    private final wgu a;

    public wen(wgu wgu) {
        this.a = wgu;
    }

    public final void run() {
        wgu wgu = this.a;
        wgu.o();
        wgu.g.a();
        wcp wcp = wgu.n.b;
        wcp.a((Runnable) new wch(wcp));
        wcp.e.shutdown();
        ((anih) ((anih) vvj.a.d()).a("wcp", "a", 191, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ContactBookUpdater has been shutdown.");
        tid.a(wgu.m.d, "CertificateManagerExecutor");
        wgu.p.a();
        tid.a(wgu.q.a, "alarmExecutor");
        tid.a(wgu.d, "alarmExecutor");
    }
}
