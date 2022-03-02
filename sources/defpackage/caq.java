package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: caq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class caq {
    public boolean a = false;
    public cbd b;
    private final car c;
    private final atjv d;
    private final cbb e;
    private cbc f;
    private cai g;
    private bvt h;
    private jwi i;

    public caq(String str, atjv atjv, cbb cbb, ContextManagerClientInfo contextManagerClientInfo) {
        this.c = car.a(contextManagerClientInfo, str);
        this.d = atjv;
        iva.a((Object) cbb);
        this.e = cbb;
    }

    public final cas a() {
        iva.b(this.a, "At least one of production, retention, or dispatch policy must be set.");
        aucd o = atke.i.o();
        atjv atjv = this.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atke atke = (atke) o.b;
        atke.c = atjv.bA;
        int i2 = atke.a | 2;
        atke.a = i2;
        atkd atkd = this.c.a;
        atkd.getClass();
        atke.h = atkd;
        int i3 = i2 | 64;
        atke.a = i3;
        cbc cbc = this.f;
        if (cbc != null) {
            atkm atkm = cbc.a;
            atkm.getClass();
            atke.e = atkm;
            i3 |= 8;
            atke.a = i3;
        }
        cbd cbd = this.b;
        if (cbd != null) {
            atkp atkp = cbd.a;
            atkp.getClass();
            atke.f = atkp;
            i3 |= 16;
            atke.a = i3;
        }
        cai cai = this.g;
        if (cai != null) {
            atkc atkc = cai.a;
            atkc.getClass();
            atke.g = atkc;
            i3 |= 32;
            atke.a = i3;
        }
        atkh atkh = this.e.a;
        atkh.getClass();
        atke.d = atkh;
        atke.a = i3 | 4;
        cas cas = new cas((atke) o.i(), this.c);
        bvt bvt = this.h;
        if (bvt != null) {
            jwi jwi = this.i;
            iva.a((Object) bvt);
            cas.c = bvt;
            iva.a((Object) jwi);
            cas.d = jwi;
        }
        cai cai2 = this.g;
        if (cai2 != null) {
            cas.e = cai2;
        }
        return cas;
    }

    public final void a(bvt bvt, jwi jwi) {
        iva.a((Object) bvt);
        this.h = bvt;
        if (jwi == null) {
            jwi = jwi.d;
        }
        this.i = jwi;
    }

    public final void a(cai cai) {
        iva.a((Object) cai);
        this.g = cai;
        this.a = true;
    }

    public final void a(cbc cbc) {
        iva.a((Object) cbc);
        this.f = cbc;
        this.a = true;
    }
}
