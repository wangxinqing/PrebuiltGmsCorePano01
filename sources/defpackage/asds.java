package defpackage;

import com.google.android.gms.beacon.BleSettings;

/* renamed from: asds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asds extends asjt {
    public final gth a;
    final asjt b = new asdr(this, "BleScanStopped", new asjt[0]);
    public boolean c;
    final /* synthetic */ asdu d;
    private final BleSettings f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asds(asdu asdu, gth gth, BleSettings bleSettings) {
        super("BleScanning", asdu.e, asdu.g, asdu.k);
        this.d = asdu;
        this.a = gth;
        this.f = bleSettings;
        this.c = false;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        boolean a2 = this.d.b.a(this.f, this.a);
        this.c = a2;
        return a2;
    }

    public final long d() {
        auyy auyy = this.d.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
