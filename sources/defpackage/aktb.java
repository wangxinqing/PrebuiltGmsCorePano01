package defpackage;

import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: aktb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktb extends akss {
    private final int b;

    public final /* bridge */ /* synthetic */ anui a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        asrg asrg = (asrg) obj;
        anui a = super.a(i, j, placesParams, asrg);
        aucd aucd = (aucd) a.c(5);
        aucd.a((aucj) a);
        aucd o = aofm.d.o();
        int i3 = this.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofm aofm = (aofm) o.b;
        aofm.a |= 1;
        aofm.b = i3;
        if (asrg != null) {
            i2 = asrg.b.size();
        } else {
            i2 = 0;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofm aofm2 = (aofm) o.b;
        aofm2.a |= 2;
        aofm2.c = i2;
        aofm aofm3 = (aofm) o.i();
        aoei aoei = ((anui) aucd.b).c;
        if (aoei == null) {
            aoei = aoei.w;
        }
        aucd aucd2 = (aucd) aoei.c(5);
        aucd2.a((aucj) aoei);
        aodn aodn = ((aoei) aucd2.b).v;
        if (aodn == null) {
            aodn = aodn.q;
        }
        aucd aucd3 = (aucd) aodn.c(5);
        aucd3.a((aucj) aodn);
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodn aodn2 = (aodn) aucd3.b;
        aofm3.getClass();
        aodn2.j = aofm3;
        aodn2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aodn aodn3 = (aodn) aucd3.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoei aoei2 = (aoei) aucd2.b;
        aodn3.getClass();
        aoei2.v = aodn3;
        aoei2.a |= 8388608;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anui anui = (anui) aucd.b;
        aoei aoei3 = (aoei) aucd2.i();
        anui anui2 = anui.p;
        aoei3.getClass();
        anui.c = aoei3;
        anui.a |= 2;
        return (anui) aucd.i();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aktb(defpackage.iyn r12, android.content.Context r13, java.lang.String r14, java.lang.String r15, com.google.android.gms.maps.model.LatLngBounds r16, int r17, java.lang.String r18, com.google.android.gms.location.places.internal.PlacesParams r19) {
        /*
            r11 = this;
            r0 = r17
            asrf r1 = defpackage.asrf.e
            aucd r1 = r1.o()
            r2 = r13
            r3 = r19
            asuu r2 = defpackage.aksd.a((android.content.Context) r13, (com.google.android.gms.location.places.internal.PlacesParams) r3)
            boolean r3 = r1.c
            r4 = 0
            if (r3 != 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            r1.c()
            r1.c = r4
        L_0x001a:
            aucj r3 = r1.b
            asrf r3 = (defpackage.asrf) r3
            r2.getClass()
            r3.b = r2
            int r2 = r3.a
            r2 = r2 | 1
            r3.a = r2
            assd r2 = defpackage.aksd.a((com.google.android.gms.maps.model.LatLngBounds) r16)
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x0032
            goto L_0x0037
        L_0x0032:
            r1.c()
            r1.c = r4
        L_0x0037:
            aucj r3 = r1.b
            asrf r3 = (defpackage.asrf) r3
            r2.getClass()
            r3.c = r2
            int r2 = r3.a
            r2 = r2 | 2
            r3.a = r2
            r2 = r2 | 4
            r3.a = r2
            r3.d = r0
            aucj r1 = r1.i()
            asrf r1 = (defpackage.asrf) r1
            byte[] r7 = r1.k()
            asrg r8 = defpackage.asrg.c
            r9 = 11
            r10 = 10275(0x2823, float:1.4398E-41)
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r15
            r6 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r11
            r1.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aktb.<init>(iyn, android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.maps.model.LatLngBounds, int, java.lang.String, com.google.android.gms.location.places.internal.PlacesParams):void");
    }
}
