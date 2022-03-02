package defpackage;

/* renamed from: wet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wet implements Runnable {
    private final long a;
    private final wcx b;

    public wet(long j, wcx wcx) {
        this.a = j;
        this.b = wcx;
    }

    public final void run() {
        long j = this.a;
        wcx wcx = this.b;
        ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4156, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timing out reading from NearbyConnection after %d ms. Closing connection.", j);
        wcx.b();
    }
}
