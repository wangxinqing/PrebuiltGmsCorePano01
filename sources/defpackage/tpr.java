package defpackage;

/* renamed from: tpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tpr implements Runnable {
    private final tps a;
    private final String b;

    public tpr(tps tps, String str) {
        this.a = tps;
        this.b = str;
    }

    public final void run() {
        tps tps = this.a;
        String str = this.b;
        if (!tps.a.k()) {
            ((anih) tky.a.c()).a("Ignoring lost BluetoothDevice %s because Connections is no longer discovering.", (Object) str);
        } else if (tps.a(tnd.a(str))) {
            ((anih) tky.a.d()).a("Processing lost BluetoothDeviceName %s.", (Object) str);
            tmq tmq = (tmq) tps.d.remove(str);
            if (tmq != null && tps.e.a(tmq)) {
                ((anih) tky.a.d()).a("Lost BluetoothEndpoint for BluetoothDeviceName %s (with EndpointId %s and EndpointInfo %s).", (Object) str, (Object) tmq.b, (Object) tky.a(tmq.c));
                tps.e.c(tps.a, (tms) tmq);
            }
        }
    }
}
