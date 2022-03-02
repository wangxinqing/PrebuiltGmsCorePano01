package defpackage;

/* renamed from: uxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uxm implements asgs {
    private final uxu a;
    private final vgr b;
    private final avch c;
    private final uxl d;

    public uxm(uxu uxu, uxl uxl, vgr vgr, avch avch) {
        this.a = uxu;
        this.d = uxl;
        this.b = vgr;
        this.c = avch;
    }

    public final void a(audx audx) {
        int a2;
        uxu uxu = this.a;
        uxl uxl = this.d;
        vgr vgr = this.b;
        avch avch = this.c;
        asgh asgh = (asgh) audx;
        asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
        asfz asfz = asgh.b;
        if (asfz == null) {
            asfz = asfz.d;
        }
        asgb a3 = asgb.a(asfz.c);
        if (a3 == null) {
            a3 = asgb.OPERATION_STATUS_UNKNOWN;
        }
        int ordinal = a3.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            if (uxl != null) {
                uxu.e.c(new uxr("ScanComplete", uxl, asgh));
            }
        } else if (asgh.c.size() != 0) {
            asgd asgd = (asgd) asgh.c.get(0);
            if ((asgd.a & 4) == 0) {
                tgh tgh = null;
                if (asgd != null && avch == avch.BLUETOOTH_CLASSIC_NAME && (a2 = asgf.a(asgd.b)) != 0 && a2 == 4) {
                    asff asff = asgd.c;
                    if (asff == null) {
                        asff = asff.d;
                    }
                    asfp asfp = asff.b;
                    if (asfp == null) {
                        asfp = asfp.c;
                    }
                    tgh = new tgh(asfp.b);
                }
                if (tgh != null) {
                    arwg arwg = uxu.e;
                    String valueOf = String.valueOf(tgh.a());
                    arwg.c(new uxt(valueOf.length() == 0 ? new String("NearbyDirectMediums.onTokenDetected:") : "NearbyDirectMediums.onTokenDetected:".concat(valueOf), vgr, tgh, avch));
                    return;
                }
                return;
            }
            uxu.e.c(new uxs(uxu, "NearbyDirectMediums.handleBleScanResult", vgr, asgd));
        }
    }
}
