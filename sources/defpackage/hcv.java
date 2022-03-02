package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: hcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hcv {
    private static final iwd c = gzk.a("RequestGenerator");
    public final gzr a;
    public final gzo b;
    private final hct d;

    public hcv(awdn awdn, awdn awdn2, awdn awdn3, awdn awdn4, awdn awdn5, awdn awdn6, awdn awdn7, awdn awdn8, awdn awdn9, awdn awdn10, awdn awdn11, awdn awdn12, awdn awdn13, awdn awdn14, awdn awdn15, awdn awdn16, awdn awdn17, awdn awdn18, awdn awdn19, awdn awdn20, awdn awdn21, awdn awdn22, gwr gwr, hct hct) {
        gwr gwr2 = gwr;
        this.d = hct;
        aucd o = gzo.d.o();
        amsn b2 = amsn.b(ampt.a);
        aucd o2 = gzr.A.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        gzr gzr = (gzr) o2.b;
        gzr.a |= 32768;
        gzr.r = 0;
        had had = (had) awdn2.a();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        gzr gzr2 = (gzr) o2.b;
        had.getClass();
        gzr2.l = had;
        gzr2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        gzr.a(gzr2);
        if (a(1)) {
            amri amri = (amri) awdn10.a();
            if (amri.a()) {
                String str = (String) amri.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                gzr gzr3 = (gzr) o2.b;
                str.getClass();
                gzr3.a |= 1;
                gzr3.b = str;
            }
        }
        if (a(10)) {
            amri amri2 = (amri) awdn15.a();
            if (amri2.a()) {
                String str2 = (String) amri2.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                gzr gzr4 = (gzr) o2.b;
                str2.getClass();
                gzr4.a |= 2;
                gzr4.c = str2;
            }
        }
        if (a(9)) {
            Iterable iterable = (Iterable) awdn13.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr5 = (gzr) o2.b;
            gzr5.a();
            auab.a(iterable, (List) gzr5.d);
        }
        if (a(19)) {
            Iterable iterable2 = (Iterable) awdn14.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr6 = (gzr) o2.b;
            gzr6.b();
            auab.a(iterable2, (List) gzr6.e);
        }
        if (a(16)) {
            amri amri3 = (amri) awdn17.a();
            if (amri3.a()) {
                String str3 = (String) amri3.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                gzr gzr7 = (gzr) o2.b;
                str3.getClass();
                gzr7.a |= 4;
                gzr7.f = str3;
            }
        }
        if (a(17)) {
            amri amri4 = (amri) awdn9.a();
            if (amri4.a()) {
                String str4 = (String) amri4.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                gzr gzr8 = (gzr) o2.b;
                str4.getClass();
                gzr8.a |= 8;
                gzr8.g = str4;
            }
        }
        if (a(3)) {
            String str5 = (String) awdn8.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr9 = (gzr) o2.b;
            str5.getClass();
            gzr9.a |= 64;
            gzr9.j = str5;
        }
        if (a(15)) {
            Iterable iterable3 = (Iterable) awdn16.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr10 = (gzr) o2.b;
            gzr10.d();
            auab.a(iterable3, (List) gzr10.p);
        }
        if (a(22)) {
            amri amri5 = (amri) awdn20.a();
            if (amri5.a()) {
                int intValue = ((Integer) amri5.b()).intValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                gzr gzr11 = (gzr) o2.b;
                gzr11.a |= 131072;
                gzr11.s = intValue;
            }
        }
        if (a(2)) {
            long longValue = ((Long) awdn3.a()).longValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr12 = (gzr) o2.b;
            gzr12.a = 16 | gzr12.a;
            gzr12.h = longValue;
        }
        if (a(7)) {
            long longValue2 = ((Long) awdn12.a()).longValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr13 = (gzr) o2.b;
            gzr13.a |= 32;
            gzr13.i = longValue2;
        }
        if (a(13)) {
            long longValue3 = ((Long) awdn18.a()).longValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr14 = (gzr) o2.b;
            gzr14.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            gzr14.o = longValue3;
        }
        if (a(6)) {
            String str6 = (String) awdn11.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr15 = (gzr) o2.b;
            str6.getClass();
            gzr15.a |= 128;
            gzr15.k = str6;
        }
        if (a(12) && ((amri) awdn19.a()).a()) {
            String str7 = (String) ((amri) awdn19.a()).b();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr16 = (gzr) o2.b;
            str7.getClass();
            gzr16.a |= 2048;
            gzr16.n = str7;
        }
        if (a(11)) {
            Iterable iterable4 = (Iterable) awdn.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr17 = (gzr) o2.b;
            gzr17.c();
            auab.a(iterable4, (List) gzr17.m);
        }
        if (a(18)) {
            haa haa = (haa) awdn21.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr18 = (gzr) o2.b;
            haa.getClass();
            gzr18.q = haa;
            gzr18.a |= 16384;
        }
        if (a(23)) {
            amri amri6 = (amri) awdn22.a();
            if (amri6.a()) {
                gzv gzv = (gzv) amri6.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                gzr gzr19 = (gzr) o2.b;
                gzv.getClass();
                gzr19.t = gzv;
                gzr19.a |= 262144;
            }
        }
        if (a(24) && Math.random() < awrq.q() && ((amri) awdn7.a()).a()) {
            amsn b3 = amsn.b(ampt.a);
            String str8 = (String) ((amri) awdn7.a()).b();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr20 = (gzr) o2.b;
            str8.getClass();
            gzr20.a |= 524288;
            gzr20.u = str8;
            b3.e();
            long a2 = b3.a(TimeUnit.MILLISECONDS);
            if (o.c) {
                o.c();
                o.c = false;
            }
            gzo gzo = (gzo) o.b;
            gzo.a = 2 | gzo.a;
            gzo.c = a2;
        }
        if (a(25) && ((amri) awdn5.a()).a()) {
            String str9 = (String) ((amri) awdn5.a()).b();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr21 = (gzr) o2.b;
            str9.getClass();
            gzr21.a |= 1048576;
            gzr21.v = str9;
        }
        if (a(26)) {
            gzq gzq = (gzq) awdn6.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr22 = (gzr) o2.b;
            gzr22.w = gzq.d;
            gzr22.a |= 2097152;
        }
        if (a(27)) {
            amri amri7 = (amri) awdn4.a();
            if (amri7.a()) {
                gzt gzt = (gzt) amri7.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                gzr gzr23 = (gzr) o2.b;
                gzt.getClass();
                gzr23.x = gzt;
                gzr23.a |= 4194304;
            }
        }
        if (a(29)) {
            boolean z = gwr2.c;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr24 = (gzr) o2.b;
            gzr24.a |= 8388608;
            gzr24.y = z;
        }
        if (a(30)) {
            boolean z2 = gwr2.k;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr25 = (gzr) o2.b;
            gzr25.a |= 16777216;
            gzr25.z = z2;
        }
        b2.e();
        long a3 = b2.a(TimeUnit.MILLISECONDS);
        if (o.c) {
            o.c();
            o.c = false;
        }
        gzo gzo2 = (gzo) o.b;
        gzo2.a |= 1;
        gzo2.b = a3;
        this.a = (gzr) o2.i();
        this.b = (gzo) o.i();
    }

    private final boolean a(int i) {
        boolean a2 = this.d.a(gzr.class, i);
        c.b("Field %d of AndroidCheckinRequest is allowed: %s.", Integer.valueOf(i), Boolean.valueOf(a2));
        return a2;
    }
}
