package defpackage;

/* renamed from: wdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdo implements Runnable {
    private final wdp a;
    private final long b;

    public wdo(wdp wdp, long j) {
        this.a = wdp;
        this.b = j;
    }

    public final void run() {
        wdp wdp = this.a;
        ((anih) ((anih) vvj.a.d()).a("wdp", "a", 851, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s timed out for endpoint %s after %d ms.", (Object) "TransferManagerTimeoutAlarm", (Object) wdp.a, (Object) Long.valueOf(this.b));
        wdp.b();
    }
}
