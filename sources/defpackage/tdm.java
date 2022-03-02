package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: tdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tdm implements asgs {
    final /* synthetic */ tdn a;

    public tdm(tdn tdn) {
        this.a = tdn;
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        asem asem = (asem) audx;
        Device a2 = this.a.a(asem);
        if (a2 != null) {
            tdn tdn = this.a;
            tdn.k = a2;
            tdn.o.a();
            tdn tdn2 = this.a;
            asfs asfs = asem.c;
            if (asfs == null) {
                asfs = asfs.f;
            }
            if (tdn2.g) {
                ((anih) ((anih) tdn.s.c()).a("tdn", "a", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("TargetDevice: target device is receiving");
            } else {
                String str = tdn2.u;
                aucd o = asfj.e.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asfj asfj = (asfj) o.b;
                asfs.getClass();
                asfj.b = asfs;
                int i = asfj.a | 1;
                asfj.a = i;
                asfj.d = 3;
                asfj.a = i | 4;
                auay a3 = auay.a(str);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asfj asfj2 = (asfj) o.b;
                a3.getClass();
                asfj2.a |= 2;
                asfj2.c = a3;
                tdn2.a((asfj) o.i());
            }
        }
        asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        asfz asfz = asem.b;
        if (asfz == null) {
            asfz = asfz.d;
        }
        asgb a4 = asgb.a(asfz.c);
        if (a4 == null) {
            a4 = asgb.OPERATION_STATUS_UNKNOWN;
        }
        int ordinal = a4.ordinal();
        if (ordinal == 1) {
            this.a.t = true;
        } else if (ordinal == 3 || ordinal == 4) {
            this.a.t = false;
        }
    }
}
