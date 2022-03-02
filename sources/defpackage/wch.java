package defpackage;

/* renamed from: wch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wch implements Runnable {
    private final wcp a;

    public wch(wcp wcp) {
        this.a = wcp;
    }

    public final void run() {
        wcp wcp = this.a;
        wcp.a.getContentResolver().unregisterContentObserver(wcp.j);
        thp.a(wcp.a, wcp.i);
        ((anih) ((anih) vvj.a.d()).a("wcp", "e", 411, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped listening for contact book changed events.");
    }
}
