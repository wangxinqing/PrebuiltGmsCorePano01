package defpackage;

/* renamed from: dco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dco implements ax {
    private final dcv a;

    public dco(dcv dcv) {
        this.a = dcv;
    }

    public final void a(Object obj) {
        boolean z;
        boolean z2;
        dcv dcv = this.a;
        amri amri = (amri) obj;
        if (amri.a()) {
            boolean z3 = false;
            dcv.c = false;
            csl csl = ((dhc) amri.b()).a;
            aqpp b = csl.b();
            if (!jkf.a(dcv.getContext())) {
                z = (b.a & 2) != 0;
            } else {
                z = false;
            }
            if (csl.a.b == 1000) {
                return;
            }
            if (!cyo.a(b) || z || !csl.c() || csl.c) {
                aqsr aC = dcv.a().aC();
                aqsr aqsr = ((dhc) amri.b()).a.a.d;
                if (aqsr == null) {
                    aqsr = aqsr.d;
                }
                dcv.a.b();
                if (cyo.a(b)) {
                    new cyo(b, dcv, dcv.a.c(), dcv.a.d(), new dcr(dcv, aC, aqsr), new dcs(dcv)).a();
                    return;
                }
                dcv.a.b(aC, aqsr);
                dhm dhm = dcv.a;
                dhh c = dcv.a().c();
                int i = ((dhc) amri.b()).b;
                dhl dhl = dhm.c;
                dhk a2 = dhl.a(aC, c);
                dhl.c.add(a2);
                dhd dhd = dhd.BACK;
                int i2 = i - 1;
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 4) {
                        z2 = new dfn().a(dhl.c, dhl.a(aqsr, (dhh) null));
                        if (!z2 && dhl.a(a2, aqsr)) {
                            z3 = true;
                        }
                        dhl.d.b(new dhi(aqsr, (dhh) null, z2, z3));
                        dhl.c();
                    } else if (i2 != 5) {
                        z2 = false;
                        z3 = true;
                        dhl.d.b(new dhi(aqsr, (dhh) null, z2, z3));
                        dhl.c();
                    }
                }
                z2 = new dic().a(dhl.c, dhl.a(aqsr, (dhh) null));
                z3 = true;
                dhl.d.b(new dhi(aqsr, (dhh) null, z2, z3));
                dhl.c();
            }
        }
    }
}
