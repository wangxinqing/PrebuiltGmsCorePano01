package defpackage;

/* renamed from: tnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tnr implements Runnable {
    private final tob a;
    private final asav b;
    private final tny c;

    public tnr(tob tob, asav asav, tny tny) {
        this.a = tob;
        this.b = asav;
        this.c = tny;
    }

    public final void run() {
        tob tob = this.a;
        asav asav = this.b;
        tny tny = this.c;
        if (tob.c.containsKey(asav)) {
            ((anih) tky.a.d()).a("EndpointManager received request to update registration of IncomingOfflineFrameProcessor for frame type %s from %s to %s.", (Object) asav.name(), tob.c.get(asav), (Object) tny);
        }
        tob.c.put(asav, tny);
    }
}
