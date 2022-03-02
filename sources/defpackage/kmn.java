package defpackage;

import com.google.android.gms.drive.events.ChangeEvent;
import java.util.Map;

/* renamed from: kmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kmn implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ kmp c;

    public kmn(kmp kmp, boolean z, boolean z2) {
        this.c = kmp;
        this.a = z;
        this.b = z2;
    }

    public final void run() {
        boolean z;
        iva.a(this.c.c());
        Map map = this.c.b;
        if (map != null) {
            int i = 0;
            for (krl e : map.values()) {
                if (e.e() != null) {
                    i++;
                }
            }
            this.c.a.J = i;
        }
        kmp kmp = this.c;
        lgs lgs = kmp.d;
        kmh kmh = kmp.c;
        if (kmh.ao) {
            lgs.a.a((kqi) kmh);
        } else if (kmh.b != null) {
            kmh a2 = lgs.a.a(new kkz("", kmh.a), kmh.b);
            if (a2 == null) {
                lgs.a.a((kqi) kmh);
            } else {
                lgs.a.a((kqi) a2);
                kmh = a2;
            }
        } else {
            lgs.a.a((kqi) kmh);
        }
        kmp.c = kmh;
        kmp kmp2 = this.c;
        kmy kmy = kmp2.a;
        long j = kmy.ae;
        int i2 = 1;
        if (j < 0) {
            long j2 = kmp2.c.m;
            iva.a(j < 0);
            iva.b(j2 >= 0);
            kmy.ae = j2;
        }
        kmp kmp3 = this.c;
        lgs lgs2 = kmp3.d;
        kmy kmy2 = kmp3.a;
        boolean z2 = this.a;
        iva.a(kmy2.ae >= 0);
        lgs2.a.a(kmy2, z2);
        if (!lgs2.b.a()) {
            kkx kkx = lgs2.b;
            long j3 = kmy2.ae;
            iva.a(!kkx.a());
            if (j3 >= 0) {
                z = true;
            } else {
                z = false;
            }
            iva.b(z);
            kkx.a = Long.valueOf(j3);
        }
        Map map2 = this.c.b;
        if (map2 != null) {
            for (krl c2 : map2.values()) {
                c2.c();
            }
            this.c.b = null;
        }
        if (this.b) {
            kmp kmp4 = this.c;
            if (kmp4.A() || !kmp4.af()) {
                i2 = 4;
            } else {
                kmy kmy3 = kmp4.a;
                if (kmy3.al) {
                    kmy3.al = false;
                    i2 = 3;
                }
            }
            kmp4.e.execute(new kml(new ChangeEvent(kmp4.g(), i2), kmp4.a()));
            if (!this.a) {
                kmp kmp5 = this.c;
                kmp5.e.execute(new kmm(kmp5.g()));
            }
        }
    }
}
