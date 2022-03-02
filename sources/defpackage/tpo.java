package defpackage;

/* renamed from: tpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tpo implements Runnable {
    private final tpp a;
    private final upv b;

    public tpo(tpp tpp, upv upv) {
        this.a = tpp;
        this.b = upv;
    }

    public final void run() {
        tpp tpp = this.a;
        upv upv = this.b;
        if (!tpp.a.k()) {
            ((anih) tky.a.c()).a("Ignoring lost BlePeripheral %s because we are no longer discovering.", (Object) upv);
            return;
        }
        ((anih) tky.a.d()).a("Processing lost BlePeripheral %s.", (Object) upv);
        tmp tmp = (tmp) tpp.d.remove(upv);
        if (tmp != null) {
            ((anih) tky.a.d()).a("Lost BleEndpoint for BlePeripheral %s (with EndpointId %s and EndpointInfo %s).", (Object) upv, (Object) tmp.b, (Object) tky.a(tmp.c));
            tpp.f.c(tpp.a, (tms) tmp);
        }
        tmq tmq = (tmq) tpp.e.remove(upv);
        if (tmq != null && tpp.f.a(tmq)) {
            ((anih) tky.a.d()).a("Lost BluetoothEndpoint for BlePeripheral %s (with EndpointId %s and EndpointInfo %s).", (Object) upv, (Object) tmq.b, (Object) tky.a(tmq.c));
            tpp.f.c(tpp.a, (tms) tmq);
        }
    }
}
