package defpackage;

/* renamed from: tns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tns implements Runnable {
    private final tob a;
    private final asav b;
    private final tny c;

    public tns(tob tob, asav asav, tny tny) {
        this.a = tob;
        this.b = asav;
        this.c = tny;
    }

    public final void run() {
        tob tob = this.a;
        asav asav = this.b;
        tny tny = this.c;
        if (!tob.c.containsKey(asav)) {
            return;
        }
        if (tob.c.get(asav) != tny) {
            ((anih) tky.a.d()).a("EndpointManager cannot unregister IncomingOfflineFrameProcessor %s because it is not registered for frame type %s.", (Object) tny, (Object) asav);
        } else {
            tob.c.remove(asav);
        }
    }
}
